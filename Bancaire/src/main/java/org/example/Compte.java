package org.example;



    public class Compte {

        protected int code;
        protected  double solde;

        public Compte(int code, double solde) {
            this.code = code;
            this.solde=solde;
        }

        public Compte(float solde) {
            //
        }

        @Override
        public String toString(){
            return  "Compte{"+
                    "code"+code+"solde"+solde;

        }
    }