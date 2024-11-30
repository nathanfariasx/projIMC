package control;

public class CalculadoraImc {

    public String calcularImc(double peso, double altura, int idade, String sexo) {

        double imc = peso / (altura * altura);
        //TO DO implementar a logica da calculadora de IMC
        //tendo como retorno um nome de uma faixa de valores
        // Ex.: "Baixo peso muito grave"
        String faixaEtaria;

        if (idade >= 20 && idade <= 65)
            faixaEtaria = "Adulto";
        else if(idade <= 12)
            faixaEtaria = "Criança";
        else if(idade >= 66)
            faixaEtaria = "Idoso";
        else
            faixaEtaria = "Idade nao Catalogada";

        switch (faixaEtaria) {
            case "Adulto":
                if (imc < 16.0)
                    return "Baixo peso muito grave";
                if (imc >= 16.0 && imc <= 16.99)
                    return "Baixo peso grave";
                if (imc >= 17.0 && imc <= 18.49)
                    return "Baixo peso";
                if (imc >= 18.5 && imc <= 24.99)
                    return "Peso normal";
                if (imc >= 25.0 && imc <= 29.99)
                    return "Sobrepeso";
                if (imc >= 30.0 && imc <= 34.99)
                    return "Obesidade grau I";
                if (imc >= 35.0 && imc <= 39.99)
                    return "Obesidade grau II";
                if (imc >= 40.0)
                    return "Obesidade grau III (obesidade mórbida)";
            case "Criança":
                if (idade == 2){
                    if (imc <= 14.8 && sexo == "feminino"){
                        return "Baixo peso";
                    } else if (imc <= 15.0 && sexo == "masculino") {
                        return "Baixo peso";
                    }
                    if (imc > 14.8 && imc <= 18.0 && sexo == "feminino"){
                        return "Peso normal";
                    } else if (imc > 15.0 && imc <= 18.2 && sexo == "masculino") {
                        return "Peso normal";
                    }
                    if (imc > 18.0 && imc <= 19.0 && sexo == "feminino"){
                        return "Sobrepeso";
                    } else if (imc > 18.0 && imc <= 19.2 && sexo == "masculino") {
                        return "Sobrepeso";
                    }
                    if (imc > 19.0 && sexo == "feminino"){
                        return "Obesidade";
                    } else if (imc > 19.2 && sexo == "masculino") {
                        return "Obesidade";
                    }

                } else if (idade == 4){
                    if (imc <= 14.2 && sexo == "feminino"){
                        return "Baixo peso";
                    } else if (imc <= 14.4 && sexo == "masculino") {
                        return "Baixo peso";
                    }
                    if (imc > 14.2 && imc <= 16.8 && sexo == "feminino"){
                        return "Peso normal";
                    } else if (imc > 14.4 && imc <= 16.8 && sexo == "masculino") {
                        return "Peso normal";
                    }
                    if (imc > 16.8 && imc <= 18.0 && sexo == "feminino"){
                        return "Sobrepeso";
                    } else if (imc > 16.8 && imc <= 17.8 && sexo == "masculino") {
                        return "Sobrepeso";
                    }
                    if (imc > 18.0 && sexo == "feminino"){
                        return "Obesidade";
                    } else if (imc > 17.8 && sexo == "masculino") {
                        return "Obesidade";
                    }
                } else if (idade == 6) {
                    if (imc <= 13.7 && sexo == "feminino"){
                        return "Baixo peso";
                    } else if (imc <= 14.0 && sexo == "masculino") {
                        return "Baixo peso";
                    }
                    if (imc > 13.7 && imc <= 17.1 && sexo == "feminino"){
                        return "Peso normal";
                    } else if (imc > 14.0 && imc <= 17.0 && sexo == "masculino") {
                        return "Peso normal";
                    }
                    if (imc > 17.1 && imc <= 18.6 && sexo == "feminino"){
                        return "Sobrepeso";
                    } else if (imc > 17.0 && imc <= 18.3 && sexo == "masculino") {
                        return "Sobrepeso";
                    }
                    if (imc > 18.6 && sexo == "feminino"){
                        return "Obesidade";
                    } else if (imc > 18.3 && sexo == "masculino") {
                        return "Obesidade";
                    }
                } else if (idade == 8) {
                    if (imc <= 14.0 && sexo == "feminino"){
                        return "Baixo peso";
                    } else if (imc <= 14.2 && sexo == "masculino") {
                        return "Baixo peso";
                    }
                    if (imc > 14.0 && imc <= 18.3 && sexo == "feminino"){
                        return "Peso normal";
                    } else if (imc > 14.2 && imc <= 17.8 && sexo == "masculino") {
                        return "Peso normal";
                    }
                    if (imc > 18.3 && imc <= 20.6 && sexo == "feminino"){
                        return "Sobrepeso";
                    } else if (imc > 17.8 && imc <= 20.0 && sexo == "masculino") {
                        return "Sobrepeso";
                    }
                    if (imc > 20.6 && sexo == "feminino"){
                        return "Obesidade";
                    } else if (imc > 20.0 && sexo == "masculino") {
                        return "Obesidade";
                    }
                } else if (idade == 10) {
                    if (imc <= 14.6 && sexo == "feminino"){
                        return "Baixo peso";
                    } else if (imc <= 14.6 && sexo == "masculino") {
                        return "Baixo peso";
                    }
                    if (imc > 14.6 && imc <= 20.0 && sexo == "feminino"){
                        return "Peso normal";
                    } else if (imc > 14.6 && imc <= 19.4 && sexo == "masculino") {
                        return "Peso normal";
                    }
                    if (imc > 20.0 && imc <= 22.9 && sexo == "feminino"){
                        return "Sobrepeso";
                    } else if (imc > 19.4 && imc <= 22.0 && sexo == "masculino") {
                        return "Sobrepeso";
                    }
                    if (imc > 22.9 && sexo == "feminino"){
                        return "Obesidade";
                    } else if (imc > 22.0 && sexo == "masculino") {
                        return "Obesidade";
                    }
                } else if (idade == 12) {
                    if (imc <= 15.4 && sexo == "feminino"){
                        return "Baixo peso";
                    } else if (imc <= 15.4 && sexo == "masculino") {
                        return "Baixo peso";
                    }
                    if (imc > 15.4 && imc <= 21.7 && sexo == "feminino"){
                        return "Peso normal";
                    } else if (imc > 15.4 && imc <= 21.0 && sexo == "masculino") {
                        return "Peso normal";
                    }
                    if (imc > 21.7 && imc <= 25.0 && sexo == "feminino"){
                        return "Sobrepeso";
                    } else if (imc > 21.0 && imc <= 24.1 && sexo == "masculino") {
                        return "Sobrepeso";
                    }
                    if (imc > 25.0 && sexo == "feminino"){
                        return "Obesidade";
                    } else if (imc > 24.1 && sexo == "masculino") {
                        return "Obesidade";
                    }
                }
            case "Idoso":
                    if (imc <= 21.9 && sexo == "feminino") {
                        return "Baixo peso";
                    } else if (imc <= 21.9 && sexo == "masculino") {
                        return "Baixo peso";
                    }
                    if (imc >= 22.0 && imc <= 27.0 && sexo == "feminino") {
                        return "Peso Normal";
                    }else if (imc >= 22.0 && imc <= 27.0 && sexo == "masculino") {
                        return "Peso Normal";
                    }
                    if (imc >= 27.1 && imc <= 32.0 && sexo == "feminino") {
                        return "Sobrepeso";
                    } else if (imc >= 27.1 && imc <= 30.0 && sexo == "masculino") {
                        return "Sobrepeso";
                    }
                    if (imc >= 32.1 && imc <= 37.0 && sexo == "feminino") {
                        return "Obesidade grau I";
                    } else if (imc >= 30.1 && imc <= 35.0 && sexo == "masculino") {
                        return "Obesidade grau I";
                    }
                    if (imc >= 37.1 && imc <= 41.9 && sexo == "feminino") {
                        return "Obesidade grau II";
                    } else if (imc >= 35.1 && imc <= 39.9 && sexo == "masculino") {
                        return "Obesidade grau II";
                    }
                    if (imc >= 42.0 && sexo == "feminino") {
                        return "Obesidade grau III (obesidade mórbida)";
                    } else if (imc >= 40.0 && sexo == "masculino") {
                        return "Obesidade grau III (obesidade mórbida)";
                    }
        }

        return faixaEtaria;
    }
}
