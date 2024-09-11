
#include <iostream>
#include <string>
using namespace std;

const int MAX_SIZE = 100;

struct Product {
    int product_id;
    string product_name;
    double product_price;
    double gst;
};


Product productList[MAX_SIZE]; 
int listSize = 0; 

void insert(Product product) {
    if (listSize >= MAX_SIZE) {
        cout << "List is full. " << endl;
        return;
    }
    productList[listSize++] = product;
    cout << "Product inserted " << endl;
}

void remove(int id) {
    int index = -1;
    for (int i = 0; i < listSize; ++i) {
        if (productList[i].product_id == id) {
            index = i;
            break;
        }
    }
    if (index == -1) {
        cout << "Product not found with ID: " << id << endl;
        return;
    }
    for (int i = index; i < listSize - 1; ++i) {
        productList[i] = productList[i + 1];
    }
    --listSize;
    cout << "Product with ID " << id << " deleted successfully!" << endl;
}


void search(int id) {
    for (int i = 0; i < listSize; ++i) {
        if (productList[i].product_id == id) {
            cout << "Product found:" << endl;
            cout << "ID: " << productList[i].product_id << endl;
            cout << "Name: " << productList[i].product_name << endl;
            cout << "Price: " << productList[i].product_price << endl;
            cout << "GST: " << productList[i].gst << endl;
            return;
        }
    }
    cout << "Product not found with ID: " << id << endl;
}

void display() {
    if (listSize == 0) {
        cout << "List is empty." << endl;
        return;
    }
    cout << "Products in the list:" << endl;
    for (int i = 0; i < listSize; ++i) {
        cout << "ID: " << productList[i].product_id << ", ";
        cout << "Name: " << productList[i].product_name << ", ";
        cout << "Price: " << productList[i].product_price << ", ";
        cout << "GST: " << productList[i].gst << endl;
    }
}

int main() {
    int choice;
    do {
        cout << "\nMenu:\n";
        cout << "1. Insert a product\n";
        cout << "2. Delete a product\n";
        cout << "3. Search for a product\n";
        cout << "4. Display all products\n";
        cout << "5. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1: {
                Product product;
                cout << "Enter product ID: ";
                cin >> product.product_id;
                cout << "Enter product name: ";
                cin.ignore();
                getline(cin, product.product_name);
                cout << "Enter product price: ";
                cin >> product.product_price;
                cout << "Enter GST: ";
                cin >> product.gst;
                insert(product);
                break;
            }
            case 2: {
                int id;
                cout << "Enter ID of product to delete: ";
                cin >> id;
                remove(id);
                break;
            }
            case 3: {
                int id;
                cout << "Enter ID of product to search: ";
                cin >> id;
                search(id);
                break;
            }
            case 4: {
                display();
                break;
            }
            case 5:
                cout << "Exiting program.\n";
                break;
            default:
                cout << "Invalid choice! Please enter a number between 1 and 5." << endl;
        }
    } while (choice != 5);

    return 0;
}


