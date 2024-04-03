class OrderedStream {

    int next;
    String [] chunks;
    public OrderedStream(int n) {
        next = 1;
        chunks = new String [n+1];
    }
    
    public List<String> insert(int idKey, String value) {
        chunks[idKey] = value;
        List<String> res = new ArrayList<>();

        while(next< chunks.length && chunks[next] != null){
            res.add(chunks[next]);
            chunks[next] = null;
            next +=1;

        }
        return res;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */