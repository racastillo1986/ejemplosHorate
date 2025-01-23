
package Modelo;


public class Anamnesi {
    
    private int id_ana;
    private int id_pac;
    private String tra_med;
    private String obs_tra_med;
    private String ing_med;
    private String obs_ing_med;
    private String rea_ale;
    private String obs_rea_ale;
    private String hemo;
    private String obs_hemo;
    private String irrad;
    private String obs_irrad;
    private String sinu;
    private String obs_sinu;
    private String enf_res;
    private String obs_enf_res;
    private String card;
    private String obs_card;
    private String diab;
    private String obs_diab;
    private String fie_reu;
    private String obs_fie_reu;
    private String hepa;
    private String obs_hepa;
    private String hiper;
    private String obs_hiper;
    private String otras ;
    private String cepillado;
    private String obs_cepillado;
    private String seda;
    private String obs_seda;
    
    
    //.......................
    //ATRIBUTOS PARA EXAMEN ESTOMATOLOGICO
    
    
    private int id_exa;
    //id_pac ya esta arriba
    private String temper_exa;
    private String pulso_exa;
    private String tension_exa;
    private String respira_exa;
    private String art_exa;
    private String lab_exa;
    private String len_exa;
    private String pal_exa;
    private String pis_exa;
    private String car_exa;
    private String gla_exa;
    private String max_exa;
    private String sen_exa;
    private String mus_exa;
    private String sis_ner;
    private String sis_vas;
    private String lin_exa;
    private String fun_exa;
    private String obs_exa;
    
    
    
    
    
    ////ATRIBUTOS PARA EL DIAGNOSTICO
    
    
    //id_pac ya esta arriba
    private int id_dia;
    
    private String sup_num;
    private String abr_exad;
    private String man_exad;
    private String pat_pul;
    private String pla_bla;
    private String pla_cal;
    private String flu_den;
    private String otr_exad;
    private String obs_exad;
    private String cau_ext;
    private String fin_con;
    private String dia;
    private String pro;
    private String ope_tra;
    private String end_tra;
    private String per_tra;
    private String pro_tra;
    private String cir_tra;
    private String ort_tra;
    private String exo_tra;
    private String med_ora;
    private String otra_tra;
    private String pul_tra;
    private String pulpe_tra;
    private String exosim_tra;
    

    public String getPul_tra() {
        return pul_tra;
    }

    public void setPul_tra(String pul_tra) {
        this.pul_tra = pul_tra;
    }

    public String getPulpe_tra() {
        return pulpe_tra;
    }

    public void setPulpe_tra(String pulpe_tra) {
        this.pulpe_tra = pulpe_tra;
    }

    public String getExosim_tra() {
        return exosim_tra;
    }

    public void setExosim_tra(String exosim_tra) {
        this.exosim_tra = exosim_tra;
    }
    
    
    

    public int getId_dia() {
        return id_dia;
    }

    public void setId_dia(int id_dia) {
        this.id_dia = id_dia;
    }

    public String getSup_num() {
        return sup_num;
    }

    public void setSup_num(String sup_num) {
        this.sup_num = sup_num;
    }

    public String getAbr_exad() {
        return abr_exad;
    }

    public void setAbr_exad(String abr_exad) {
        this.abr_exad = abr_exad;
    }

    public String getMan_exad() {
        return man_exad;
    }

    public void setMan_exad(String man_exad) {
        this.man_exad = man_exad;
    }

    public String getPat_pul() {
        return pat_pul;
    }

    public void setPat_pul(String pat_pul) {
        this.pat_pul = pat_pul;
    }

    public String getPla_bla() {
        return pla_bla;
    }

    public void setPla_bla(String pla_bla) {
        this.pla_bla = pla_bla;
    }

    public String getPla_cal() {
        return pla_cal;
    }

    public void setPla_cal(String pla_cal) {
        this.pla_cal = pla_cal;
    }

    public String getFlu_den() {
        return flu_den;
    }

    public void setFlu_den(String flu_den) {
        this.flu_den = flu_den;
    }

    public String getOtr_exad() {
        return otr_exad;
    }

    public void setOtr_exad(String otr_exad) {
        this.otr_exad = otr_exad;
    }

    public String getObs_exad() {
        return obs_exad;
    }

    public void setObs_exad(String obs_exad) {
        this.obs_exad = obs_exad;
    }

    public String getCau_ext() {
        return cau_ext;
    }

    public void setCau_ext(String cau_ext) {
        this.cau_ext = cau_ext;
    }

    public String getFin_con() {
        return fin_con;
    }

    public void setFin_con(String fin_con) {
        this.fin_con = fin_con;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getPro() {
        return pro;
    }

    public void setPro(String pro) {
        this.pro = pro;
    }

    public String getOpe_tra() {
        return ope_tra;
    }

    public void setOpe_tra(String ope_tra) {
        this.ope_tra = ope_tra;
    }

    public String getEnd_tra() {
        return end_tra;
    }

    public void setEnd_tra(String end_tra) {
        this.end_tra = end_tra;
    }

    public String getPer_tra() {
        return per_tra;
    }

    public void setPer_tra(String per_tra) {
        this.per_tra = per_tra;
    }

    public String getPro_tra() {
        return pro_tra;
    }

    public void setPro_tra(String pro_tra) {
        this.pro_tra = pro_tra;
    }

    public String getCir_tra() {
        return cir_tra;
    }

    public void setCir_tra(String cir_tra) {
        this.cir_tra = cir_tra;
    }

    public String getOrt_tra() {
        return ort_tra;
    }

    public void setOrt_tra(String ort_tra) {
        this.ort_tra = ort_tra;
    }

    public String getExo_tra() {
        return exo_tra;
    }

    public void setExo_tra(String exo_tra) {
        this.exo_tra = exo_tra;
    }

    public String getMed_ora() {
        return med_ora;
    }

    public void setMed_ora(String med_ora) {
        this.med_ora = med_ora;
    }

    public String getOtra_tra() {
        return otra_tra;
    }

    public void setOtra_tra(String otra_tra) {
        this.otra_tra = otra_tra;
    }
    
    
    
    
    //.....................

    public int getId_exa() {
        return id_exa;
    }

    public void setId_exa(int id_exa) {
        this.id_exa = id_exa;
    }

    public String getTemper_exa() {
        return temper_exa;
    }

    public void setTemper_exa(String temper_exa) {
        this.temper_exa = temper_exa;
    }

    public String getPulso_exa() {
        return pulso_exa;
    }

    public void setPulso_exa(String pulso_exa) {
        this.pulso_exa = pulso_exa;
    }

    public String getTension_exa() {
        return tension_exa;
    }

    public void setTension_exa(String tension_exa) {
        this.tension_exa = tension_exa;
    }

    public String getRespira_exa() {
        return respira_exa;
    }

    public void setRespira_exa(String respira_exa) {
        this.respira_exa = respira_exa;
    }

    public String getArt_exa() {
        return art_exa;
    }

    public void setArt_exa(String art_exa) {
        this.art_exa = art_exa;
    }

    public String getLab_exa() {
        return lab_exa;
    }

    public void setLab_exa(String lab_exa) {
        this.lab_exa = lab_exa;
    }

    public String getLen_exa() {
        return len_exa;
    }

    public void setLen_exa(String len_exa) {
        this.len_exa = len_exa;
    }

    public String getPal_exa() {
        return pal_exa;
    }

    public void setPal_exa(String pal_exa) {
        this.pal_exa = pal_exa;
    }

    public String getPis_exa() {
        return pis_exa;
    }

    public void setPis_exa(String pis_exa) {
        this.pis_exa = pis_exa;
    }

    public String getCar_exa() {
        return car_exa;
    }

    public void setCar_exa(String car_exa) {
        this.car_exa = car_exa;
    }

    public String getGla_exa() {
        return gla_exa;
    }

    public void setGla_exa(String gla_exa) {
        this.gla_exa = gla_exa;
    }

    public String getMax_exa() {
        return max_exa;
    }

    public void setMax_exa(String max_exa) {
        this.max_exa = max_exa;
    }

    public String getSen_exa() {
        return sen_exa;
    }

    public void setSen_exa(String sen_exa) {
        this.sen_exa = sen_exa;
    }

    public String getMus_exa() {
        return mus_exa;
    }

    public void setMus_exa(String mus_exa) {
        this.mus_exa = mus_exa;
    }

    public String getSis_ner() {
        return sis_ner;
    }

    public void setSis_ner(String sis_ner) {
        this.sis_ner = sis_ner;
    }

    public String getSis_vas() {
        return sis_vas;
    }

    public void setSis_vas(String sis_vas) {
        this.sis_vas = sis_vas;
    }

    public String getLin_exa() {
        return lin_exa;
    }

    public void setLin_exa(String lin_exa) {
        this.lin_exa = lin_exa;
    }

    public String getFun_exa() {
        return fun_exa;
    }

    public void setFun_exa(String fun_exa) {
        this.fun_exa = fun_exa;
    }

    public String getObs_exa() {
        return obs_exa;
    }

    public void setObs_exa(String obs_exa) {
        this.obs_exa = obs_exa;
    }
    
    
    
    
    
    
    

    public int getId_ana() {
        return id_ana;
    }

    public void setId_ana(int id_ana) {
        this.id_ana = id_ana;
    }

    public int getId_pac() {
        return id_pac;
    }

    public void setId_pac(int id_pac) {
        this.id_pac = id_pac;
    }

    public String getTra_med() {
        return tra_med;
    }

    public void setTra_med(String tra_med) {
        this.tra_med = tra_med;
    }

    public String getObs_tra_med() {
        return obs_tra_med;
    }

    public void setObs_tra_med(String obs_tra_med) {
        this.obs_tra_med = obs_tra_med;
    }

    public String getIng_med() {
        return ing_med;
    }

    public void setIng_med(String ing_med) {
        this.ing_med = ing_med;
    }

    public String getObs_ing_med() {
        return obs_ing_med;
    }

    public void setObs_ing_med(String obs_ing_med) {
        this.obs_ing_med = obs_ing_med;
    }

    public String getRea_ale() {
        return rea_ale;
    }

    public void setRea_ale(String rea_ale) {
        this.rea_ale = rea_ale;
    }

    public String getObs_rea_ale() {
        return obs_rea_ale;
    }

    public void setObs_rea_ale(String obs_rea_ale) {
        this.obs_rea_ale = obs_rea_ale;
    }

    public String getHemo() {
        return hemo;
    }

    public void setHemo(String hemo) {
        this.hemo = hemo;
    }

    public String getObs_hemo() {
        return obs_hemo;
    }

    public void setObs_hemo(String obs_hemo) {
        this.obs_hemo = obs_hemo;
    }

    public String getIrrad() {
        return irrad;
    }

    public void setIrrad(String irrad) {
        this.irrad = irrad;
    }

    public String getObs_irrad() {
        return obs_irrad;
    }

    public void setObs_irrad(String obs_irrad) {
        this.obs_irrad = obs_irrad;
    }

    public String getSinu() {
        return sinu;
    }

    public void setSinu(String sinu) {
        this.sinu = sinu;
    }

    public String getObs_sinu() {
        return obs_sinu;
    }

    public void setObs_sinu(String obs_sinu) {
        this.obs_sinu = obs_sinu;
    }

    public String getEnf_res() {
        return enf_res;
    }

    public void setEnf_res(String enf_res) {
        this.enf_res = enf_res;
    }

    public String getObs_enf_res() {
        return obs_enf_res;
    }

    public void setObs_enf_res(String obs_enf_res) {
        this.obs_enf_res = obs_enf_res;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getObs_card() {
        return obs_card;
    }

    public void setObs_card(String obs_card) {
        this.obs_card = obs_card;
    }

    public String getDiab() {
        return diab;
    }

    public void setDiab(String diab) {
        this.diab = diab;
    }

    public String getObs_diab() {
        return obs_diab;
    }

    public void setObs_diab(String obs_diab) {
        this.obs_diab = obs_diab;
    }

    public String getFie_reu() {
        return fie_reu;
    }

    public void setFie_reu(String fie_reu) {
        this.fie_reu = fie_reu;
    }

    public String getObs_fie_reu() {
        return obs_fie_reu;
    }

    public void setObs_fie_reu(String obs_fie_reu) {
        this.obs_fie_reu = obs_fie_reu;
    }

    public String getHepa() {
        return hepa;
    }

    public void setHepa(String hepa) {
        this.hepa = hepa;
    }

    public String getObs_hepa() {
        return obs_hepa;
    }

    public void setObs_hepa(String obs_hepa) {
        this.obs_hepa = obs_hepa;
    }

    public String getHiper() {
        return hiper;
    }

    public void setHiper(String hiper) {
        this.hiper = hiper;
    }

    public String getObs_hiper() {
        return obs_hiper;
    }

    public void setObs_hiper(String obs_hiper) {
        this.obs_hiper = obs_hiper;
    }

    public String getOtras() {
        return otras;
    }

    public void setOtras(String otras) {
        this.otras = otras;
    }

    public String getCepillado() {
        return cepillado;
    }

    public void setCepillado(String cepillado) {
        this.cepillado = cepillado;
    }

    public String getObs_cepillado() {
        return obs_cepillado;
    }

    public void setObs_cepillado(String obs_cepillado) {
        this.obs_cepillado = obs_cepillado;
    }

    public String getSeda() {
        return seda;
    }

    public void setSeda(String seda) {
        this.seda = seda;
    }

    public String getObs_seda() {
        return obs_seda;
    }

    public void setObs_seda(String obs_seda) {
        this.obs_seda = obs_seda;
    }
    
    
    
    
}
