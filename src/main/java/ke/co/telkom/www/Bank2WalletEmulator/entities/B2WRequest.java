/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.co.telkom.www.Bank2WalletEmulator.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author baamimo
 */
@Entity
@Table(name = "B2W_REQUEST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "B2WRequest.findAll", query = "SELECT b FROM B2WRequest b")
    , @NamedQuery(name = "B2WRequest.findByRid", query = "SELECT b FROM B2WRequest b WHERE b.rid = :rid")
    , @NamedQuery(name = "B2WRequest.findByUsername", query = "SELECT b FROM B2WRequest b WHERE b.username = :username")
    , @NamedQuery(name = "B2WRequest.findByCompletionTime", query = "SELECT b FROM B2WRequest b WHERE b.completionTime = :completionTime")
    , @NamedQuery(name = "B2WRequest.findByTerminaltype", query = "SELECT b FROM B2WRequest b WHERE b.terminaltype = :terminaltype")
    , @NamedQuery(name = "B2WRequest.findByTranBn", query = "SELECT b FROM B2WRequest b WHERE b.tranBn = :tranBn")
    , @NamedQuery(name = "B2WRequest.findByFunction", query = "SELECT b FROM B2WRequest b WHERE b.function = :function")
    , @NamedQuery(name = "B2WRequest.findByParam1", query = "SELECT b FROM B2WRequest b WHERE b.param1 = :param1")
    , @NamedQuery(name = "B2WRequest.findByParam2", query = "SELECT b FROM B2WRequest b WHERE b.param2 = :param2")
    , @NamedQuery(name = "B2WRequest.findByParam3", query = "SELECT b FROM B2WRequest b WHERE b.param3 = :param3")
    , @NamedQuery(name = "B2WRequest.findByParam4", query = "SELECT b FROM B2WRequest b WHERE b.param4 = :param4")
    , @NamedQuery(name = "B2WRequest.findByParam5", query = "SELECT b FROM B2WRequest b WHERE b.param5 = :param5")
    , @NamedQuery(name = "B2WRequest.findByParam6", query = "SELECT b FROM B2WRequest b WHERE b.param6 = :param6")
    , @NamedQuery(name = "B2WRequest.findByParam7", query = "SELECT b FROM B2WRequest b WHERE b.param7 = :param7")
    , @NamedQuery(name = "B2WRequest.findByParam8", query = "SELECT b FROM B2WRequest b WHERE b.param8 = :param8")
    , @NamedQuery(name = "B2WRequest.findByParam9", query = "SELECT b FROM B2WRequest b WHERE b.param9 = :param9")
    , @NamedQuery(name = "B2WRequest.findByParam10", query = "SELECT b FROM B2WRequest b WHERE b.param10 = :param10")
    , @NamedQuery(name = "B2WRequest.findByParam11", query = "SELECT b FROM B2WRequest b WHERE b.param11 = :param11")
    , @NamedQuery(name = "B2WRequest.findByParam12", query = "SELECT b FROM B2WRequest b WHERE b.param12 = :param12")
    , @NamedQuery(name = "B2WRequest.findByParam13", query = "SELECT b FROM B2WRequest b WHERE b.param13 = :param13")
    , @NamedQuery(name = "B2WRequest.findByParam14", query = "SELECT b FROM B2WRequest b WHERE b.param14 = :param14")
    , @NamedQuery(name = "B2WRequest.findByParam15", query = "SELECT b FROM B2WRequest b WHERE b.param15 = :param15")
    , @NamedQuery(name = "B2WRequest.findByParam16", query = "SELECT b FROM B2WRequest b WHERE b.param16 = :param16")
    , @NamedQuery(name = "B2WRequest.findByParam17", query = "SELECT b FROM B2WRequest b WHERE b.param17 = :param17")
    , @NamedQuery(name = "B2WRequest.findByParam18", query = "SELECT b FROM B2WRequest b WHERE b.param18 = :param18")
    , @NamedQuery(name = "B2WRequest.findByParam19", query = "SELECT b FROM B2WRequest b WHERE b.param19 = :param19")
    , @NamedQuery(name = "B2WRequest.findByParam20", query = "SELECT b FROM B2WRequest b WHERE b.param20 = :param20")
    , @NamedQuery(name = "B2WRequest.findByParam21", query = "SELECT b FROM B2WRequest b WHERE b.param21 = :param21")
    , @NamedQuery(name = "B2WRequest.findByParam22", query = "SELECT b FROM B2WRequest b WHERE b.param22 = :param22")
    , @NamedQuery(name = "B2WRequest.findByParam23", query = "SELECT b FROM B2WRequest b WHERE b.param23 = :param23")
    , @NamedQuery(name = "B2WRequest.findByParam24", query = "SELECT b FROM B2WRequest b WHERE b.param24 = :param24")
    , @NamedQuery(name = "B2WRequest.findByParam25", query = "SELECT b FROM B2WRequest b WHERE b.param25 = :param25")
    , @NamedQuery(name = "B2WRequest.findByParam26", query = "SELECT b FROM B2WRequest b WHERE b.param26 = :param26")
    , @NamedQuery(name = "B2WRequest.findByParam27", query = "SELECT b FROM B2WRequest b WHERE b.param27 = :param27")
    , @NamedQuery(name = "B2WRequest.findByParam28", query = "SELECT b FROM B2WRequest b WHERE b.param28 = :param28")
    , @NamedQuery(name = "B2WRequest.findByParam29", query = "SELECT b FROM B2WRequest b WHERE b.param29 = :param29")
    , @NamedQuery(name = "B2WRequest.findByParam30", query = "SELECT b FROM B2WRequest b WHERE b.param30 = :param30")
    , @NamedQuery(name = "B2WRequest.findByParam31", query = "SELECT b FROM B2WRequest b WHERE b.param31 = :param31")
    , @NamedQuery(name = "B2WRequest.findByParam32", query = "SELECT b FROM B2WRequest b WHERE b.param32 = :param32")
    , @NamedQuery(name = "B2WRequest.findByParam33", query = "SELECT b FROM B2WRequest b WHERE b.param33 = :param33")
    , @NamedQuery(name = "B2WRequest.findByParam34", query = "SELECT b FROM B2WRequest b WHERE b.param34 = :param34")
    , @NamedQuery(name = "B2WRequest.findByParam35", query = "SELECT b FROM B2WRequest b WHERE b.param35 = :param35")
    , @NamedQuery(name = "B2WRequest.findByParam36", query = "SELECT b FROM B2WRequest b WHERE b.param36 = :param36")
    , @NamedQuery(name = "B2WRequest.findByParam37", query = "SELECT b FROM B2WRequest b WHERE b.param37 = :param37")
    , @NamedQuery(name = "B2WRequest.findByParam38", query = "SELECT b FROM B2WRequest b WHERE b.param38 = :param38")
    , @NamedQuery(name = "B2WRequest.findByParam39", query = "SELECT b FROM B2WRequest b WHERE b.param39 = :param39")
    , @NamedQuery(name = "B2WRequest.findByParam40", query = "SELECT b FROM B2WRequest b WHERE b.param40 = :param40")
    , @NamedQuery(name = "B2WRequest.findByParam41", query = "SELECT b FROM B2WRequest b WHERE b.param41 = :param41")
    , @NamedQuery(name = "B2WRequest.findByParam42", query = "SELECT b FROM B2WRequest b WHERE b.param42 = :param42")
    , @NamedQuery(name = "B2WRequest.findByParam43", query = "SELECT b FROM B2WRequest b WHERE b.param43 = :param43")
    , @NamedQuery(name = "B2WRequest.findByParam44", query = "SELECT b FROM B2WRequest b WHERE b.param44 = :param44")
    , @NamedQuery(name = "B2WRequest.findByParam45", query = "SELECT b FROM B2WRequest b WHERE b.param45 = :param45")
    , @NamedQuery(name = "B2WRequest.findByParam46", query = "SELECT b FROM B2WRequest b WHERE b.param46 = :param46")
    , @NamedQuery(name = "B2WRequest.findByParam47", query = "SELECT b FROM B2WRequest b WHERE b.param47 = :param47")
    , @NamedQuery(name = "B2WRequest.findByParam48", query = "SELECT b FROM B2WRequest b WHERE b.param48 = :param48")
    , @NamedQuery(name = "B2WRequest.findByParam49", query = "SELECT b FROM B2WRequest b WHERE b.param49 = :param49")
    , @NamedQuery(name = "B2WRequest.findByParam50", query = "SELECT b FROM B2WRequest b WHERE b.param50 = :param50")
    , @NamedQuery(name = "B2WRequest.findByParam51", query = "SELECT b FROM B2WRequest b WHERE b.param51 = :param51")
    , @NamedQuery(name = "B2WRequest.findByParam52", query = "SELECT b FROM B2WRequest b WHERE b.param52 = :param52")
    , @NamedQuery(name = "B2WRequest.findByParam53", query = "SELECT b FROM B2WRequest b WHERE b.param53 = :param53")
    , @NamedQuery(name = "B2WRequest.findByParam54", query = "SELECT b FROM B2WRequest b WHERE b.param54 = :param54")
    , @NamedQuery(name = "B2WRequest.findByParam55", query = "SELECT b FROM B2WRequest b WHERE b.param55 = :param55")
    , @NamedQuery(name = "B2WRequest.findByParam56", query = "SELECT b FROM B2WRequest b WHERE b.param56 = :param56")
    , @NamedQuery(name = "B2WRequest.findByParam57", query = "SELECT b FROM B2WRequest b WHERE b.param57 = :param57")
    , @NamedQuery(name = "B2WRequest.findByParam58", query = "SELECT b FROM B2WRequest b WHERE b.param58 = :param58")
    , @NamedQuery(name = "B2WRequest.findByParam59", query = "SELECT b FROM B2WRequest b WHERE b.param59 = :param59")
    , @NamedQuery(name = "B2WRequest.findByParam60", query = "SELECT b FROM B2WRequest b WHERE b.param60 = :param60")
    , @NamedQuery(name = "B2WRequest.findByParam61", query = "SELECT b FROM B2WRequest b WHERE b.param61 = :param61")
    , @NamedQuery(name = "B2WRequest.findByParam62", query = "SELECT b FROM B2WRequest b WHERE b.param62 = :param62")
    , @NamedQuery(name = "B2WRequest.findByParam63", query = "SELECT b FROM B2WRequest b WHERE b.param63 = :param63")
    , @NamedQuery(name = "B2WRequest.findByParam64", query = "SELECT b FROM B2WRequest b WHERE b.param64 = :param64")
    , @NamedQuery(name = "B2WRequest.findByParam65", query = "SELECT b FROM B2WRequest b WHERE b.param65 = :param65")
    , @NamedQuery(name = "B2WRequest.findByParam66", query = "SELECT b FROM B2WRequest b WHERE b.param66 = :param66")
    , @NamedQuery(name = "B2WRequest.findByParam67", query = "SELECT b FROM B2WRequest b WHERE b.param67 = :param67")
    , @NamedQuery(name = "B2WRequest.findByParam68", query = "SELECT b FROM B2WRequest b WHERE b.param68 = :param68")
    , @NamedQuery(name = "B2WRequest.findByParam69", query = "SELECT b FROM B2WRequest b WHERE b.param69 = :param69")
    , @NamedQuery(name = "B2WRequest.findByParam70", query = "SELECT b FROM B2WRequest b WHERE b.param70 = :param70")
    , @NamedQuery(name = "B2WRequest.findByParam71", query = "SELECT b FROM B2WRequest b WHERE b.param71 = :param71")
    , @NamedQuery(name = "B2WRequest.findByParam72", query = "SELECT b FROM B2WRequest b WHERE b.param72 = :param72")
    , @NamedQuery(name = "B2WRequest.findByParam73", query = "SELECT b FROM B2WRequest b WHERE b.param73 = :param73")
    , @NamedQuery(name = "B2WRequest.findByParam74", query = "SELECT b FROM B2WRequest b WHERE b.param74 = :param74")
    , @NamedQuery(name = "B2WRequest.findByParam75", query = "SELECT b FROM B2WRequest b WHERE b.param75 = :param75")
    , @NamedQuery(name = "B2WRequest.findByParam76", query = "SELECT b FROM B2WRequest b WHERE b.param76 = :param76")
    , @NamedQuery(name = "B2WRequest.findByParam77", query = "SELECT b FROM B2WRequest b WHERE b.param77 = :param77")
    , @NamedQuery(name = "B2WRequest.findByParam78", query = "SELECT b FROM B2WRequest b WHERE b.param78 = :param78")
    , @NamedQuery(name = "B2WRequest.findByParam79", query = "SELECT b FROM B2WRequest b WHERE b.param79 = :param79")
    , @NamedQuery(name = "B2WRequest.findByParam80", query = "SELECT b FROM B2WRequest b WHERE b.param80 = :param80")
    , @NamedQuery(name = "B2WRequest.findByParam81", query = "SELECT b FROM B2WRequest b WHERE b.param81 = :param81")
    , @NamedQuery(name = "B2WRequest.findByParam82", query = "SELECT b FROM B2WRequest b WHERE b.param82 = :param82")
    , @NamedQuery(name = "B2WRequest.findByParam83", query = "SELECT b FROM B2WRequest b WHERE b.param83 = :param83")
    , @NamedQuery(name = "B2WRequest.findByParam84", query = "SELECT b FROM B2WRequest b WHERE b.param84 = :param84")
    , @NamedQuery(name = "B2WRequest.findByParam85", query = "SELECT b FROM B2WRequest b WHERE b.param85 = :param85")
    , @NamedQuery(name = "B2WRequest.findByParam86", query = "SELECT b FROM B2WRequest b WHERE b.param86 = :param86")
    , @NamedQuery(name = "B2WRequest.findByParam87", query = "SELECT b FROM B2WRequest b WHERE b.param87 = :param87")
    , @NamedQuery(name = "B2WRequest.findByParam88", query = "SELECT b FROM B2WRequest b WHERE b.param88 = :param88")
    , @NamedQuery(name = "B2WRequest.findByParam89", query = "SELECT b FROM B2WRequest b WHERE b.param89 = :param89")
    , @NamedQuery(name = "B2WRequest.findByParam90", query = "SELECT b FROM B2WRequest b WHERE b.param90 = :param90")
    , @NamedQuery(name = "B2WRequest.findByParam91", query = "SELECT b FROM B2WRequest b WHERE b.param91 = :param91")
    , @NamedQuery(name = "B2WRequest.findByParam92", query = "SELECT b FROM B2WRequest b WHERE b.param92 = :param92")
    , @NamedQuery(name = "B2WRequest.findByParam93", query = "SELECT b FROM B2WRequest b WHERE b.param93 = :param93")
    , @NamedQuery(name = "B2WRequest.findByParam94", query = "SELECT b FROM B2WRequest b WHERE b.param94 = :param94")
    , @NamedQuery(name = "B2WRequest.findByParam95", query = "SELECT b FROM B2WRequest b WHERE b.param95 = :param95")
    , @NamedQuery(name = "B2WRequest.findByParam96", query = "SELECT b FROM B2WRequest b WHERE b.param96 = :param96")
    , @NamedQuery(name = "B2WRequest.findByParam97", query = "SELECT b FROM B2WRequest b WHERE b.param97 = :param97")
    , @NamedQuery(name = "B2WRequest.findByParam98", query = "SELECT b FROM B2WRequest b WHERE b.param98 = :param98")
    , @NamedQuery(name = "B2WRequest.findByParam99", query = "SELECT b FROM B2WRequest b WHERE b.param99 = :param99")
    , @NamedQuery(name = "B2WRequest.findByParam100", query = "SELECT b FROM B2WRequest b WHERE b.param100 = :param100")
    , @NamedQuery(name = "B2WRequest.findByParam101", query = "SELECT b FROM B2WRequest b WHERE b.param101 = :param101")
    , @NamedQuery(name = "B2WRequest.findByParam102", query = "SELECT b FROM B2WRequest b WHERE b.param102 = :param102")
    , @NamedQuery(name = "B2WRequest.findByParam103", query = "SELECT b FROM B2WRequest b WHERE b.param103 = :param103")
    , @NamedQuery(name = "B2WRequest.findByParam104", query = "SELECT b FROM B2WRequest b WHERE b.param104 = :param104")
    , @NamedQuery(name = "B2WRequest.findByParam105", query = "SELECT b FROM B2WRequest b WHERE b.param105 = :param105")
    , @NamedQuery(name = "B2WRequest.findByParam106", query = "SELECT b FROM B2WRequest b WHERE b.param106 = :param106")
    , @NamedQuery(name = "B2WRequest.findByParam107", query = "SELECT b FROM B2WRequest b WHERE b.param107 = :param107")
    , @NamedQuery(name = "B2WRequest.findByParam108", query = "SELECT b FROM B2WRequest b WHERE b.param108 = :param108")
    , @NamedQuery(name = "B2WRequest.findByParam109", query = "SELECT b FROM B2WRequest b WHERE b.param109 = :param109")
    , @NamedQuery(name = "B2WRequest.findByParam110", query = "SELECT b FROM B2WRequest b WHERE b.param110 = :param110")
    , @NamedQuery(name = "B2WRequest.findByParam111", query = "SELECT b FROM B2WRequest b WHERE b.param111 = :param111")
    , @NamedQuery(name = "B2WRequest.findByParam112", query = "SELECT b FROM B2WRequest b WHERE b.param112 = :param112")
    , @NamedQuery(name = "B2WRequest.findByParam113", query = "SELECT b FROM B2WRequest b WHERE b.param113 = :param113")
    , @NamedQuery(name = "B2WRequest.findByParam114", query = "SELECT b FROM B2WRequest b WHERE b.param114 = :param114")
    , @NamedQuery(name = "B2WRequest.findByParam115", query = "SELECT b FROM B2WRequest b WHERE b.param115 = :param115")
    , @NamedQuery(name = "B2WRequest.findByParam116", query = "SELECT b FROM B2WRequest b WHERE b.param116 = :param116")
    , @NamedQuery(name = "B2WRequest.findByParam117", query = "SELECT b FROM B2WRequest b WHERE b.param117 = :param117")
    , @NamedQuery(name = "B2WRequest.findByParam118", query = "SELECT b FROM B2WRequest b WHERE b.param118 = :param118")
    , @NamedQuery(name = "B2WRequest.findByParam119", query = "SELECT b FROM B2WRequest b WHERE b.param119 = :param119")
    , @NamedQuery(name = "B2WRequest.findByParam120", query = "SELECT b FROM B2WRequest b WHERE b.param120 = :param120")
    , @NamedQuery(name = "B2WRequest.findByParam121", query = "SELECT b FROM B2WRequest b WHERE b.param121 = :param121")
    , @NamedQuery(name = "B2WRequest.findByParam122", query = "SELECT b FROM B2WRequest b WHERE b.param122 = :param122")
    , @NamedQuery(name = "B2WRequest.findByParam123", query = "SELECT b FROM B2WRequest b WHERE b.param123 = :param123")
    , @NamedQuery(name = "B2WRequest.findByParam124", query = "SELECT b FROM B2WRequest b WHERE b.param124 = :param124")
    , @NamedQuery(name = "B2WRequest.findByParam125", query = "SELECT b FROM B2WRequest b WHERE b.param125 = :param125")
    , @NamedQuery(name = "B2WRequest.findByParam126", query = "SELECT b FROM B2WRequest b WHERE b.param126 = :param126")
    , @NamedQuery(name = "B2WRequest.findByParam127", query = "SELECT b FROM B2WRequest b WHERE b.param127 = :param127")
    , @NamedQuery(name = "B2WRequest.findByParam128", query = "SELECT b FROM B2WRequest b WHERE b.param128 = :param128")
    , @NamedQuery(name = "B2WRequest.findByParam129", query = "SELECT b FROM B2WRequest b WHERE b.param129 = :param129")
    , @NamedQuery(name = "B2WRequest.findByParam130", query = "SELECT b FROM B2WRequest b WHERE b.param130 = :param130")
    , @NamedQuery(name = "B2WRequest.findByParam131", query = "SELECT b FROM B2WRequest b WHERE b.param131 = :param131")
    , @NamedQuery(name = "B2WRequest.findByParam132", query = "SELECT b FROM B2WRequest b WHERE b.param132 = :param132")
    , @NamedQuery(name = "B2WRequest.findByParam133", query = "SELECT b FROM B2WRequest b WHERE b.param133 = :param133")
    , @NamedQuery(name = "B2WRequest.findByParam134", query = "SELECT b FROM B2WRequest b WHERE b.param134 = :param134")
    , @NamedQuery(name = "B2WRequest.findByParam135", query = "SELECT b FROM B2WRequest b WHERE b.param135 = :param135")
    , @NamedQuery(name = "B2WRequest.findByParam136", query = "SELECT b FROM B2WRequest b WHERE b.param136 = :param136")
    , @NamedQuery(name = "B2WRequest.findByParam137", query = "SELECT b FROM B2WRequest b WHERE b.param137 = :param137")
    , @NamedQuery(name = "B2WRequest.findByParam138", query = "SELECT b FROM B2WRequest b WHERE b.param138 = :param138")
    , @NamedQuery(name = "B2WRequest.findByParam139", query = "SELECT b FROM B2WRequest b WHERE b.param139 = :param139")
    , @NamedQuery(name = "B2WRequest.findByParam140", query = "SELECT b FROM B2WRequest b WHERE b.param140 = :param140")
    , @NamedQuery(name = "B2WRequest.findByParam141", query = "SELECT b FROM B2WRequest b WHERE b.param141 = :param141")
    , @NamedQuery(name = "B2WRequest.findByParam142", query = "SELECT b FROM B2WRequest b WHERE b.param142 = :param142")
    , @NamedQuery(name = "B2WRequest.findByParam143", query = "SELECT b FROM B2WRequest b WHERE b.param143 = :param143")
    , @NamedQuery(name = "B2WRequest.findByParam144", query = "SELECT b FROM B2WRequest b WHERE b.param144 = :param144")
    , @NamedQuery(name = "B2WRequest.findByParam145", query = "SELECT b FROM B2WRequest b WHERE b.param145 = :param145")
    , @NamedQuery(name = "B2WRequest.findByParam146", query = "SELECT b FROM B2WRequest b WHERE b.param146 = :param146")
    , @NamedQuery(name = "B2WRequest.findByParam147", query = "SELECT b FROM B2WRequest b WHERE b.param147 = :param147")
    , @NamedQuery(name = "B2WRequest.findByParam148", query = "SELECT b FROM B2WRequest b WHERE b.param148 = :param148")
    , @NamedQuery(name = "B2WRequest.findByParam149", query = "SELECT b FROM B2WRequest b WHERE b.param149 = :param149")
    , @NamedQuery(name = "B2WRequest.findByParam150", query = "SELECT b FROM B2WRequest b WHERE b.param150 = :param150")
    , @NamedQuery(name = "B2WRequest.findByParam151", query = "SELECT b FROM B2WRequest b WHERE b.param151 = :param151")
    , @NamedQuery(name = "B2WRequest.findByParam152", query = "SELECT b FROM B2WRequest b WHERE b.param152 = :param152")
    , @NamedQuery(name = "B2WRequest.findByParam153", query = "SELECT b FROM B2WRequest b WHERE b.param153 = :param153")
    , @NamedQuery(name = "B2WRequest.findByParam154", query = "SELECT b FROM B2WRequest b WHERE b.param154 = :param154")
    , @NamedQuery(name = "B2WRequest.findByParam155", query = "SELECT b FROM B2WRequest b WHERE b.param155 = :param155")
    , @NamedQuery(name = "B2WRequest.findByUserid", query = "SELECT b FROM B2WRequest b WHERE b.userid = :userid")
    , @NamedQuery(name = "B2WRequest.findByPassword", query = "SELECT b FROM B2WRequest b WHERE b.password = :password")})
public class B2WRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "RID")
    private BigDecimal rid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "USERNAME")
    private String username;
    @Size(max = 20)
    @Column(name = "COMPLETION_TIME")
    private String completionTime;
    @Size(max = 20)
    @NotNull
    @Column(name = "TERMINALTYPE")
    private String terminaltype;
    @Size(max = 20)
    @Column(name = "TRAN_BN")
    private String tranBn;
    @Size(max = 20)
    @NotNull
    @Column(name = "FUNCTION")
    private String function;
    @Size(max = 20)
    @Column(name = "PARAM1")
    private String param1;
    @Size(max = 20)
    @Column(name = "PARAM2")
    private String param2;
    @Size(max = 20)
    @Column(name = "PARAM3")
    private String param3;
    @Column(name = "PARAM4")
    private BigInteger param4;
    @Column(name = "PARAM5")
    private BigDecimal param5;
    @Size(max = 250)
    @Column(name = "PARAM6")
    private String param6;
    @Size(max = 20)
    @Column(name = "PARAM7")
    private String param7;
    @Size(max = 100)
    @Column(name = "PARAM8")
    private String param8;
    @Size(max = 100)
    @Column(name = "PARAM9")
    private String param9;
    @Size(max = 30)
    @Column(name = "PARAM10")
    private String param10;
    @Size(max = 20)
    @Column(name = "PARAM11")
    private String param11;
    @Size(max = 20)
    @Column(name = "PARAM12")
    private String param12;
    @Size(max = 20)
    @Column(name = "PARAM13")
    private String param13;
    @Size(max = 20)
    @Column(name = "PARAM14")
    private String param14;
    @Size(max = 20)
    @Column(name = "PARAM15")
    private String param15;
    @Size(max = 20)
    @Column(name = "PARAM16")
    private String param16;
    @Size(max = 20)
    @Column(name = "PARAM17")
    private String param17;
    @Size(max = 20)
    @Column(name = "PARAM18")
    private String param18;
    @Size(max = 20)
    @Column(name = "PARAM19")
    private String param19;
    @Size(max = 20)
    @Column(name = "PARAM20")
    private String param20;
    @Size(max = 20)
    @Column(name = "PARAM21")
    private String param21;
    @Size(max = 20)
    @Column(name = "PARAM22")
    private String param22;
    @Size(max = 20)
    @Column(name = "PARAM23")
    private String param23;
    @Size(max = 20)
    @Column(name = "PARAM24")
    private String param24;
    @Size(max = 20)
    @Column(name = "PARAM25")
    private String param25;
    @Size(max = 20)
    @Column(name = "PARAM26")
    private String param26;
    @Size(max = 20)
    @Column(name = "PARAM27")
    private String param27;
    @Size(max = 20)
    @Column(name = "PARAM28")
    private String param28;
    @Size(max = 20)
    @Column(name = "PARAM29")
    private String param29;
    @Size(max = 20)
    @Column(name = "PARAM30")
    private String param30;
    @Size(max = 20)
    @Column(name = "PARAM31")
    private String param31;
    @Size(max = 20)
    @Column(name = "PARAM32")
    private String param32;
    @Size(max = 20)
    @Column(name = "PARAM33")
    private String param33;
    @Size(max = 20)
    @Column(name = "PARAM34")
    private String param34;
    @Size(max = 20)
    @Column(name = "PARAM35")
    private String param35;
    @Size(max = 20)
    @Column(name = "PARAM36")
    private String param36;
    @Size(max = 20)
    @Column(name = "PARAM37")
    private String param37;
    @Size(max = 20)
    @Column(name = "PARAM38")
    private String param38;
    @Size(max = 20)
    @Column(name = "PARAM39")
    private String param39;
    @Size(max = 20)
    @Column(name = "PARAM40")
    private String param40;
    @Size(max = 20)
    @Column(name = "PARAM41")
    private String param41;
    @Size(max = 20)
    @Column(name = "PARAM42")
    private String param42;
    @Size(max = 20)
    @Column(name = "PARAM43")
    private String param43;
    @Size(max = 20)
    @Column(name = "PARAM44")
    private String param44;
    @Size(max = 20)
    @Column(name = "PARAM45")
    private String param45;
    @Size(max = 20)
    @Column(name = "PARAM46")
    private String param46;
    @Size(max = 20)
    @Column(name = "PARAM47")
    private String param47;
    @Size(max = 20)
    @Column(name = "PARAM48")
    private String param48;
    @Size(max = 20)
    @Column(name = "PARAM49")
    private String param49;
    @Size(max = 20)
    @Column(name = "PARAM50")
    private String param50;
    @Size(max = 20)
    @Column(name = "PARAM51")
    private String param51;
    @Size(max = 20)
    @Column(name = "PARAM52")
    private String param52;
    @Size(max = 20)
    @Column(name = "PARAM53")
    private String param53;
    @Size(max = 20)
    @Column(name = "PARAM54")
    private String param54;
    @Size(max = 20)
    @Column(name = "PARAM55")
    private String param55;
    @Size(max = 20)
    @Column(name = "PARAM56")
    private String param56;
    @Size(max = 20)
    @Column(name = "PARAM57")
    private String param57;
    @Size(max = 20)
    @Column(name = "PARAM58")
    private String param58;
    @Size(max = 20)
    @Column(name = "PARAM59")
    private String param59;
    @Size(max = 20)
    @Column(name = "PARAM60")
    private String param60;
    @Size(max = 20)
    @Column(name = "PARAM61")
    private String param61;
    @Size(max = 20)
    @Column(name = "PARAM62")
    private String param62;
    @Size(max = 20)
    @Column(name = "PARAM63")
    private String param63;
    @Size(max = 20)
    @Column(name = "PARAM64")
    private String param64;
    @Size(max = 20)
    @Column(name = "PARAM65")
    private String param65;
    @Size(max = 20)
    @Column(name = "PARAM66")
    private String param66;
    @Size(max = 20)
    @Column(name = "PARAM67")
    private String param67;
    @Size(max = 20)
    @Column(name = "PARAM68")
    private String param68;
    @Size(max = 20)
    @Column(name = "PARAM69")
    private String param69;
    @Size(max = 20)
    @Column(name = "PARAM70")
    private String param70;
    @Size(max = 20)
    @Column(name = "PARAM71")
    private String param71;
    @Size(max = 20)
    @Column(name = "PARAM72")
    private String param72;
    @Size(max = 20)
    @Column(name = "PARAM73")
    private String param73;
    @Size(max = 20)
    @Column(name = "PARAM74")
    private String param74;
    @Size(max = 20)
    @Column(name = "PARAM75")
    private String param75;
    @Size(max = 20)
    @Column(name = "PARAM76")
    private String param76;
    @Size(max = 20)
    @Column(name = "PARAM77")
    private String param77;
    @Size(max = 20)
    @Column(name = "PARAM78")
    private String param78;
    @Size(max = 20)
    @Column(name = "PARAM79")
    private String param79;
    @Size(max = 20)
    @Column(name = "PARAM80")
    private String param80;
    @Size(max = 20)
    @Column(name = "PARAM81")
    private String param81;
    @Size(max = 20)
    @Column(name = "PARAM82")
    private String param82;
    @Size(max = 20)
    @Column(name = "PARAM83")
    private String param83;
    @Size(max = 20)
    @Column(name = "PARAM84")
    private String param84;
    @Size(max = 20)
    @Column(name = "PARAM85")
    private String param85;
    @Size(max = 20)
    @Column(name = "PARAM86")
    private String param86;
    @Size(max = 20)
    @Column(name = "PARAM87")
    private String param87;
    @Size(max = 20)
    @Column(name = "PARAM88")
    private String param88;
    @Size(max = 20)
    @Column(name = "PARAM89")
    private String param89;
    @Size(max = 20)
    @Column(name = "PARAM90")
    private String param90;
    @Size(max = 20)
    @Column(name = "PARAM91")
    private String param91;
    @Size(max = 20)
    @Column(name = "PARAM92")
    private String param92;
    @Size(max = 20)
    @Column(name = "PARAM93")
    private String param93;
    @Size(max = 20)
    @Column(name = "PARAM94")
    private String param94;
    @Size(max = 20)
    @Column(name = "PARAM95")
    private String param95;
    @Size(max = 20)
    @Column(name = "PARAM96")
    private String param96;
    @Size(max = 20)
    @Column(name = "PARAM97")
    private String param97;
    @Size(max = 20)
    @Column(name = "PARAM98")
    private String param98;
    @Size(max = 20)
    @Column(name = "PARAM99")
    private String param99;
    @Size(max = 20)
    @Column(name = "PARAM100")
    private String param100;
    @Size(max = 20)
    @Column(name = "PARAM101")
    private String param101;
    @Size(max = 20)
    @Column(name = "PARAM102")
    private String param102;
    @Size(max = 20)
    @Column(name = "PARAM103")
    private String param103;
    @Size(max = 20)
    @Column(name = "PARAM104")
    private String param104;
    @Size(max = 20)
    @Column(name = "PARAM105")
    private String param105;
    @Size(max = 20)
    @Column(name = "PARAM106")
    private String param106;
    @Size(max = 20)
    @Column(name = "PARAM107")
    private String param107;
    @Size(max = 20)
    @Column(name = "PARAM108")
    private String param108;
    @Size(max = 20)
    @Column(name = "PARAM109")
    private String param109;
    @Size(max = 20)
    @Column(name = "PARAM110")
    private String param110;
    @Size(max = 20)
    @Column(name = "PARAM111")
    private String param111;
    @Size(max = 20)
    @Column(name = "PARAM112")
    private String param112;
    @Size(max = 20)
    @Column(name = "PARAM113")
    private String param113;
    @Size(max = 20)
    @Column(name = "PARAM114")
    private String param114;
    @Size(max = 20)
    @Column(name = "PARAM115")
    private String param115;
    @Size(max = 20)
    @Column(name = "PARAM116")
    private String param116;
    @Size(max = 20)
    @Column(name = "PARAM117")
    private String param117;
    @Size(max = 20)
    @Column(name = "PARAM118")
    private String param118;
    @Size(max = 20)
    @Column(name = "PARAM119")
    private String param119;
    @Size(max = 20)
    @Column(name = "PARAM120")
    private String param120;
    @Size(max = 20)
    @Column(name = "PARAM121")
    private String param121;
    @Size(max = 20)
    @Column(name = "PARAM122")
    private String param122;
    @Size(max = 20)
    @Column(name = "PARAM123")
    private String param123;
    @Size(max = 20)
    @Column(name = "PARAM124")
    private String param124;
    @Size(max = 20)
    @Column(name = "PARAM125")
    private String param125;
    @Size(max = 20)
    @Column(name = "PARAM126")
    private String param126;
    @Size(max = 20)
    @Column(name = "PARAM127")
    private String param127;
    @Size(max = 20)
    @Column(name = "PARAM128")
    private String param128;
    @Size(max = 20)
    @Column(name = "PARAM129")
    private String param129;
    @Size(max = 20)
    @Column(name = "PARAM130")
    private String param130;
    @Size(max = 20)
    @Column(name = "PARAM131")
    private String param131;
    @Size(max = 20)
    @Column(name = "PARAM132")
    private String param132;
    @Size(max = 20)
    @Column(name = "PARAM133")
    private String param133;
    @Size(max = 20)
    @Column(name = "PARAM134")
    private String param134;
    @Size(max = 20)
    @Column(name = "PARAM135")
    private String param135;
    @Size(max = 20)
    @Column(name = "PARAM136")
    private String param136;
    @Size(max = 20)
    @Column(name = "PARAM137")
    private String param137;
    @Size(max = 20)
    @Column(name = "PARAM138")
    private String param138;
    @Size(max = 20)
    @Column(name = "PARAM139")
    private String param139;
    @Size(max = 20)
    @Column(name = "PARAM140")
    private String param140;
    @Size(max = 20)
    @Column(name = "PARAM141")
    private String param141;
    @Size(max = 20)
    @Column(name = "PARAM142")
    private String param142;
    @Size(max = 20)
    @Column(name = "PARAM143")
    private String param143;
    @Size(max = 20)
    @Column(name = "PARAM144")
    private String param144;
    @Size(max = 20)
    @Column(name = "PARAM145")
    private String param145;
    @Size(max = 20)
    @Column(name = "PARAM146")
    private String param146;
    @Size(max = 20)
    @Column(name = "PARAM147")
    private String param147;
    @Size(max = 20)
    @Column(name = "PARAM148")
    private String param148;
    @Size(max = 20)
    @Column(name = "PARAM149")
    private String param149;
    @Size(max = 20)
    @Column(name = "PARAM150")
    private String param150;
    @Size(max = 20)
    @Column(name = "PARAM151")
    private String param151;
    @Size(max = 20)
    @Column(name = "PARAM152")
    private String param152;
    @Size(max = 20)
    @Column(name = "PARAM153")
    private String param153;
    @Size(max = 20)
    @Column(name = "PARAM154")
    private String param154;
    @Size(max = 20)
    @Column(name = "PARAM155")
    private String param155;
    @Size(max = 20)
    @NotNull
    @Column(name = "USERID")
    private String userid;
    @Size(max = 250)
    @NotNull
    @Column(name = "PASSWORD")
    private String password;

    public B2WRequest() {
    }

    public B2WRequest(BigDecimal rid) {
        this.rid = rid;
    }

    public B2WRequest(BigDecimal rid, String username) {
        this.rid = rid;
        this.username = username;
    }

    public BigDecimal getRid() {
        return rid;
    }

    public void setRid(BigDecimal rid) {
        this.rid = rid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(String completionTime) {
        this.completionTime = completionTime;
    }

    public String getTerminaltype() {
        return terminaltype;
    }

    public void setTerminaltype(String terminaltype) {
        this.terminaltype = terminaltype;
    }

    public String getTranBn() {
        return tranBn;
    }

    public void setTranBn(String tranBn) {
        this.tranBn = tranBn;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param2 = param2;
    }

    public String getParam3() {
        return param3;
    }

    public void setParam3(String param3) {
        this.param3 = param3;
    }

    public BigInteger getParam4() {
        return param4;
    }

    public void setParam4(BigInteger param4) {
        this.param4 = param4;
    }

    public BigDecimal getParam5() {
        return param5;
    }

    public void setParam5(BigDecimal param5) {
        this.param5 = param5;
    }

    public String getParam6() {
        return param6;
    }

    public void setParam6(String param6) {
        this.param6 = param6;
    }

    public String getParam7() {
        return param7;
    }

    public void setParam7(String param7) {
        this.param7 = param7;
    }

    public String getParam8() {
        return param8;
    }

    public void setParam8(String param8) {
        this.param8 = param8;
    }

    public String getParam9() {
        return param9;
    }

    public void setParam9(String param9) {
        this.param9 = param9;
    }

    public String getParam10() {
        return param10;
    }

    public void setParam10(String param10) {
        this.param10 = param10;
    }

    public String getParam11() {
        return param11;
    }

    public void setParam11(String param11) {
        this.param11 = param11;
    }

    public String getParam12() {
        return param12;
    }

    public void setParam12(String param12) {
        this.param12 = param12;
    }

    public String getParam13() {
        return param13;
    }

    public void setParam13(String param13) {
        this.param13 = param13;
    }

    public String getParam14() {
        return param14;
    }

    public void setParam14(String param14) {
        this.param14 = param14;
    }

    public String getParam15() {
        return param15;
    }

    public void setParam15(String param15) {
        this.param15 = param15;
    }

    public String getParam16() {
        return param16;
    }

    public void setParam16(String param16) {
        this.param16 = param16;
    }

    public String getParam17() {
        return param17;
    }

    public void setParam17(String param17) {
        this.param17 = param17;
    }

    public String getParam18() {
        return param18;
    }

    public void setParam18(String param18) {
        this.param18 = param18;
    }

    public String getParam19() {
        return param19;
    }

    public void setParam19(String param19) {
        this.param19 = param19;
    }

    public String getParam20() {
        return param20;
    }

    public void setParam20(String param20) {
        this.param20 = param20;
    }

    public String getParam21() {
        return param21;
    }

    public void setParam21(String param21) {
        this.param21 = param21;
    }

    public String getParam22() {
        return param22;
    }

    public void setParam22(String param22) {
        this.param22 = param22;
    }

    public String getParam23() {
        return param23;
    }

    public void setParam23(String param23) {
        this.param23 = param23;
    }

    public String getParam24() {
        return param24;
    }

    public void setParam24(String param24) {
        this.param24 = param24;
    }

    public String getParam25() {
        return param25;
    }

    public void setParam25(String param25) {
        this.param25 = param25;
    }

    public String getParam26() {
        return param26;
    }

    public void setParam26(String param26) {
        this.param26 = param26;
    }

    public String getParam27() {
        return param27;
    }

    public void setParam27(String param27) {
        this.param27 = param27;
    }

    public String getParam28() {
        return param28;
    }

    public void setParam28(String param28) {
        this.param28 = param28;
    }

    public String getParam29() {
        return param29;
    }

    public void setParam29(String param29) {
        this.param29 = param29;
    }

    public String getParam30() {
        return param30;
    }

    public void setParam30(String param30) {
        this.param30 = param30;
    }

    public String getParam31() {
        return param31;
    }

    public void setParam31(String param31) {
        this.param31 = param31;
    }

    public String getParam32() {
        return param32;
    }

    public void setParam32(String param32) {
        this.param32 = param32;
    }

    public String getParam33() {
        return param33;
    }

    public void setParam33(String param33) {
        this.param33 = param33;
    }

    public String getParam34() {
        return param34;
    }

    public void setParam34(String param34) {
        this.param34 = param34;
    }

    public String getParam35() {
        return param35;
    }

    public void setParam35(String param35) {
        this.param35 = param35;
    }

    public String getParam36() {
        return param36;
    }

    public void setParam36(String param36) {
        this.param36 = param36;
    }

    public String getParam37() {
        return param37;
    }

    public void setParam37(String param37) {
        this.param37 = param37;
    }

    public String getParam38() {
        return param38;
    }

    public void setParam38(String param38) {
        this.param38 = param38;
    }

    public String getParam39() {
        return param39;
    }

    public void setParam39(String param39) {
        this.param39 = param39;
    }

    public String getParam40() {
        return param40;
    }

    public void setParam40(String param40) {
        this.param40 = param40;
    }

    public String getParam41() {
        return param41;
    }

    public void setParam41(String param41) {
        this.param41 = param41;
    }

    public String getParam42() {
        return param42;
    }

    public void setParam42(String param42) {
        this.param42 = param42;
    }

    public String getParam43() {
        return param43;
    }

    public void setParam43(String param43) {
        this.param43 = param43;
    }

    public String getParam44() {
        return param44;
    }

    public void setParam44(String param44) {
        this.param44 = param44;
    }

    public String getParam45() {
        return param45;
    }

    public void setParam45(String param45) {
        this.param45 = param45;
    }

    public String getParam46() {
        return param46;
    }

    public void setParam46(String param46) {
        this.param46 = param46;
    }

    public String getParam47() {
        return param47;
    }

    public void setParam47(String param47) {
        this.param47 = param47;
    }

    public String getParam48() {
        return param48;
    }

    public void setParam48(String param48) {
        this.param48 = param48;
    }

    public String getParam49() {
        return param49;
    }

    public void setParam49(String param49) {
        this.param49 = param49;
    }

    public String getParam50() {
        return param50;
    }

    public void setParam50(String param50) {
        this.param50 = param50;
    }

    public String getParam51() {
        return param51;
    }

    public void setParam51(String param51) {
        this.param51 = param51;
    }

    public String getParam52() {
        return param52;
    }

    public void setParam52(String param52) {
        this.param52 = param52;
    }

    public String getParam53() {
        return param53;
    }

    public void setParam53(String param53) {
        this.param53 = param53;
    }

    public String getParam54() {
        return param54;
    }

    public void setParam54(String param54) {
        this.param54 = param54;
    }

    public String getParam55() {
        return param55;
    }

    public void setParam55(String param55) {
        this.param55 = param55;
    }

    public String getParam56() {
        return param56;
    }

    public void setParam56(String param56) {
        this.param56 = param56;
    }

    public String getParam57() {
        return param57;
    }

    public void setParam57(String param57) {
        this.param57 = param57;
    }

    public String getParam58() {
        return param58;
    }

    public void setParam58(String param58) {
        this.param58 = param58;
    }

    public String getParam59() {
        return param59;
    }

    public void setParam59(String param59) {
        this.param59 = param59;
    }

    public String getParam60() {
        return param60;
    }

    public void setParam60(String param60) {
        this.param60 = param60;
    }

    public String getParam61() {
        return param61;
    }

    public void setParam61(String param61) {
        this.param61 = param61;
    }

    public String getParam62() {
        return param62;
    }

    public void setParam62(String param62) {
        this.param62 = param62;
    }

    public String getParam63() {
        return param63;
    }

    public void setParam63(String param63) {
        this.param63 = param63;
    }

    public String getParam64() {
        return param64;
    }

    public void setParam64(String param64) {
        this.param64 = param64;
    }

    public String getParam65() {
        return param65;
    }

    public void setParam65(String param65) {
        this.param65 = param65;
    }

    public String getParam66() {
        return param66;
    }

    public void setParam66(String param66) {
        this.param66 = param66;
    }

    public String getParam67() {
        return param67;
    }

    public void setParam67(String param67) {
        this.param67 = param67;
    }

    public String getParam68() {
        return param68;
    }

    public void setParam68(String param68) {
        this.param68 = param68;
    }

    public String getParam69() {
        return param69;
    }

    public void setParam69(String param69) {
        this.param69 = param69;
    }

    public String getParam70() {
        return param70;
    }

    public void setParam70(String param70) {
        this.param70 = param70;
    }

    public String getParam71() {
        return param71;
    }

    public void setParam71(String param71) {
        this.param71 = param71;
    }

    public String getParam72() {
        return param72;
    }

    public void setParam72(String param72) {
        this.param72 = param72;
    }

    public String getParam73() {
        return param73;
    }

    public void setParam73(String param73) {
        this.param73 = param73;
    }

    public String getParam74() {
        return param74;
    }

    public void setParam74(String param74) {
        this.param74 = param74;
    }

    public String getParam75() {
        return param75;
    }

    public void setParam75(String param75) {
        this.param75 = param75;
    }

    public String getParam76() {
        return param76;
    }

    public void setParam76(String param76) {
        this.param76 = param76;
    }

    public String getParam77() {
        return param77;
    }

    public void setParam77(String param77) {
        this.param77 = param77;
    }

    public String getParam78() {
        return param78;
    }

    public void setParam78(String param78) {
        this.param78 = param78;
    }

    public String getParam79() {
        return param79;
    }

    public void setParam79(String param79) {
        this.param79 = param79;
    }

    public String getParam80() {
        return param80;
    }

    public void setParam80(String param80) {
        this.param80 = param80;
    }

    public String getParam81() {
        return param81;
    }

    public void setParam81(String param81) {
        this.param81 = param81;
    }

    public String getParam82() {
        return param82;
    }

    public void setParam82(String param82) {
        this.param82 = param82;
    }

    public String getParam83() {
        return param83;
    }

    public void setParam83(String param83) {
        this.param83 = param83;
    }

    public String getParam84() {
        return param84;
    }

    public void setParam84(String param84) {
        this.param84 = param84;
    }

    public String getParam85() {
        return param85;
    }

    public void setParam85(String param85) {
        this.param85 = param85;
    }

    public String getParam86() {
        return param86;
    }

    public void setParam86(String param86) {
        this.param86 = param86;
    }

    public String getParam87() {
        return param87;
    }

    public void setParam87(String param87) {
        this.param87 = param87;
    }

    public String getParam88() {
        return param88;
    }

    public void setParam88(String param88) {
        this.param88 = param88;
    }

    public String getParam89() {
        return param89;
    }

    public void setParam89(String param89) {
        this.param89 = param89;
    }

    public String getParam90() {
        return param90;
    }

    public void setParam90(String param90) {
        this.param90 = param90;
    }

    public String getParam91() {
        return param91;
    }

    public void setParam91(String param91) {
        this.param91 = param91;
    }

    public String getParam92() {
        return param92;
    }

    public void setParam92(String param92) {
        this.param92 = param92;
    }

    public String getParam93() {
        return param93;
    }

    public void setParam93(String param93) {
        this.param93 = param93;
    }

    public String getParam94() {
        return param94;
    }

    public void setParam94(String param94) {
        this.param94 = param94;
    }

    public String getParam95() {
        return param95;
    }

    public void setParam95(String param95) {
        this.param95 = param95;
    }

    public String getParam96() {
        return param96;
    }

    public void setParam96(String param96) {
        this.param96 = param96;
    }

    public String getParam97() {
        return param97;
    }

    public void setParam97(String param97) {
        this.param97 = param97;
    }

    public String getParam98() {
        return param98;
    }

    public void setParam98(String param98) {
        this.param98 = param98;
    }

    public String getParam99() {
        return param99;
    }

    public void setParam99(String param99) {
        this.param99 = param99;
    }

    public String getParam100() {
        return param100;
    }

    public void setParam100(String param100) {
        this.param100 = param100;
    }

    public String getParam101() {
        return param101;
    }

    public void setParam101(String param101) {
        this.param101 = param101;
    }

    public String getParam102() {
        return param102;
    }

    public void setParam102(String param102) {
        this.param102 = param102;
    }

    public String getParam103() {
        return param103;
    }

    public void setParam103(String param103) {
        this.param103 = param103;
    }

    public String getParam104() {
        return param104;
    }

    public void setParam104(String param104) {
        this.param104 = param104;
    }

    public String getParam105() {
        return param105;
    }

    public void setParam105(String param105) {
        this.param105 = param105;
    }

    public String getParam106() {
        return param106;
    }

    public void setParam106(String param106) {
        this.param106 = param106;
    }

    public String getParam107() {
        return param107;
    }

    public void setParam107(String param107) {
        this.param107 = param107;
    }

    public String getParam108() {
        return param108;
    }

    public void setParam108(String param108) {
        this.param108 = param108;
    }

    public String getParam109() {
        return param109;
    }

    public void setParam109(String param109) {
        this.param109 = param109;
    }

    public String getParam110() {
        return param110;
    }

    public void setParam110(String param110) {
        this.param110 = param110;
    }

    public String getParam111() {
        return param111;
    }

    public void setParam111(String param111) {
        this.param111 = param111;
    }

    public String getParam112() {
        return param112;
    }

    public void setParam112(String param112) {
        this.param112 = param112;
    }

    public String getParam113() {
        return param113;
    }

    public void setParam113(String param113) {
        this.param113 = param113;
    }

    public String getParam114() {
        return param114;
    }

    public void setParam114(String param114) {
        this.param114 = param114;
    }

    public String getParam115() {
        return param115;
    }

    public void setParam115(String param115) {
        this.param115 = param115;
    }

    public String getParam116() {
        return param116;
    }

    public void setParam116(String param116) {
        this.param116 = param116;
    }

    public String getParam117() {
        return param117;
    }

    public void setParam117(String param117) {
        this.param117 = param117;
    }

    public String getParam118() {
        return param118;
    }

    public void setParam118(String param118) {
        this.param118 = param118;
    }

    public String getParam119() {
        return param119;
    }

    public void setParam119(String param119) {
        this.param119 = param119;
    }

    public String getParam120() {
        return param120;
    }

    public void setParam120(String param120) {
        this.param120 = param120;
    }

    public String getParam121() {
        return param121;
    }

    public void setParam121(String param121) {
        this.param121 = param121;
    }

    public String getParam122() {
        return param122;
    }

    public void setParam122(String param122) {
        this.param122 = param122;
    }

    public String getParam123() {
        return param123;
    }

    public void setParam123(String param123) {
        this.param123 = param123;
    }

    public String getParam124() {
        return param124;
    }

    public void setParam124(String param124) {
        this.param124 = param124;
    }

    public String getParam125() {
        return param125;
    }

    public void setParam125(String param125) {
        this.param125 = param125;
    }

    public String getParam126() {
        return param126;
    }

    public void setParam126(String param126) {
        this.param126 = param126;
    }

    public String getParam127() {
        return param127;
    }

    public void setParam127(String param127) {
        this.param127 = param127;
    }

    public String getParam128() {
        return param128;
    }

    public void setParam128(String param128) {
        this.param128 = param128;
    }

    public String getParam129() {
        return param129;
    }

    public void setParam129(String param129) {
        this.param129 = param129;
    }

    public String getParam130() {
        return param130;
    }

    public void setParam130(String param130) {
        this.param130 = param130;
    }

    public String getParam131() {
        return param131;
    }

    public void setParam131(String param131) {
        this.param131 = param131;
    }

    public String getParam132() {
        return param132;
    }

    public void setParam132(String param132) {
        this.param132 = param132;
    }

    public String getParam133() {
        return param133;
    }

    public void setParam133(String param133) {
        this.param133 = param133;
    }

    public String getParam134() {
        return param134;
    }

    public void setParam134(String param134) {
        this.param134 = param134;
    }

    public String getParam135() {
        return param135;
    }

    public void setParam135(String param135) {
        this.param135 = param135;
    }

    public String getParam136() {
        return param136;
    }

    public void setParam136(String param136) {
        this.param136 = param136;
    }

    public String getParam137() {
        return param137;
    }

    public void setParam137(String param137) {
        this.param137 = param137;
    }

    public String getParam138() {
        return param138;
    }

    public void setParam138(String param138) {
        this.param138 = param138;
    }

    public String getParam139() {
        return param139;
    }

    public void setParam139(String param139) {
        this.param139 = param139;
    }

    public String getParam140() {
        return param140;
    }

    public void setParam140(String param140) {
        this.param140 = param140;
    }

    public String getParam141() {
        return param141;
    }

    public void setParam141(String param141) {
        this.param141 = param141;
    }

    public String getParam142() {
        return param142;
    }

    public void setParam142(String param142) {
        this.param142 = param142;
    }

    public String getParam143() {
        return param143;
    }

    public void setParam143(String param143) {
        this.param143 = param143;
    }

    public String getParam144() {
        return param144;
    }

    public void setParam144(String param144) {
        this.param144 = param144;
    }

    public String getParam145() {
        return param145;
    }

    public void setParam145(String param145) {
        this.param145 = param145;
    }

    public String getParam146() {
        return param146;
    }

    public void setParam146(String param146) {
        this.param146 = param146;
    }

    public String getParam147() {
        return param147;
    }

    public void setParam147(String param147) {
        this.param147 = param147;
    }

    public String getParam148() {
        return param148;
    }

    public void setParam148(String param148) {
        this.param148 = param148;
    }

    public String getParam149() {
        return param149;
    }

    public void setParam149(String param149) {
        this.param149 = param149;
    }

    public String getParam150() {
        return param150;
    }

    public void setParam150(String param150) {
        this.param150 = param150;
    }

    public String getParam151() {
        return param151;
    }

    public void setParam151(String param151) {
        this.param151 = param151;
    }

    public String getParam152() {
        return param152;
    }

    public void setParam152(String param152) {
        this.param152 = param152;
    }

    public String getParam153() {
        return param153;
    }

    public void setParam153(String param153) {
        this.param153 = param153;
    }

    public String getParam154() {
        return param154;
    }

    public void setParam154(String param154) {
        this.param154 = param154;
    }

    public String getParam155() {
        return param155;
    }

    public void setParam155(String param155) {
        this.param155 = param155;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rid != null ? rid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof B2WRequest)) {
            return false;
        }
        B2WRequest other = (B2WRequest) object;
        if ((this.rid == null && other.rid != null) || (this.rid != null && !this.rid.equals(other.rid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ke.co.telkom.www.Bank2WalletEmulator.entities.B2WRequest[ rid=" + rid + " ]";
    }
    
}
