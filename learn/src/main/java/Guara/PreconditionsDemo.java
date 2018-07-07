package Guara;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkElementIndex;
import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

import lombok.Data;
import org.junit.Test;
@Data
public class PreconditionsDemo {
    private String label;
    private int[] values = new int[5];
    private int currentIndex;

  //value not null;
    public String  chechLabelNotNull(String lablel){
        return checkNotNull(label,"Label can't be null");
    }
    public void updateCurrentIndexValue(int index, int valueToSet) {
//Check index valid first
        this.currentIndex = checkElementIndex(index, values.length,"Index out of bounds for values");
//Validate valueToSet
        checkArgument(valueToSet <= 100,"Value can't be more than 100");
            values[this.currentIndex] = valueToSet;
    }

    public void doOperation(){
        checkState(validateObjectState(),"Can't perform operation");
    }
    private boolean validateObjectState(){
        return this.label.equalsIgnoreCase("open");
    }


    @Test
    public void  testPreconditions(){
       //检测值非空
//        this.chechLabelNotNull(null);
        //检测数据越界
//        this.updateCurrentIndexValue(7,values.length);
        //检测参数正确性
//        this.updateCurrentIndexValue(4,101);
        //状态校验
        PreconditionsDemo preconditionsDemo=  new PreconditionsDemo();
        preconditionsDemo.label="close";
        preconditionsDemo.doOperation();



    }

}
