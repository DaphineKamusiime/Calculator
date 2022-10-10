package hello;

class Calculator{
    int value;
    int keep;//2 calculator registers
    char todo;

    void binaryOperation(char op){
        keep=value;
        value=0;
        todo=op;
    }
    
    void add(){binaryOperation('+');
        //keep=value;//keep first operand
        //value=0;//initialise and get ready for second operand
        //todo='+';//what should be done later

    }
    void subtract(){binaryOperation('-');}
    void multiply(){binaryOperation('*');}
    void divide(){binaryOperation('/');}
    void compute(){
        if (todo=='+'){
            value=keep+value;
        }
        else if(todo=='-'){
            value=keep-value;
        }
        else if(todo=='*'){
            value=keep*value;
        }
        else if(todo=='/'){
            value=keep/value;
            keep=0;
        }

    }
    void clear(){
        value=0;
        keep=0;

    }
    void digit(int x){
        value=value*10 + x;
    }
    int display(){
        return value;
    }
    Calculator(){clear();}
    
    public static void main(String[] args){
        Calculator c;
        c=new Calculator();
        c.digit(1);
        c.digit(3);
        c.add();
        c.digit(1);
        c.digit(1);
        c.compute();
        System.out.println(c.display());
    }
    
}