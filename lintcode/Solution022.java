package src;

/*
public class Solution022 {
    // @param nestedList a list of NestedInteger
    // @return a list of integer
    public List<Integer> flatten(List<NestedInteger> nestedList) {
        // Write your code here
        List<Integer> list = new ArrayList<Integer>();
        for(NestedInteger ele: nestedList){
            if(ele.isInteger()){
                list.add(ele.getInteger());
            }else{
                list.addAll(flatten(ele.getList()));
            }
        }
        return list;
    }
}
*/