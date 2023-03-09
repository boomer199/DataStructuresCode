class MyLinkedList{
    size = 0; 
    
    constuctor(){
        this.head = null; 
        this.tail = this.head;
    }

    constructor(array){
        for(let i = 0; i < array.length; i++){
            this.addLast(array[i])
        }
    }

    addFirst(num){
        let node = new Node(num)
        if(this.isEmpty()){
            this.head = this.tail = node;
        } else {
            node.next = this.head; 
            this.head = node; 
        }
        this.size++;
    }

    addLast(num){
        let node = new Node(num)
        if(this.isEmpty()){
            this.head = node;
            this.tail = this.head; 
        } else {
            this.tail.next = node; 
            this.tail = node; 
        }
        this.size++; 
    }

    getFirst(){
        if(this.isEmpty()){
            return null;
        }
        return this.head.data; 
    }

    getLast(){
        if(this.isEmpty()){
            return null;
        }
        return this.tail.data; 
    }

    removeFirst(){
        if(this.isEmpty()){
            return null;
        }
        this.head = this.head.next;
        this.size--;

        return this.head.data; 
    }

    removeLast(){
        if(this.isEmpty()){
            return null;
        }
        let temp = this.tail;
        if(this.size ==1 ){
            head = tail = null; 
        } else {
            let current = this.head; 
            for (let i = 0; i < this.size - 2; i++) {
                current = current.next;
            }
            this.tail = current;
            current.next = null;
        }
        this.size--;
        return temp.element;

    }

    isEmpty(){
        return this.size == 0; 
    }
}

class Node {
    constructor(data) {
      this.data = data
      this.next = null
    }
  }

array = [12, "27", 3, "ghello", 237.2]
ll = new MyLinkedList(array)

console.log(ll.getFirst())
ll.removeFirst()
console.log(ll.getFirst())
ll.removeLast()
console.log(ll.getLast())
