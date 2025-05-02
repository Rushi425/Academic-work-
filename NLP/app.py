from flask import Flask, render_template, request, jsonify
import nltk
from nltk.sentiment.vader import SentimentIntensityAnalyzer

# Download VADER lexicon if not already downloaded
try:
    nltk.data.find('sentiment/vader_lexicon.zip')
except LookupError:
    print("Downloading VADER lexicon...")
    nltk.download('vader_lexicon')


app = Flask(__name__)
sid = SentimentIntensityAnalyzer()

@app.route('/')
def index():
    return render_template('index.html')

@app.route('/predict', methods=['POST'])
def predict():
    if not request.json or 'text' not in request.json:
        return jsonify({'error': 'No text provided'}), 400

    text = request.json.get('text')
    if not text:
        return jsonify({'error': 'Text cannot be empty'}), 400

    scores = sid.polarity_scores(text)
    compound = scores['compound']

    if compound >= 0.05:
        sentiment = 'Positive'
    elif compound <= -0.05:
        sentiment = 'Negative'
    else:
        sentiment = 'Neutral'

    return jsonify({
        'text': text,
        'sentiment': sentiment,
        'scores': scores
    })

if __name__ == '__main__':
    app.run(debug=True) 