package practice.collections;

public class MapKeyObject implements Comparable<MapKeyObject> {
    private int x;
    private String y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MapKeyObject that = (MapKeyObject) o;

        if (x != that.x) return false;
        if (y != null ? !y.equals(that.y) : that.y != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + (y != null ? y.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(MapKeyObject that) {
        if(that==null){
            return 1;
        }
        if(this.getX()<that.getX()) return 1;
        if(this.getX()>that.getX()) return -1;

        return 0;
    }

    public MapKeyObject() {

    }

    public MapKeyObject(int x, String y) {
        this.x = x;
        this.y = y;
    }
}
