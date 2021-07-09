package service;

import java.math.BigDecimal;

public enum Desempenho {



    A_DESEJAR{
        @Override
        public BigDecimal percentualReajsute() {
            return new BigDecimal("0.03");
        }
    },


    OTIMO {
        @Override
        public BigDecimal percentualReajsute() {
            return new BigDecimal("0.20");
        }
    },
    BOM {
        @Override
        public BigDecimal percentualReajsute() {
            return new BigDecimal("0.15");
        }
    };



    public abstract BigDecimal percentualReajsute();


}




