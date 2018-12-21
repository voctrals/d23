package facade;

/**
 * @author lei.liu
 * @since 18-12-20
 * 看医生门面
 */
public class HospitalFacade {

    private Register register = new Register();
    private Consulting consulting = new Consulting();
    private Check check = new Check();
    private Pharmacy pharmacy = new Pharmacy();

    public void process() {
        String id = register.register();
        consulting.judge(id);
        check.check(id);
        consulting.judge(id);
        pharmacy.takeMedicine(id);
    }

}
