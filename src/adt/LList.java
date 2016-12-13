package adt;

/**
 * LList.java A class that implements the ADT list by using a chain of nodes,
 * with the node implemented as an inner class.
 */
public class LList<T> implements ListInterface<T> {

  private Node firstNode; // reference to first node
  private int numberOfEntries;  	// number of entries in list

  public LList() {
    clear();
  }

  @Override
  public final void clear() {
    firstNode = null;
    numberOfEntries = 0;
  }

  @Override
  public boolean add(T newEntry) {
    Node newNode = new Node(newEntry);	// create the new node

    if (isEmpty()) // if empty list
    {
      firstNode = newNode;
    } else {                        // add to end of nonempty list
      Node currentNode = firstNode;					// traverse linked list with p pointing to the current node
      while (currentNode.next != null) {		// while have not reached the last node
        currentNode = currentNode.next;
      }
      currentNode.next = newNode; // make last node reference new node
    }

    numberOfEntries++;
    return true;
  }

  @Override
  public boolean insert(int newPosition, T newEntry) { // OutOfMemoryError possible
    boolean isSuccessful = true;

    if ((newPosition >= 1) && (newPosition <= numberOfEntries + 1)) {
      Node newNode = new Node(newEntry);

      if (isEmpty() || (newPosition == 1)) {     // case 1: add to beginning of list
        newNode.next = firstNode;
        firstNode = newNode;
      } else {								                      // case 2: list is not empty and newPosition > 1
        Node nodeBefore = firstNode;
        for (int i = 1; i < newPosition - 1; ++i) {
          nodeBefore = nodeBefore.next;		// advance nodeBefore to its next node
        }

        newNode.next = nodeBefore.next;	// make new node point to current node at newPosition
        nodeBefore.next = newNode;		// make the node before point to the new node
      }

      numberOfEntries++;
    } else {
      isSuccessful = false;
    }

    return isSuccessful;
  }

  @Override
  public T remove(int givenPosition) {
    T result = null;                 // return value

    if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
      if (givenPosition == 1) {      // case 1: remove first entry
        result = firstNode.data;     // save entry to be removed
        firstNode = firstNode.next;
      } else {                         // case 2: givenPosition > 1
        Node nodeBefore = firstNode;
        for (int i = 1; i < givenPosition - 1; ++i) {
          nodeBefore = nodeBefore.next;		// advance nodeBefore to its next node
        }
        result = nodeBefore.next.data;  // save entry to be removed
        nodeBefore.next = nodeBefore.next.next;	// make node before point to node after the
      } 																// one to be deleted (to disconnect node from chain)

      numberOfEntries--;
    }

    return result;                   // return removed entry, or
    // null if operation fails
  }

  @Override
  public boolean replace(int givenPosition, T newEntry) {
    boolean isSuccessful = true;

    if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
      Node currentNode = firstNode;
      for (int i = 0; i < givenPosition - 1; ++i) {
        // System.out.println("Trace| currentNode.data = " + currentNode.data + "\t, i = " + i);
        currentNode = currentNode.next;		// advance currentNode to next node
      }
      currentNode.data = newEntry;	// currentNode is pointing to the node at givenPosition
    } else {
      isSuccessful = false;
    }

    return isSuccessful;
  }

  @Override
  public T getEntry(int givenPosition) {
    T result = null;

    if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
      Node currentNode = firstNode;
      for (int i = 0; i < givenPosition - 1; ++i) {
        currentNode = currentNode.next;		// advance currentNode to next node
      }
      result = currentNode.data;	// currentNode is pointing to the node at givenPosition
    }

    return result;
  }
  
   public  void swap(int a,int b) {
       Node loopNode=firstNode;
       int flag=1;
       int largest=0;
       Node previousNode1=null;
        Node previousNode2=null;
        Node foundNode1=null;
        Node foundNode2=null;
        if(a>b){
            largest=a;
        }else
            largest=b;
        //System.out.println(largest);
        if((a==1 || b==1) && largest!=2){
            foundNode1=firstNode;
            while(flag!=largest){
                if(flag==largest-1 ){
                    previousNode2=loopNode;
                    foundNode2=loopNode.next;
                }
                loopNode=loopNode.next;
                flag++;
            }
            loopNode=foundNode2.next;
            firstNode=foundNode2;
            firstNode.next=foundNode1.next;
            foundNode1.next=loopNode;
            previousNode2.next=foundNode1;
             
           
        }else if(largest==2){
            //System.out.println(foundNode2.data);
            foundNode1=firstNode;
            foundNode2=firstNode.next;
            foundNode1.next=foundNode2.next;
            firstNode=foundNode2;
            foundNode2.next=foundNode1;
        }
        else{
         while(flag!=largest){ 
          if(flag==(a-1)){
              previousNode1=loopNode;
              
              foundNode1=loopNode.next;
          }else if(flag==(b-1)){
              previousNode2=loopNode;
              foundNode2=loopNode.next;
          }
          loopNode=loopNode.next;
          flag++;
      }
     loopNode=foundNode2.next;
     previousNode1.next=foundNode2;
     previousNode2.next=foundNode1; 
     foundNode2.next=foundNode1.next;
     foundNode1.next=loopNode;   
        }
        
      
     
      
      
      
    
  }

  @Override
  public boolean contains(T anEntry) {
    boolean found = false;
    Node currentNode = firstNode;

    while (!found && (currentNode != null)) {
      if (anEntry.equals(currentNode.data)) {
        found = true;
      } else {
        currentNode = currentNode.next;
      }
    }

    return found;
  }

  @Override
  public int getNumberOfEntries() {
    return numberOfEntries;
  }

  @Override
  public boolean isEmpty() {
    boolean result;

    result = numberOfEntries == 0;

    return result;
  }

  @Override
  public boolean isFull() {
    return false;
  }

  @Override
  public String toString() {
    String outputStr = "";
    Node currentNode = firstNode;
    while (currentNode != null) {
      outputStr += currentNode.data + "\n";
      currentNode = currentNode.next;
    }
    return outputStr;
  }

  private class Node {

    private T data;
    private Node next;

    private Node(T data) {
      this.data = data;
      this.next = null;
    }

    private Node(T data, Node next) {
      this.data = data;
      this.next = next;
    }
  } // end Node

} // end LList
