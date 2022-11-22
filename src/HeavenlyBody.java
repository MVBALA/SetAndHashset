import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satlites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satlites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

   public boolean addMoon(HeavenlyBody moon){
        return this.satlites.add(moon);
   }

    public Set<HeavenlyBody> getSatlites() {
        return new HashSet<>(this.satlites);
    }


    @Override
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        System.out.println("obj.getClass() is "+obj.getClass());
        System.out.println("this.getclass() is "+this.getClass());
        if ((obj==null)||(obj.getClass ()!=this.getClass())){
             return false;
        }
        String objName =((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        System.out.println("Hashcode is called");
        System.out.println(this.name.hashCode());
        return this.name.hashCode()+57;
    }
}
