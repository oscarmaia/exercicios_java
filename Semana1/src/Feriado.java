public class Feriado {
    private String data;
    private String nome;

    Feriado(String data, String nome) {
        this.data = data;
        this.nome = nome;
    }

    Feriado() {
    }

    public String getData() {
        return this.data;
    };

    public String getFeriado() {
        return this.nome;
    };

    public void setData(String data) {
        this.data = data;
    };

    public void setFeriado(String feriado) {
        this.nome = feriado;
    };

    public String isHoliday(String data, Feriado[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].data == data) {
                return "Dia " + data + " é " + arr[i].nome + "!";
            }
        }
        return "Dia " + data + " não é feriado!";
    }
}
