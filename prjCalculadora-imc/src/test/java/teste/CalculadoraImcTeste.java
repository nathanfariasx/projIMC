package teste;

import control.CalculadoraImc;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraImcTeste {

    CalculadoraImc calculadoraImc;

    @Before
    public void setup() {
        calculadoraImc = new CalculadoraImc();
    }

    // Testes Adultos
    @Test
    public void testeAdultoBaixoPesoMuitoGrave() {
        assertEquals("Baixo peso muito grave", calculadoraImc.calcularImc(48.0,1.735,20,"masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoGraveInferior() {
        assertEquals("Baixo peso grave", calculadoraImc.calcularImc(48.0,1.73,20,"feminino"));
    }

    @Test
    public void testeAdultoBaixoPesoGraveSuperior() {
        assertEquals("Baixo peso grave", calculadoraImc.calcularImc(50.0,1.72,65,"masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoInferior() { //17
        assertEquals("Baixo peso", calculadoraImc.calcularImc(50.0,1.715,65,"masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoSuperior() {
        assertEquals("Baixo peso", calculadoraImc.calcularImc(60.0,1.802,65,"feminino"));
    }

    @Test
    public void testeAdultoPesoNormalInferior() { // 18,50
        assertEquals("Peso normal", calculadoraImc.calcularImc(46.0,1.5767,65,"masculino"));
    }

    @Test
    public void testeAdultoPesoNormalSuperior() {
        assertEquals("Peso normal", calculadoraImc.calcularImc(79.0,1.778,65,"masculino"));
    }

    @Test
    public void testeAdultoSobrepesoInferior() { //25
        assertEquals("Sobrepeso", calculadoraImc.calcularImc(80,1.7887,65,"masculino"));
    }

    @Test
    public void testeAdultoSobrepesoSuperior() {
        assertEquals("Sobrepeso", calculadoraImc.calcularImc(94.0,1.7705,65,"masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrauIInferior() {
        assertEquals("Obesidade grau I", calculadoraImc.calcularImc(94.0,1.77,65,"masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrauISuperior() {
        assertEquals("Obesidade grau I", calculadoraImc.calcularImc(109.0,1.765,65,"masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrauIIInferior() { // 35
        assertEquals("Obesidade grau II", calculadoraImc.calcularImc(110.0,1.7727,65,"masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrauIISuperior() {
        assertEquals("Obesidade grau II", calculadoraImc.calcularImc(120.0,1.8516,65,"masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrauIII() {
        assertEquals("Obesidade grau III (obesidade mórbida)", calculadoraImc.calcularImc(116.0,1.7029,65,"masculino"));
    }

    // Testes Idosos
    // Mulheres >65

    @Test
    public void testeIdosoMulherBaixoPeso() { //21,9 kg/m²
        assertEquals("Baixo peso", calculadoraImc.calcularImc(64.0,1.72,66,"feminino"));
    }

    @Test
    public void testeIdosoMulherPesoNormalInferior() { //22
        assertEquals("Peso Normal", calculadoraImc.calcularImc(74.0,1.834,67,"feminino"));
    }

    @Test
    public void testeIdosoMulherPesoNormalSuperior() { //27
        assertEquals("Peso Normal", calculadoraImc.calcularImc(88.0,1.8055,68,"feminino"));
    }

    @Test
    public void testeIdosoMulherSobrepesoInferior() { //27,1
        assertEquals("Sobrepeso", calculadoraImc.calcularImc(87.0,1.79,68,"feminino"));
    }

    @Test
    public void testeIdosoMulherSobrepesoSuperior() { //32
        assertEquals("Sobrepeso", calculadoraImc.calcularImc(85.0,1.6832,68,"feminino"));
    }

    @Test
    public void testeIdosoMulherObesidadeGrauIInferior() { //32,1
        assertEquals("Obesidade grau I", calculadoraImc.calcularImc(96.0,1.7294,68,"feminino"));
    }


    @Test
    public void testeIdosoMulherObesidadeGrauISuperior() { //37
        assertEquals("Obesidade grau I", calculadoraImc.calcularImc(110.0,1.7242,69,"feminino"));
    }

    @Test
    public void testeIdosoMulherObesidadeGrauIIInferior() { //37,1
        assertEquals("Obesidade grau II", calculadoraImc.calcularImc(110.0,1.72,69,"feminino"));
    }

    @Test
    public void testeIdosoMulherObesidadeGrauIISuperior() { //41,9
        assertEquals("Obesidade grau II", calculadoraImc.calcularImc(124.0,1.7202,69,"feminino"));
    }

    @Test
    public void testeIdosoMulherObesidadeGrauIII() { //42
        assertEquals("Obesidade grau III (obesidade mórbida)", calculadoraImc.calcularImc(125.0,1.72,70,"feminino"));
    }

    //Homens

    @Test
    public void testeIdosoHomemBaixoPeso() { //21,9 kg/m²
        assertEquals("Baixo peso", calculadoraImc.calcularImc(64.0,1.72,66,"masculino"));
    }

    @Test
    public void testeIdosoHomemPesoNormalInferior() { //22
        assertEquals("Peso Normal", calculadoraImc.calcularImc(74.0,1.834,67,"masculino"));
    }

    @Test
    public void testeIdosoHomemPesoNormalSuperior() { //27
        assertEquals("Peso Normal", calculadoraImc.calcularImc(87.0,1.795,68,"masculino"));
    }

    @Test
    public void testeIdosoHomemSobrepesoInferior() { //27,1
        assertEquals("Sobrepeso", calculadoraImc.calcularImc(88.0,1.802,68,"masculino"));
    }

    @Test
    public void testeIdosoHomemSobrepesoSuperior() { //30
        assertEquals("Sobrepeso", calculadoraImc.calcularImc(89.0,1.7224,68,"masculino"));
    }

    @Test
    public void testeIdosoHomemObesidadeGrauIInferior() { //30,1
        assertEquals("Obesidade grau I", calculadoraImc.calcularImc(100.0,1.82,68,"masculino"));
    }

    @Test
    public void testeIdosoHomemObesidadeGrauISuperior() { //35
        assertEquals("Obesidade grau I", calculadoraImc.calcularImc(116.0,1.8204,69,"masculino"));
    }

    @Test
    public void testeIdosoHomemObesidadeGrauIIInferior() { //35,1
        assertEquals("Obesidade grau II", calculadoraImc.calcularImc(116.0,1.818,69,"masculino"));
    }

    @Test
    public void testeIdosoHomemObesidadeGrauIISuperior() { //39,9
        assertEquals("Obesidade grau II", calculadoraImc.calcularImc(129.0,1.796,69,"masculino"));
    }

    @Test
    public void testeIdosoHomemObesidadeGrauIII() { //>40
        assertEquals("Obesidade grau III (obesidade mórbida)", calculadoraImc.calcularImc(133.0,1.796,70,"masculino"));
    }



// Testes Infantis

    // Menina 2 anos
    @Test
    public void testeMenina2anosBaixoPeso() { //14.20
        assertEquals("Baixo peso", calculadoraImc.calcularImc(8.0,0.7505,2,"feminino"));
    }
    @Test
    public void testeMenina2anosPesoNormal() { // 16.00
        assertEquals("Peso normal", calculadoraImc.calcularImc(10.0,0.7905,2,"feminino"));
    }

    @Test
    public void testeMenina2anosSobrepeso() { // 18.40
        assertEquals("Sobrepeso", calculadoraImc.calcularImc(12.0,0.8075,2,"feminino"));
    }

    @Test
    public void testeMenina2anosObesidade() { // 19.40
        assertEquals("Obesidade", calculadoraImc.calcularImc(14.0,0.8495,2,"feminino"));
    }

    // Menino 2 anos
    @Test
    public void testeMenino2anosBaixoPeso() { //14.80
        assertEquals("Baixo peso", calculadoraImc.calcularImc(8.0,0.7352,2,"masculino"));
    }

    @Test
    public void testeMenino2anosPesoNormal() { // 16.00
        assertEquals("Peso normal", calculadoraImc.calcularImc(10.0,0.7905,2,"masculino"));
    }

    @Test
    public void testeMenino2anosSobrepeso() { // 18.40
        assertEquals("Sobrepeso", calculadoraImc.calcularImc(12.0,0.8075,2,"masculino"));
    }

    @Test
    public void testeMenino2anosObesidade() { // 19.40
        assertEquals("Obesidade", calculadoraImc.calcularImc(14.0,0.8495,2,"masculino"));
    }

    // Menina 4 anos
    @Test
    public void testeMenina4anosBaixoPeso() { //14.00
        assertEquals("Baixo peso", calculadoraImc.calcularImc(10.0,0.8452,4,"feminino"));
    }

    @Test
    public void testeMenina4anosPesoNormal() { // 16.00
        assertEquals("Peso normal", calculadoraImc.calcularImc(12.0,0.8660,4,"feminino"));
    }

    @Test
    public void testeMenina4anosSobrepeso() { // 17.00
        assertEquals("Sobrepeso", calculadoraImc.calcularImc(14.0,0.9075,4,"feminino"));
    }

    @Test
    public void testeMenina4anosObesidade() { // 18.40
        assertEquals("Obesidade", calculadoraImc.calcularImc(16.0,0.9325,4,"feminino"));
    }

    // Menino 4 anos
    @Test
    public void testeMenino4anosBaixoPeso() { //14.00
        assertEquals("Baixo peso", calculadoraImc.calcularImc(10.0,0.8452,4,"masculino"));
    }

    @Test
    public void testeMenino4anosPesoNormal() { // 16.00
        assertEquals("Peso normal", calculadoraImc.calcularImc(12.0,0.8660,4,"masculino"));
    }

    @Test
    public void testeMenino4anosSobrepeso() { // 17.40
        assertEquals("Sobrepeso", calculadoraImc.calcularImc(14.0,0.8970,4,"masculino"));
    }

    @Test
    public void testeMenino4anosObesidade() { // 18.00
        assertEquals("Obesidade", calculadoraImc.calcularImc(16.0,0.9325,4,"masculino"));
    }

    // Menina 6 anos
    @Test
    public void testeMenina6anosBaixoPeso() { //13.40
        assertEquals("Baixo peso", calculadoraImc.calcularImc(12.0,0.9462,6,"feminino"));
    }

    @Test
    public void testeMenina6anosPesoNormal() { // 16.00
        assertEquals("Peso normal", calculadoraImc.calcularImc(14.0,0.9354,6,"feminino"));
    }

    @Test
    public void testeMenina6anosSobrepeso() { // 17.40
        assertEquals("Sobrepeso", calculadoraImc.calcularImc(16.0,0.9590,6,"feminino"));
    }

    @Test
    public void testeMenina6anosObesidade() { // 19.00
        assertEquals("Obesidade", calculadoraImc.calcularImc(18.0,0.9734,6,"feminino"));
    }

    // Menino 6 anos
    @Test
    public void testeMenino6anosBaixoPeso() { //13.80
        assertEquals("Baixo peso", calculadoraImc.calcularImc(12.0,0.9325,6,"masculino"));
    }

    @Test
    public void testeMenino6anosPesoNormal() { // 16.00
        assertEquals("Peso normal", calculadoraImc.calcularImc(14.0,0.9354,6,"masculino"));
    }

    @Test
    public void testeMenino6anosSobrepeso() { // 17.40
        assertEquals("Sobrepeso", calculadoraImc.calcularImc(16.0,0.9590,6,"masculino"));
    }

    @Test
    public void testeMenino6anosObesidade() { // 18.70
        assertEquals("Obesidade", calculadoraImc.calcularImc(18.0,0.9810,6,"masculino"));
    }

    // Menina 8 anos
    @Test
    public void testeMenina8anosBaixoPeso() { //13.70
        assertEquals("Baixo peso", calculadoraImc.calcularImc(14.0,1.0110,8,"feminino"));
    }

    @Test
    public void testeMenina8anosPesoNormal() { // 16.00
        assertEquals("Peso normal", calculadoraImc.calcularImc(16.0,1.0000,8,"feminino"));
    }

    @Test
    public void testeMenina8anosSobrepeso() { // 19.00
        assertEquals("Sobrepeso", calculadoraImc.calcularImc(18.0,0.9734,8,"feminino"));
    }

    @Test
    public void testeMenina8anosObesidade() { // 21.00
        assertEquals("Obesidade", calculadoraImc.calcularImc(20.0,0.9758,8,"feminino"));
    }

    // Menino 8 anos
    @Test
    public void testeMenino8anosBaixoPeso() { //14.00
        assertEquals("Baixo peso", calculadoraImc.calcularImc(14.0,1.0000,8,"masculino"));
    }

    @Test
    public void testeMenino8anosPesoNormal() { // 16.00
        assertEquals("Peso normal", calculadoraImc.calcularImc(16.0,1.0000,8,"masculino"));
    }

    @Test
    public void testeMenino8anosSobrepeso() { // 19.00
        assertEquals("Sobrepeso", calculadoraImc.calcularImc(18.0,0.9733,8,"masculino"));
    }

    @Test
    public void testeMenino8anosObesidade() { // 20.50
        assertEquals("Obesidade", calculadoraImc.calcularImc(20.0,0.9878,8,"masculino"));
    }

    // Menina 10 anos
    @Test
    public void testeMenina10anosBaixoPeso() { // 14.20
        assertEquals("Baixo peso", calculadoraImc.calcularImc(16.0,1.0615,10,"feminino"));
    }

    @Test
    public void testeMenina10anosPesoNormal() { // 18.00
        assertEquals("Peso normal", calculadoraImc.calcularImc(18.0,1.0000,10,"feminino"));
    }

    @Test
    public void testeMenina10anosSobrepeso() { // 21.00
        assertEquals("Sobrepeso", calculadoraImc.calcularImc(20.0,0.9758,10,"feminino"));
    }

    @Test
    public void testeMenina10anosObesidade() { // 23.50
        assertEquals("Obesidade", calculadoraImc.calcularImc(22.0,0.9675,10,"feminino"));
    }

    // Menino 10 anos
    @Test
    public void testeMenino10anosBaixoPeso() { // 14.20
        assertEquals("Baixo peso", calculadoraImc.calcularImc(16.0,1.0615,10,"masculino"));
    }

    @Test
    public void testeMenino10anosPesoNormal() { // 18.00
        assertEquals("Peso normal", calculadoraImc.calcularImc(18.0,1.0000,10,"masculino"));
    }

    @Test
    public void testeMenino10anosSobrepeso() { // 20.00
        assertEquals("Sobrepeso", calculadoraImc.calcularImc(20.0,1.0000,10,"masculino"));
    }

    @Test
    public void testeMenino10anosObesidade() { // 23.00
        assertEquals("Obesidade", calculadoraImc.calcularImc(22.0,0.9780,10,"masculino"));
    }

    // Menina 12 anos
    @Test
    public void testeMenina12anosBaixoPeso() { // 13.00
        assertEquals("Baixo peso", calculadoraImc.calcularImc(18.0,1.1765,12,"feminino"));
    }

    @Test
    public void testeMenina12anosPesoNormal() { // 20.00
        assertEquals("Peso normal", calculadoraImc.calcularImc(20.0,1.0000,12,"feminino"));
    }

    @Test
    public void testeMenina12anosSobrepeso() { // 22.00
        assertEquals("Sobrepeso", calculadoraImc.calcularImc(22.0,1.0000,12,"feminino"));
    }

    @Test
    public void testeMenina12anosObesidade() { // 26.00
        assertEquals("Obesidade", calculadoraImc.calcularImc(24.0,0.9608,12,"feminino"));
    }

    // Menino 12 anos
    @Test
    public void testeMenino12anosBaixoPeso() { // 15.00
        assertEquals("Baixo peso", calculadoraImc.calcularImc(18.0,1.0953,12,"masculino"));
    }

    @Test
    public void testeMenino12anosPesoNormal() { // 20.00
        assertEquals("Peso normal", calculadoraImc.calcularImc(20.0,1.0000,12,"masculino"));
    }

    @Test
    public void testeMenino12anosSobrepeso() { // 22.00
        assertEquals("Sobrepeso", calculadoraImc.calcularImc(22.0,1.0000,12,"masculino"));
    }

    @Test
    public void testeMenino12anosObesidade() { // 25.00
        assertEquals("Obesidade", calculadoraImc.calcularImc(24.0,0.9798,12,"masculino"));
    }
}


























