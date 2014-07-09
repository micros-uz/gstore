package gstore

class HomeController {

    HomeController() {
        System.out.println("gege")
    }

    def index() {
        int d = 89;


        return d + 45;
    }

    def fefe(){

        throw new Exception("fefe");

    }
}
