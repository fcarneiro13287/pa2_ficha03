package com.francisco;

public class Pessoa {
    private String nome;
    private char genero;
    private int idade;

        //Construtores para classe Pessoa
        public Pessoa(){ }
        public Pessoa(String n, char g){
            this.nome = n;
            this.genero = g;
        }
        public Pessoa(String n, char g, int i){
            this(n,g); //usa o construtor anterior
            this.idade=i;
        }
        //Metodos seletores
        public String getNome(){
            return nome;
        }
        public char getGenero(){

            return genero;
        }
        public int getIdade() {
            return idade;
        }
        //Metodos Modificadores
        public void setNome(String n) {
            nome = n;
        }
        public void setGenero(char n) {
            genero = n;
        }
        public void setIdade(int n){
            idade = n;
        }

        public void Falar(){}
    }

