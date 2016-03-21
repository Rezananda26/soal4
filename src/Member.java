/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package member;

/**
 *
 * @author Rezananda
 */
public class Member {

    public String Nama;
    private String team;
    private int umur;
    private int nilaiPenampilan;
    private int nilaiSuara;
    private int nilaiAttidute;
    
    public Member(){
        
    }
    public Member(String nama,String team, int umur, int nilaiP, int nilaiS, int nilaiA){
        this.Nama = nama;
        this.team = team;
        this.umur = umur;
        this.nilaiPenampilan = nilaiP;
        this.nilaiSuara = nilaiS;
        this.nilaiAttidute = nilaiA;
    }
    
    public void setNama(String nm){
        this.Nama = nm;
        
    }
    public void setTeam(String tm){
        this.team = tm;
    }
    public void setUmur(int um){
        this.umur = um;
    }
    public void setNilaiP(int np){
        this.nilaiPenampilan = np;
    }
     public void setNilaiA(int na){
        this.nilaiAttidute = na;
    }
    public void setNilaiS(int ns){
        this.nilaiSuara = ns;
    }
    public String getNama(){
        return Nama;
    }
    public String getTeam(){
        return team;
    }
    public int getUmur(){
        return umur;
    }
    public int getNilaiP(){
        return nilaiPenampilan;
    }
    public int getNilaiA(){
        return nilaiAttidute;
    }
    public int getNilaiS(){
        return nilaiSuara;
    }
    public double totalNilai(){
        return (this.nilaiAttidute + this.nilaiPenampilan + this.nilaiSuara)/3;
    }
    

}
