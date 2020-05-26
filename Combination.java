public class Combination {
    int first;
    int second;
    int third;
    public Combination( int first, int second, int third ) {
        this.first= first;
        this.second= second;
        this.third= third;
    }

    // An instance method that compares this object
    // to other.
    // Always check that other is not null, i)
    // an error would occur if you tried to
    // access other.first if other was null, ii)
    // null is a valid argument, the method should
    // simply return false.

    public boolean equals( Combination other ) {
        if (other.first==first&&other.second==second&&other.third==third)
            return true;
        else 
            if (other = null)
                return false;
    }

    // Returns a String representation of this Combination.

    public String toString() {
        return first +":"+second+":"+third;
    }

}
