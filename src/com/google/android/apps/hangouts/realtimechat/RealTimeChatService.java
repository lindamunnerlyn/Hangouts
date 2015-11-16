// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.realtimechat;

import aid;
import aif;
import ail;
import alt;
import alw;
import amo;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.SmsMessage;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import aoa;
import aoc;
import aon;
import aoq;
import aot;
import aow;
import aoz;
import apk;
import apv;
import ard;
import bzk;
import cab;
import cf;
import cfo;
import cfz;
import cgd;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.phone.DebugActivity;
import com.google.android.apps.hangouts.phone.PackageReplacedReceiver;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;
import crj;
import crq;
import cuy;
import cvl;
import cvv;
import cvz;
import cwg;
import cxr;
import cxv;
import cxw;
import cye;
import cym;
import cyo;
import cyp;
import cyr;
import cyt;
import cyu;
import cyx;
import czm;
import czx;
import dab;
import dae;
import dan;
import dao;
import dau;
import dbm;
import dbp;
import dcf;
import dcg;
import dci;
import dcj;
import dck;
import dcl;
import dcn;
import dcw;
import dcx;
import dcz;
import dde;
import ddf;
import ddg;
import ddn;
import ddo;
import ddp;
import ddu;
import ddv;
import ddw;
import ddx;
import ddy;
import ddz;
import dea;
import deb;
import dec;
import ded;
import def;
import deg;
import deh;
import dei;
import dej;
import dek;
import del;
import dem;
import den;
import deo;
import dep;
import deq;
import der;
import det;
import dev;
import dew;
import dex;
import dfh;
import dfi;
import dfj;
import dfp;
import dfq;
import dfr;
import dft;
import dfy;
import dgh;
import dgj;
import dgk;
import dgm;
import dgn;
import dgo;
import dgp;
import dgq;
import dgr;
import dgs;
import dgt;
import dgu;
import dgv;
import dgw;
import dgx;
import dgy;
import dgz;
import dha;
import dhb;
import dhc;
import dhd;
import dhe;
import dhf;
import dhg;
import dhh;
import dhi;
import dhj;
import dhk;
import dhl;
import dhm;
import dhn;
import dho;
import dhp;
import dhq;
import dhr;
import dhs;
import dhu;
import dhv;
import dhw;
import dhx;
import dhy;
import did;
import die;
import dih;
import dii;
import dij;
import dik;
import dil;
import dim;
import din;
import dio;
import dip;
import dir;
import dis;
import dit;
import diu;
import diw;
import diy;
import dja;
import djb;
import djj;
import djk;
import djo;
import djr;
import djt;
import dju;
import djv;
import djx;
import djy;
import djz;
import dka;
import dkb;
import dke;
import dkf;
import dkg;
import dkh;
import dki;
import dkj;
import dkk;
import dkl;
import dkm;
import dkn;
import dku;
import dkv;
import dkw;
import dkx;
import dlb;
import dlc;
import dld;
import dls;
import dlz;
import dmc;
import dmf;
import dml;
import dmo;
import dmw;
import dmx;
import dmy;
import dmz;
import dnb;
import dne;
import dnf;
import dng;
import dnl;
import dnn;
import dno;
import dnp;
import dns;
import dnt;
import dnw;
import dny;
import dod;
import doy;
import drj;
import dsu;
import dsv;
import due;
import dul;
import ecm;
import edc;
import ede;
import eee;
import eeh;
import eep;
import eev;
import eey;
import efh;
import fik;
import g;
import gcz;
import gda;
import gdd;
import gdv;
import gdy;
import gnd;
import gqz;
import grb;
import grd;
import gz;
import h;
import hlp;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import jjt;
import jkp;
import jmq;
import jnv;
import l;

public class RealTimeChatService extends dlc
{

    private static final boolean a = false;
    private static final efh b = efh.a("RTCS");
    private static boolean c = false;
    private static final int d = Process.myPid();
    private static volatile dhw e = null;
    private static volatile dhx f = null;
    private static final Object g = new Object();
    private static String h;
    private static Set i;
    private static final SparseArray j = new SparseArray();
    private static int k;
    private static final Map l = new gz();
    private static final Queue m = new LinkedBlockingQueue();
    private static Map n = new ConcurrentHashMap();
    private static final CopyOnWriteArrayList o = new CopyOnWriteArrayList();
    private static final CopyOnWriteArrayList p = new CopyOnWriteArrayList();
    private static final Object q = new Object();
    private static android.os.PowerManager.WakeLock r;
    private static gnd s;
    private static boolean t;
    private static final Handler u = new Handler(Looper.getMainLooper());
    private static final Object v = new Object();
    private static final ScheduledExecutorService w = Executors.newSingleThreadScheduledExecutor();
    private static final SparseArray x = new SparseArray();
    private static final SparseArray y = new SparseArray();
    private boolean A;
    private ServiceConnection B;
    private dkw C;
    private volatile dls z;

    public RealTimeChatService()
    {
        super("RealTimeChatService");
        B = new dgn(this);
    }

    public RealTimeChatService(String s1)
    {
        super(s1);
        B = new dgn(this);
    }

    public static int a(int i1, int j1, ddg ddg1)
    {
        Intent intent = a(i1, 153);
        intent.putExtra("recent_call_type", j1);
        intent.putExtra("recent_call_action_info", ddg1);
        return c(intent, jmq.a());
    }

    public static int a(int i1, int j1, boolean flag)
    {
        Intent intent = a(i1, 19);
        intent.putExtra("setselfinfo_bit", j1);
        intent.putExtra("setselfinfo_bit_value", flag);
        return c(intent, jmq.a());
    }

    public static int a(int i1, long l1, String s1, boolean flag)
    {
        Intent intent = a(i1, 190);
        intent.putExtra("recent_call_timestamp", l1);
        intent.putExtra("recent_call_rate", s1);
        intent.putExtra("recent_call_is_free_call", flag);
        return c(intent, jmq.a());
    }

    public static int a(int i1, cuy cuy1, String s1, String s2, String s3)
    {
        Intent intent = a(i1, 90);
        intent.putExtra("chat_acl_key", cuy1.ordinal());
        intent.putExtra("chat_acl_circle_id", s1);
        intent.putExtra("chat_acl_circle_name", s2);
        intent.putExtra("chat_acl_level", s3);
        return c(intent, jmq.a());
    }

    public static int a(int i1, String s1)
    {
        Intent intent = a(i1, 175);
        intent.putExtra("member_gaiaid", s1);
        return c(intent, jmq.a());
    }

    public static int a(int i1, String s1, ContentValues contentvalues)
    {
        Intent intent = a(i1, 193);
        intent.putExtra("gaia_id", s1);
        intent.putExtra("content_values", contentvalues);
        return c(intent, jmq.a());
    }

    public static int a(int i1, boolean flag)
    {
        dke dke1 = dke.b(i1);
        if (!flag && !dke1.e() && !dke1.f())
        {
            if (a)
            {
                e((new StringBuilder(59)).append("SyncBaselineSuggestedContactsOperation is idle: ").append(i1).toString());
            }
            return -1;
        } else
        {
            Intent intent = a(i1, 56);
            intent.putExtra("force_execution", flag);
            return c(intent, jmq.a());
        }
    }

    public static int a(aoa aoa1, int i1)
    {
        aoa1 = a(aoa1.h(), 54);
        aoa1.putExtra("conversation_sync_filter", i1);
        return c(aoa1, jmq.a());
    }

    public static int a(aoa aoa1, int i1, int j1)
    {
        aoa1 = a(aoa1.h(), 142);
        aoa1.putExtra("hangout_type", i1);
        aoa1.putExtra("hangout_topic", null);
        aoa1.putExtra("hangout_media_type", j1);
        return c(aoa1, jmq.a());
    }

    public static int a(aoa aoa1, int i1, boolean flag)
    {
        aoa1 = a(aoa1.h(), 121);
        aoa1.putExtra("extra_rich_presence_type", i1);
        aoa1.putExtra("extra_rich_presence_type_enabled", flag);
        return c(aoa1, jmq.a());
    }

    public static int a(aoa aoa1, long l1)
    {
        aoa1 = a(aoa1.h(), 81);
        aoa1.putExtra("scroll_timestamp", System.currentTimeMillis());
        aoa1.putExtra("scroll_to_item_timestamp", l1);
        return c(aoa1, jmq.a());
    }

    public static int a(aoa aoa1, aid aid1, String s1)
    {
        aoa1 = a(aoa1.h(), 185);
        aoa1.putExtra("audience", aid1);
        aoa1.putExtra("original_conversation_id", s1);
        aoa1.putExtra("conversation_lookup", aot.a);
        return c(aoa1, jmq.a());
    }

    public static int a(aoa aoa1, String s1, int i1)
    {
        aoa1 = a(aoa1.h(), 38, s1);
        aoa1.putExtra("notification_level", i1);
        return c(aoa1, jmq.a());
    }

    public static int a(aoa aoa1, String s1, long l1)
    {
        aoa1 = a(aoa1.h(), 91, s1);
        aoa1.putExtra("timestamp", l1);
        return c(aoa1, jmq.a());
    }

    public static int a(aoa aoa1, String s1, long l1, boolean flag)
    {
        return a(aoa1, new String[] {
            s1
        }, new long[] {
            l1
        }, flag, false);
    }

    public static int a(aoa aoa1, String s1, aid aid1)
    {
        aoa1 = a(aoa1.h(), 32, s1);
        aoa1.putExtra("audience", aid1);
        return c(aoa1, jmq.a());
    }

    public static int a(aoa aoa1, String s1, String s2)
    {
        aoa1 = a(aoa1.h(), 36);
        aoa1.putExtra("conversation_id", s1);
        aoa1.putExtra("message_id", s2);
        return c(aoa1, jmq.a());
    }

    public static int a(aoa aoa1, String s1, String s2, int i1)
    {
        aoa1 = a(aoa1.h(), 47, s1);
        aoa1.putExtra("message_id", s2);
        aoa1.putExtra("error", i1);
        return c(aoa1, jmq.a());
    }

    public static int a(aoa aoa1, String s1, String s2, String s3, String s4, int i1, String s5, int j1, 
            int k1, String s6, String s7, boolean flag, fik fik, int l1)
    {
        Intent intent;
        intent = a(aoa1.h(), 31, s1);
        intent.putExtra("message_id", s2);
        intent.putExtra("message_text", s3);
        intent.putExtra("uri", s4);
        intent.putExtra("rotation", i1);
        intent.putExtra("picasa_photo_id", s5);
        intent.putExtra("width", j1);
        intent.putExtra("height", k1);
        intent.putExtra("content_type", s6);
        intent.putExtra("subject", s7);
        intent.putExtra("requires_mms", flag);
        if (fik != null)
        {
            intent.putExtra("place", bzk.a(fik));
        }
        intent.putExtra("timestamp", SystemClock.elapsedRealtime() * 1000L);
        intent.putExtra("otr_state", l1);
        if (!eep.a() || s3 == null || !s3.startsWith("///") || !s3.endsWith("///")) goto _L2; else goto _L1
_L1:
        s2 = s3.substring(3, s3.length() - 3);
        s3 = s2.split("\\.");
        if (s3.length <= 0) goto _L4; else goto _L3
_L3:
        i1 = Integer.parseInt(s3[0]);
_L7:
        if (s3.length <= 1) goto _L6; else goto _L5
_L5:
        long l2 = Long.parseLong(s3[1]);
_L8:
        (new Thread(new dhj(i1, aoa1, s1, s2, s4, s5, j1, k1, s6, s7, flag, fik, l2))).start();
_L2:
        return c(intent, jmq.a());
_L4:
        i1 = 10;
          goto _L7
_L6:
        l2 = 500L;
          goto _L8
        aoa1;
          goto _L2
    }

    public static int a(aoa aoa1, String s1, String s2, String s3, boolean flag, boolean flag1)
    {
        aoa1 = a(aoa1.h(), 92);
        aoa1.putExtra("member_gaiaid", s1);
        aoa1.putExtra("phone_number", s2);
        aoa1.putExtra("user_name", s3);
        aoa1.putExtra("blocked", flag);
        aoa1.putExtra("retry_request", flag1);
        return c(aoa1, jmq.a());
    }

    public static int a(aoa aoa1, String s1, boolean flag)
    {
        aoa1 = a(aoa1.h(), 84, s1);
        aoa1.putExtra("insert_error_message", flag);
        return c(aoa1, jmq.a());
    }

    public static int a(aoa aoa1, String s1, boolean flag, boolean flag1, boolean flag2)
    {
        aoa1 = a(aoa1.h(), 41, s1);
        aoa1.putExtra("accept", flag);
        aoa1.putExtra("block_inviter", flag2);
        aoa1.putExtra("report_inviter", flag1);
        return c(aoa1, jmq.a());
    }

    public static int a(aoa aoa1, String s1, String as[])
    {
        aoa1 = a(aoa1.h(), 144, s1);
        aoa1.putExtra("event_ids", as);
        return c(aoa1, jmq.a());
    }

    public static int a(aoa aoa1, ArrayList arraylist, String s1, boolean flag)
    {
        aoa1 = a(aoa1.h(), 59);
        aoa1.putExtra("batch_gebi_tag", s1);
        aoa1.putExtra("from_contact_lookup", flag);
        aoa1.putParcelableArrayListExtra("com.google.android.apps.hangouts.EntityLookupSpecs", arraylist);
        return c(aoa1, jmq.a());
    }

    public static int a(aoa aoa1, jkp jkp1)
    {
        aoa1 = a(aoa1.h(), 68);
        aoa1.putExtra("hangout_invite_receipt", jkp.toByteArray(jkp1));
        return c(aoa1, jmq.a());
    }

    public static int a(aoa aoa1, byte abyte0[], boolean flag)
    {
        aoa1 = a(aoa1.h(), 176);
        aoa1.putExtra("pdu", abyte0);
        aoa1.putExtra("is_sms_read", flag);
        return c(aoa1, jmq.a());
    }

    public static int a(aoa aoa1, String as[], long al[], boolean flag, boolean flag1)
    {
        aoa1 = a(aoa1.h(), 72);
        aoa1.putExtra("conversationids", as);
        aoa1.putExtra("timestamps", al);
        aoa1.putExtra("archive", flag);
        aoa1.putExtra("perform_locally", flag1);
        return c(aoa1, jmq.a());
    }

    public static int a(aow aow1, String s1, long l1)
    {
        aow1 = a(aow1.f().h(), 111);
        aow1.putExtra("conversation_id", s1);
        aow1.putExtra("extra_pending_conversation_operations", l1);
        return c(aow1, jmq.a());
    }

    public static int a(List list, aoa aoa1)
    {
        String s1 = "";
        SparseArray sparsearray = j;
        sparsearray;
        JVM INSTR monitorenter ;
        int j1 = list.size();
        int i1 = 0;
_L2:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        String s2;
        int k1;
        k1 = k;
        k = k1 + 1;
        s1 = String.valueOf(s1);
        s2 = (new StringBuilder(String.valueOf(s1).length() + 11)).append(s1).append(k1).toString();
        s1 = s2;
        if (i1 >= j1 - 1)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        s1 = String.valueOf(s2).concat("|");
        j.put(k1, list.get(i1));
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        sparsearray;
        JVM INSTR monitorexit ;
        list = a(aoa1.h(), 71);
        list.putExtra("simulated_event_msg_num", s1);
        return c(list, jmq.a());
        list;
        sparsearray;
        JVM INSTR monitorexit ;
        throw list;
    }

    private static Intent a(int i1, int j1)
    {
        Intent intent = i(j1);
        intent.putExtra("account_id", i1);
        return intent;
    }

    private static Intent a(int i1, int j1, String s1)
    {
        Intent intent = new Intent(g.nU, com/google/android/apps/hangouts/realtimechat/RealTimeChatService);
        h(j1);
        intent.putExtra("op", j1);
        intent.putExtra("account_id", i1);
        intent.putExtra("conversation_id", s1);
        return intent;
    }

    public static dkw a(RealTimeChatService realtimechatservice, dkw dkw1)
    {
        realtimechatservice.C = dkw1;
        return dkw1;
    }

    public static dls a(RealTimeChatService realtimechatservice, dls dls)
    {
        realtimechatservice.z = dls;
        return dls;
    }

    private Object a(dcw dcw1, Intent intent, dgj dgj1)
    {
        if (c && dgj1 == null)
        {
            eev.f("Babel", "executeOperation called with no operation");
            return null;
        }
        dgj1.d = intent.getStringExtra("stack_trace");
        dgj1.a();
        int i1 = intent.getIntExtra("rid", -1);
        did did1 = new did(i1, dgj1.b(), null);
        Object obj = dgj1.c();
        a(intent, did1, obj);
        if (dgj1.a(dcw1, i1, z))
        {
            do
            {
                dcw1 = (dfy)m.poll();
                if (dcw1 == null)
                {
                    break;
                }
                intent = dcn.g(((dgj) (dcw1)).b.b);
                if (intent == null)
                {
                    dcw1 = String.valueOf(eev.b(((dgj) (dcw1)).b.b.a()));
                    if (dcw1.length() != 0)
                    {
                        dcw1 = "Account is not valid. Skip parasite operation:".concat(dcw1);
                    } else
                    {
                        dcw1 = new String("Account is not valid. Skip parasite operation:");
                    }
                    eev.f("Babel", dcw1);
                } else
                {
                    dcw1.a(2);
                    dcw1.a();
                    dcw1.a(intent, 0, z);
                }
            } while (true);
            diu.l();
        }
        return obj;
    }

    public static String a(Intent intent, aoa aoa1)
    {
        int i1 = intent.getIntExtra("op", -1);
        i1;
        JVM INSTR lookupswitch 2: default 36
    //                   39: 43
    //                   53: 93;
           goto _L1 _L2 _L3
_L1:
        aoa1 = g(i1);
_L5:
        return aoa1;
_L2:
        intent = intent.getStringExtra("server_response_type");
        intent = String.valueOf(intent.substring(intent.lastIndexOf('.') + 1));
        if (intent.length() != 0)
        {
            return "ServerResponse: ".concat(intent);
        } else
        {
            return new String("ServerResponse: ");
        }
_L3:
        Iterator iterator = dmw.a(intent, aoa1, false).iterator();
        intent = "ServerUpdate: ";
        do
        {
            aoa1 = intent;
            if (!iterator.hasNext())
            {
                continue;
            }
            aoa1 = (dmw)iterator.next();
            intent = String.valueOf(intent);
            aoa1 = String.valueOf(aoa1.getClass().getSimpleName());
            intent = (new StringBuilder(String.valueOf(intent).length() + 2 + String.valueOf(aoa1).length())).append(intent).append(aoa1).append(", ").toString();
        } while (true);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static String a(String s1)
    {
        synchronized (l)
        {
            s1 = (String)l.get(s1);
        }
        return s1;
        s1;
        map;
        JVM INSTR monitorexit ;
        throw s1;
    }

    private List a(Context context, aoa aoa1, dcw dcw1, cxr cxr1)
    {
        dgk dgk1 = new dgk();
        LinkedList linkedlist = new LinkedList();
        if (a)
        {
            String s1 = String.valueOf(cxr1);
            eev.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 17)).append("processResponse: ").append(s1).toString());
        }
        a(context, aoa1, cxr1, dgk1, ((List) (linkedlist)));
        cfo.a(context, aoa1.h(), dgk1.g());
        context = dgk1.c();
        if (!context.isEmpty())
        {
            if (eev.a("Babel", 3))
            {
                int i1 = context.size();
                aoa1 = String.valueOf(cxr1.getClass().getSimpleName());
                eev.c("Babel", (new StringBuilder(String.valueOf(aoa1).length() + 62)).append("processResponse: sending ").append(i1).append(" requests from processing ").append(aoa1).toString());
            }
            dcw1.a(context, 0, z);
        }
        return linkedlist;
    }

    public static void a()
    {
        Intent intent = new Intent(g.nU, com/google/android/apps/hangouts/realtimechat/RealTimeChatService);
        intent.putExtra("op", 74);
        b(intent, jmq.a());
    }

    public static void a(int i1)
    {
        a(i1, false, false, 0, false);
        a(i1, false);
        j(i1);
        k(i1);
        ard.a(i1);
    }

    public static void a(int i1, int j1, ArrayList arraylist, int k1)
    {
        dcn.g(dcn.e(j1)).a(new dgh(arraylist, k1), i1);
    }

    public static void a(int i1, long l1)
    {
        if (r())
        {
            aoa aoa1 = dcn.e(i1);
            ((alw)hlp.a(g.nU, alw)).a(new djv(aoa1, l1));
            return;
        } else
        {
            Intent intent = a(i1, 66);
            intent.putExtra("dnd_expiration", l1);
            b(intent, jmq.a());
            return;
        }
    }

    public static void a(int i1, long l1, boolean flag, int j1)
    {
        Intent intent = a(i1, 140);
        intent.putExtra("notification_row_id", l1);
        intent.putExtra("mms_auto_retrieve", flag);
        intent.putExtra("error", j1);
        c(intent, jmq.a());
    }

    public static void a(int i1, aoa aoa1, did did1)
    {
        u.post(new dgv(i1, aoa1, did1));
    }

    public static void a(int i1, cxr cxr1)
    {
        Intent intent = a(i1, 39);
        long l1 = -1L;
        byte abyte0[] = cxr1.f();
        int j1 = abyte0.length;
        long l2 = g.a(g.nU, "babel_maximum_request_writer_intent_extra_size", 0L);
        if ((long)j1 > l2)
        {
            l1 = dlz.a(g.nU).a(cxr1);
            intent.putExtra("server_response_id", l1);
        } else
        {
            intent.putExtra("server_response", abyte0);
        }
        intent.putExtra("server_response_type", cxr1.getClass().getName());
        intent.putExtra("rid", cxr1.b());
        if (a)
        {
            cxr1 = String.valueOf(cxr1);
            eev.b("Babel", (new StringBuilder(String.valueOf(cxr1).length() + 104)).append("handleServerResponse: ").append(cxr1).append(" size(").append(j1).append(") stored response id: ").append(l1).append(" accountId: ").append(i1).toString());
        }
        b(intent, jmq.a());
    }

    public static void a(int i1, String s1, String s2)
    {
        s1 = a(i1, 101, s1);
        s1.putExtra("conversation_name", s2);
        b(s1, jmq.a());
    }

    public static void a(int i1, String s1, byte abyte0[], long l1, boolean flag)
    {
        Intent intent = a(i1, 116);
        intent.putExtra("mms_content_location", s1);
        intent.putExtra("mms_transaction_id", abyte0);
        intent.putExtra("notification_row_id", l1);
        intent.putExtra("mms_auto_retrieve", flag);
        c(intent, jmq.a());
    }

    public static void a(int i1, boolean flag, String s1)
    {
        Intent intent = a(i1, 201);
        intent.putExtra("phone_number", s1);
        intent.putExtra("callerid_set_unset", flag);
        b(intent, jmq.a());
    }

    public static void a(int i1, boolean flag, boolean flag1, int j1, boolean flag2)
    {
        a(i1, flag, flag1, j1, flag2, -1L);
    }

    public static void a(int i1, boolean flag, boolean flag1, int j1, boolean flag2, long l1)
    {
        obj = diu.b(i1);
        if (!((diu) (obj)).m()) goto _L2; else goto _L1
_L1:
        Object obj1;
        boolean flag3 = false;
        if (flag1)
        {
            flag3 = ((diu) (obj)).n();
        }
        obj1 = new Intent("com.google.android.apps.hangouts.SYNC");
        ((Intent) (obj1)).putExtra("op", 55);
        ((Intent) (obj1)).putExtra("account_id", i1);
        int k1;
        long l2;
        if (flag1 && !flag3)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((Intent) (obj1)).putExtra("no_missed_events_expected", flag1);
        ((Intent) (obj1)).putExtra("suppress_notifications", flag);
        if (!flag2) goto _L4; else goto _L3
_L3:
        ((Intent) (obj1)).putExtra("sync_type", 1);
_L8:
        ((Intent) (obj1)).putExtra("expected_hash", l1);
        k1 = eee.a(i1, 1, 109, null);
        obj1 = PendingIntent.getBroadcast(g.nU, k1, ((Intent) (obj1)), 0x10000000);
        l1 = SystemClock.elapsedRealtime();
        synchronized (y)
        {
            l2 = g.a((Long)y.get(i1), 0L);
        }
        if (l1 >= l2 + 1000L) goto _L5; else goto _L2
_L2:
        return;
_L4:
        if (l1 != -1L)
        {
            ((Intent) (obj1)).putExtra("sync_type", 2);
        }
        continue; /* Loop/switch isn't completed */
        obj;
        sparsearray1;
        JVM INSTR monitorexit ;
        throw obj;
_L5:
        long l3;
        l3 = ((diu) (obj)).c(j1);
        l1 = l3 - l1;
        if (l1 <= 5000L)
        {
            ScheduledFuture scheduledfuture = (ScheduledFuture)x.get(i1);
            if (scheduledfuture == null || scheduledfuture.isDone() || scheduledfuture.isCancelled())
            {
                break; /* Loop/switch isn't completed */
            }
            l3 = scheduledfuture.getDelay(TimeUnit.MILLISECONDS);
            if (0L >= l1 || l1 >= l3)
            {
                continue; /* Loop/switch isn't completed */
            }
            scheduledfuture.cancel(false);
            break; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_351;
        if (true) goto _L2; else goto _L6
_L6:
        x.put(i1, w.schedule(new dhm(((PendingIntent) (obj1)), i1), l1, TimeUnit.MILLISECONDS));
        return;
        ((AlarmManager)g.nU.getSystemService("alarm")).set(2, l3, ((PendingIntent) (obj1)));
        synchronized (y)
        {
            y.put(i1, Long.valueOf(l3));
        }
        return;
        exception;
        sparsearray;
        JVM INSTR monitorexit ;
        throw exception;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static void a(long l1, long l2)
    {
        ((AlarmManager)g.nU.getSystemService("alarm")).setInexactRepeating(2, l1, l2, s());
    }

    private void a(Context context, aoa aoa1, cxr cxr1, dgk dgk1, List list)
    {
        if (eev.a("Babel", 3))
        {
            String s1 = String.valueOf(cxr1.getClass().getSimpleName());
            String s2 = String.valueOf(aoa1.a());
            eev.c("Babel", (new StringBuilder(String.valueOf(s1).length() + 26 + String.valueOf(s2).length())).append("processResponse ").append(s1).append(" for acct ").append(s2).toString());
        }
        if (cxr1 instanceof czm)
        {
            czm czm1 = (czm)cxr1;
            Object obj;
            if (czm1.k() == 1)
            {
                obj = czm1.m();
                Iterator iterator;
                if (!TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    dcn.a(aoa1, ((String) (obj)));
                } else
                {
                    eev.g("Babel", "Full jid should not be empty");
                }
            } else
            {
                obj = czm1.l();
                if (TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    obj = String.valueOf(eev.b(aoa1.a()));
                    if (((String) (obj)).length() != 0)
                    {
                        obj = "Account unregistered: ".concat(((String) (obj)));
                    } else
                    {
                        obj = new String("Account unregistered: ");
                    }
                    eev.e("Babel", ((String) (obj)));
                } else
                {
                    String s3 = String.valueOf(eev.b(aoa1.a()));
                    eev.e("Babel", (new StringBuilder(String.valueOf(obj).length() + 44 + String.valueOf(s3).length())).append("Removed account ").append(((String) (obj))).append(" unregistered using account:").append(s3).toString());
                }
            }
            obj = ((gqz)hlp.a(context, gqz)).b(aoa1.h());
            for (iterator = hlp.c(context, dij).iterator(); iterator.hasNext(); ((dij)iterator.next()).a(((grd) (obj)), czm1)) { }
            ((grd) (obj)).d();
        }
        if (!(cxr1 instanceof dab)) goto _L2; else goto _L1
_L1:
        djt djt1 = djt.a(aoa1);
        if (!((dab)cxr1).g) goto _L4; else goto _L3
_L3:
        eev.f("Babel", "Client is invalid. Force retry GcmRegistration");
        def.c().h();
_L11:
        djt1.a(3);
_L2:
        if (cxr1 instanceof dao)
        {
            dao dao1 = (dao)cxr1;
            if (aoa1 != null)
            {
                b(aoa1.h(), dao1);
            }
        }
        if (cxr1 instanceof dan)
        {
            dan dan1 = (dan)cxr1;
            if (aoa1 != null)
            {
                b(aoa1.h(), dan1);
            }
        }
        Object obj1;
        if (cxr1 instanceof cyx)
        {
            Object obj2 = (cyx)cxr1;
            dke dke1 = dke.b(aoa1.h());
            if (a)
            {
                obj1 = String.valueOf(aoa1.a());
                if (((String) (obj1)).length() != 0)
                {
                    obj1 = "SyncBaselineSuggestedContactsOperation successful: ".concat(((String) (obj1)));
                } else
                {
                    obj1 = new String("SyncBaselineSuggestedContactsOperation successful: ");
                }
                e(((String) (obj1)));
            }
            dke1.a(3);
            aon.a(aoa1, ((cyx) (obj2)).k(), true);
            aon.a(aoa1, ((cyx) (obj2)).l(), false);
        }
        if (cxr1 instanceof cym)
        {
            obj1 = (cym)cxr1;
            obj2 = dih.b(aoa1.h());
            if (((cym) (obj1)).n() && ((dih) (obj2)).d() == 2)
            {
                if (a)
                {
                    obj1 = String.valueOf(aoa1.a());
                    if (((String) (obj1)).length() != 0)
                    {
                        obj1 = "RefreshParticipantsOperationOperation successful: ".concat(((String) (obj1)));
                    } else
                    {
                        obj1 = new String("RefreshParticipantsOperationOperation successful: ");
                    }
                    e(((String) (obj1)));
                }
                ((dih) (obj2)).a(3);
            }
        }
        if (cxr1 instanceof dae)
        {
            obj1 = (dae)cxr1;
            u.post(new dhf(aoa1, ((dae) (obj1))));
        }
        if (!(cxr1 instanceof cyu)) goto _L6; else goto _L5
_L5:
        context = (cyu)cxr1;
        u.post(new dhe(aoa1, context));
_L8:
        return;
_L4:
        if (a)
        {
            obj1 = String.valueOf(aoa1.a());
            if (((String) (obj1)).length() != 0)
            {
                obj1 = "SetActiveClientOperation successful: ".concat(((String) (obj1)));
            } else
            {
                obj1 = new String("SetActiveClientOperation successful: ");
            }
            e(((String) (obj1)));
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (cxr1 instanceof cyr)
        {
            cyr cyr1 = (cyr)cxr1;
            a(cyr1.k(), cyr1.l());
            if (cyr1.l() == null || cyr1.l().size() == 0)
            {
                aow aow1 = new aow(context, aoa1.h());
                aow1.a(0, aow1.O(cyr1.k()), cyr1.k());
            }
        }
        if (cxr1 instanceof cyp)
        {
            cyp cyp1 = (cyp)cxr1;
            long l1;
            long l2;
            if (TextUtils.isEmpty(cyp1.k()))
            {
                gdv.a("hangoutId is empty");
            } else
            {
                dgk1.a(new cvl(cyp1.k(), cyp1.l()));
            }
        }
        if (!(cxr1 instanceof cxv) && !(cxr1 instanceof czx))
        {
            list.add(new did(cxr1.b(), 1, cxr1));
        }
        if (cxr1 instanceof cxw)
        {
            list = (cxw)cxr1;
            u.post(new dhi(list));
        }
        if (cxr1 instanceof cyt)
        {
            list = (cyt)cxr1;
            u.post(new dhg(list));
        }
        if (cxr1 instanceof cye)
        {
            list = (cye)cxr1;
            u.post(new dhh(list));
        }
        if (cxr1 instanceof cyo)
        {
            list = (cyo)cxr1;
            u.post(new dhk(list));
        }
        l1 = 0L;
        if (a)
        {
            l1 = SystemClock.elapsedRealtime();
        }
        dgk1.a(aoa1);
        if (aoc.g(context, aoa1.h()))
        {
            context = null;
        } else
        {
            context = new aow(context, aoa1.h());
        }
        aoq.a(context, cxr1, dgk1);
        dgk1.e();
        if (a)
        {
            l2 = SystemClock.elapsedRealtime();
            if (l2 - l1 > 1000L)
            {
                dgk1 = String.valueOf(cxr1.getClass().getSimpleName());
                e((new StringBuilder(String.valueOf(dgk1).length() + 44)).append("processResponse ").append(dgk1).append(" took ").append(l2 - l1).append("ms").toString());
            }
        }
        if (!(cxr1 instanceof czx) || context == null) goto _L8; else goto _L7
_L7:
        dgk1 = (czx)cxr1;
        if (dgk1.t().length <= 0 || !dgk1.u()) goto _L8; else goto _L9
_L9:
        if (dgk1.q() != null && dgk1.q().length > 0 && dgk1.q()[0] != null && context.ai(dgk1.q()[0]) != null)
        {
            eev.c("Babel", "sticker photo no upload");
            return;
        }
        eev.c("Babel", "initiate full res upload");
        cxr1 = dgk1.k();
        dgk1 = dgk1.o();
        context = context.e(cxr1, dgk1);
        if (context == null || ((apk) (context)).j == null)
        {
            eev.g("Babel", "empty image url, can't upload");
            return;
        }
        list = g.nU.getContentResolver().openFileDescriptor(Uri.parse(((apk) (context)).j), "r");
        list.getStatSize();
        list.close();
        context = (new dfq(aoa1.h(), ((apk) (context)).j)).a(dgk1).b(cxr1).c(((apk) (context)).m).d(((apk) (context)).n).e("image/jpeg").a();
        dcn.g(aoa1).a(h.a(new dfp[] {
            context
        }), dir.b().a(), z);
        return;
        context;
        eev.e("Babel", "error finding image", context);
        return;
        context;
        eev.e("Babel", "error closing image", context);
        return;
        if (true) goto _L11; else goto _L10
_L10:
    }

    private static void a(Intent intent, did did1, Object obj)
    {
        u.post(new dhq(intent, did1, obj));
        gdy.a(new dhr(intent, did1, obj));
    }

    public static void a(Intent intent, did did1, Object obj, boolean flag)
    {
        aoa aoa1;
        int i1;
        int j1;
        int l1;
        j1 = intent.getIntExtra("op", -1);
        i1 = intent.getIntExtra("rid", -1);
        l1 = intent.getIntExtra("account_id", -1);
        aoa1 = dcn.e(l1);
        if (aoa1 != null) goto _L2; else goto _L1
_L1:
        eev.f("Babel", (new StringBuilder(68)).append("[onIntentProcessed] Skipping intent for invalid account: ").append(l1).toString());
_L4:
        return;
_L2:
        if (a)
        {
            String s1 = String.valueOf(g(j1));
            e((new StringBuilder(String.valueOf(s1).length() + 71)).append("[onIntentProcessed] opCode=").append(s1).append(", requestId=").append(i1).append(", account=").append(l1).toString());
        }
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (j1 == 39 && obj != null)
        {
            intent = ((List)obj).iterator();
            while (intent.hasNext()) 
            {
                did1 = (did)intent.next();
                obj = p.iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    ((dhv)((Iterator) (obj)).next()).a(did1.a(), aoa1, did1);
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        switch (j1)
        {
        default:
            return;

        case 30: // '\036'
            intent = (ddo)obj;
            obj = o.iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                ((dhy)((Iterator) (obj)).next()).a(i1, aoa1, intent, did1);
            }
            break;

        case 39: // '\''
            if (obj != null)
            {
                intent = ((List)obj).iterator();
                while (intent.hasNext()) 
                {
                    did1 = (did)intent.next();
                    i1 = did1.a();
                    obj = o.iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        ((dhy)((Iterator) (obj)).next()).a(i1, aoa1, did1);
                    }
                }
            }
            break;

        case 185: 
            obj = (ddo)obj;
            int k1 = intent.getIntExtra("original_conversation_id", -1);
            intent = o.iterator();
            while (intent.hasNext()) 
            {
                ((dhy)intent.next()).a(i1, aoa1, ((ddo) (obj)), did1, k1);
            }
            break;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public static void a(Uri uri, long l1, boolean flag)
    {
        if (!dcn.j())
        {
            return;
        } else
        {
            Intent intent = a(dcn.l().h(), 112);
            intent.putExtra("uri", uri);
            intent.putExtra("thread_id", -1L);
            intent.putExtra("notification_row_id", l1);
            intent.putExtra("mms_auto_retrieve", flag);
            c(intent, jmq.a());
            return;
        }
    }

    public static void a(aoa aoa1)
    {
        dcn.g(aoa1).a(new det(true), dir.b().a());
    }

    private void a(aoa aoa1, dcw dcw1, dmw dmw1, long l1, long l2, 
            long l3, jnv jnv1)
    {
        if (eev.a("Babel", 3))
        {
            String s1 = null;
            if (dmw1 instanceof dmy)
            {
                s1 = ((dmy)dmw1).c;
            }
            String s2 = String.valueOf(dmw1.getClass().getSimpleName());
            String s3 = String.valueOf(aoa1.b());
            if (s1 != null)
            {
                s1 = String.valueOf(s1);
                if (s1.length() != 0)
                {
                    s1 = "update convId ".concat(s1);
                } else
                {
                    s1 = new String("update convId ");
                }
            } else
            {
                s1 = "";
            }
            eev.c("Babel", (new StringBuilder(String.valueOf(s2).length() + 32 + String.valueOf(s3).length() + String.valueOf(s1).length())).append("processServerUpdate: ").append(s2).append(", account: ").append(s3).append(s1).toString());
        }
        if (!(dmw1 instanceof dmx)) goto _L2; else goto _L1
_L1:
        if (((dmx)dmw1).a != 1)
        {
            if (a)
            {
                dcw1 = String.valueOf(aoa1.a());
                if (dcw1.length() != 0)
                {
                    dcw1 = "Clearing active client time stamp for account: ".concat(dcw1);
                } else
                {
                    dcw1 = new String("Clearing active client time stamp for account: ");
                }
                e(dcw1);
            }
            djt.a(aoa1).h();
        }
_L4:
        return;
_L2:
        if (!(dmw1 instanceof dnn))
        {
            break; /* Loop/switch isn't completed */
        }
        dcw1 = (dnn)dmw1;
        if (((dnn) (dcw1)).b == 1)
        {
            (new aow(this, aoa1.h())).s(((dnn) (dcw1)).a);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!(dmw1 instanceof dnp))
        {
            break; /* Loop/switch isn't completed */
        }
        dcw1 = (dnp)dmw1;
        if (((dnp) (dcw1)).b)
        {
            l1 = ((dnp) (dcw1)).a;
            if (aoa1 != null)
            {
                ((drj)hlp.a(getApplicationContext(), drj)).a(aoa1.h(), l1);
            }
            b(aoa1, l1);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (dmw1 instanceof dns)
        {
            dcw1 = (dns)dmw1;
            aoa1 = new aow(this, aoa1.h());
            (new dck(dcw1)).b(aoa1);
            return;
        }
        if (dmw1 instanceof dmz)
        {
            dcw1 = (dmz)dmw1;
            new dgk();
            aoa1 = new aow(this, aoa1.h());
            (new ddf(dcw1)).a(aoa1);
            return;
        }
        if (!(dmw1 instanceof dnb))
        {
            break; /* Loop/switch isn't completed */
        }
        dmw1 = ((dnb)dmw1).c;
        dcw1 = String.valueOf(dmw1);
        if (dcw1.length() != 0)
        {
            dcw1 = "ContactsNotification.selfFanoutId == ".concat(dcw1);
        } else
        {
            dcw1 = new String("ContactsNotification.selfFanoutId == ");
        }
        e(dcw1);
        if (!cvv.c(dmw1))
        {
            a(aoa1.h(), true);
            return;
        }
        if (true) goto _L4; else goto _L6
_L6:
        if (dmw1 instanceof dne)
        {
            dcw1 = (dne)dmw1;
            aoa1 = new aow(this, aoa1.h());
            (new ddw(dcw1)).a(aoa1);
            return;
        }
        if (dmw1 instanceof dnl)
        {
            dcw1 = (dnl)dmw1;
            new dgk();
            aoa1 = new aow(this, aoa1.h());
            (new dkl(dcw1)).a(aoa1);
            return;
        }
        if (dmw1 instanceof dno)
        {
            dcw1 = (dno)dmw1;
            dmw1 = ((gqz)hlp.a(g.nU, gqz)).b(aoa1.h());
            a(((grd) (dmw1)), ((dno) (dcw1)).a);
            dmw1.d();
            f(aoa1);
            return;
        }
        if (dmw1 instanceof dnf)
        {
            a(aoa1, (dnf)dmw1);
            return;
        }
        Context context = getApplicationContext();
        Object obj = new dgk();
        int i1 = aoa1.h();
        ((dgk) (obj)).a(aoa1);
        ((dgk) (obj)).b();
        aoq.a(new aow(g.nU, i1), dmw1, ((dgk) (obj)), l1, l2, l3);
        ((dgk) (obj)).e();
        Object obj1 = ((dgk) (obj)).c();
        if (!((List) (obj1)).isEmpty())
        {
            if (eev.a("Babel", 3))
            {
                int j1 = ((List) (obj1)).size();
                String s4 = String.valueOf(dmw1.getClass().getSimpleName());
                eev.c("Babel", (new StringBuilder(String.valueOf(s4).length() + 66)).append("processServerUpdate: sending ").append(j1).append(" requests from processing ").append(s4).toString());
            }
            if (dcw1 != null)
            {
                dcw1.a(((java.util.Collection) (obj1)), 0);
            }
        }
        obj1 = ((dgk) (obj)).g();
        if (eev.a("Babel", 3))
        {
            dcw1 = String.valueOf(((dgm) (obj1)).toString());
            dng dng1;
            if (dcw1.length() != 0)
            {
                dcw1 = "update should trigger notification? ".concat(dcw1);
            } else
            {
                dcw1 = new String("update should trigger notification? ");
            }
            eev.c("Babel", dcw1);
        }
        if (dmw1 instanceof dng)
        {
            dng1 = (dng)dmw1;
            dcw1 = dng1.c;
            obj = dng1.m;
            l1 = dng1.e;
        } else
        {
            obj = "";
            l1 = 0L;
            dcw1 = "";
        }
        l2 = SystemClock.elapsedRealtime();
        if (obj1 == dgm.b)
        {
            h.a(i1, l2, 10, (new cab()).a(453).c(((String) (obj))).a(dcw1));
            eev.a("Babel", "Scheduling future notification after late push");
            dmw1 = (AlarmManager)g.nU.getSystemService("alarm");
            jnv1 = new Intent("com.google.android.apps.hangouts.DEFERRED_NOTIFICATION");
            jnv1.putExtra("op", 139);
            jnv1.putExtra("account_id", aoa1.h());
            jnv1.putExtra("message_id", ((String) (obj)));
            jnv1.putExtra("conversation_id", dcw1);
            i1 = eee.a(aoa1.h(), 1, 110, null);
            aoa1 = PendingIntent.getBroadcast(g.nU, i1, jnv1, 0x10000000);
            dmw1.set(2, SystemClock.elapsedRealtime() + g.a(g.nU, "babel_latenotifdly", 3000L), aoa1);
            return;
        }
        if (obj1 == dgm.e)
        {
            h.a(i1, l2, 10, (new cab()).a(403).c(((String) (obj))).a(dcw1));
        }
        cfo.a(g.nU, i1, ((dgm) (obj1)), true, jnv1);
        if (obj1 == dgm.d && dcz.s(i1))
        {
            if (a)
            {
                eev.b("Babel", "Scheduling future re-notification for non-active client.");
            }
            jnv1 = (AlarmManager)context.getSystemService("alarm");
            Intent intent = new Intent("com.google.android.apps.hangouts.RE_NOTIFICATION");
            intent.putExtra("op", 202);
            intent.putExtra("account_id", i1);
            intent.putExtra("conversation_id", dcw1);
            intent.putExtra("message_id", ((String) (obj)));
            intent.putExtra("message_timestamp", l1);
            int k1 = eee.a(i1, 1, 16, dcw1);
            dcw1 = PendingIntent.getBroadcast(g.nU, k1, intent, 0x10000000);
            jnv1.set(2, SystemClock.elapsedRealtime() + g.a(g.nU, "babel_renotification_delay_ms", dlb.o), dcw1);
        }
        if ((dmw1 instanceof dmo) && aoa1.F() && !((dmo)dmw1).d.equals(aoa1.b()))
        {
            cfo.b(context, i1);
            return;
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    public static void a(aoa aoa1, dcx dcx1)
    {
        if (dcx1 != null)
        {
            dcx1 = dcx1.b();
        } else
        {
            dcx1 = null;
        }
        while (dcx1 == null || e != null && ((ecm) (dcx1)).a != null && e.a(aoa1, dcx1) || !g.a(true, false)) 
        {
            return;
        }
        gdy.a(new dgu(aoa1));
    }

    public static void a(aoa aoa1, dmf dmf, dcx dcx1)
    {
        u.post(new dgs(dmf, aoa1, dcx1));
        gdy.a(new dgt(dmf, aoa1, dcx1));
    }

    public static void a(aoa aoa1, dnf dnf1)
    {
        u.post(new dgp(aoa1, dnf1));
    }

    public static void a(aoa aoa1, String s1)
    {
        b(a(aoa1.h(), 76, s1), jmq.a());
    }

    public static void a(aoa aoa1, String s1, int i1, int j1)
    {
        if (i1 >= j1)
        {
            return;
        }
        if (a)
        {
            eev.b("Babel_Stress", (new StringBuilder(37)).append("Scheduling stress message:").append(i1).toString());
        }
        AlarmManager alarmmanager = (AlarmManager)g.nU.getSystemService("alarm");
        Intent intent = new Intent("com.google.android.apps.hangouts.MESSAGE_STRESS_TEST");
        intent.putExtra("op", 152);
        intent.putExtra("account_id", aoa1.h());
        intent.putExtra("conversation_id", s1);
        intent.putExtra("stress_current_message_id", i1);
        intent.putExtra("stress_max_message_id", j1);
        aoa1 = PendingIntent.getBroadcast(g.nU, eee.a(112), intent, 0x10000000);
        i1 = g.a(g.nU, "babel_stress_message_delay", 10);
        i1 = (new Random()).nextInt(i1 * 1000);
        alarmmanager.set(2, SystemClock.elapsedRealtime() + (long)i1, aoa1);
    }

    public static void a(aoa aoa1, String s1, cgd cgd1, String s2, long l1, boolean flag)
    {
        u.post(new dhb(aoa1, s1, cgd1, s2, l1, flag));
    }

    public static void a(aoa aoa1, String s1, dsv dsv1)
    {
        aoa1 = a(aoa1.h(), 191);
        aoa1.putExtra("conversation_id", s1);
        aoa1.putExtra("type", dsv1.ordinal());
        c(aoa1, jmq.a());
    }

    public static void a(aoa aoa1, String s1, String s2, boolean flag)
    {
        aoa1 = a(aoa1.h(), 86);
        aoa1.putExtra("phone_number", s1);
        aoa1.putExtra("verification_code", s2);
        aoa1.putExtra("is_discoverable", flag);
        b(aoa1, jmq.a());
    }

    public static void a(aoa aoa1, String s1, jjt jjt1)
    {
        String s2 = jjt1.d;
        Intent intent = a(aoa1.h(), 78);
        intent.putExtra("hangout_id", s2);
        aoa1 = String.valueOf(s2);
        if (aoa1.length() != 0)
        {
            aoa1 = "Stashing logdata for session ".concat(aoa1);
        } else
        {
            aoa1 = new String("Stashing logdata for session ");
        }
        eev.c("Babel", aoa1);
        n.put(s2, Pair.create(s1, jjt1));
        c(intent, jmq.a());
        g.b(2013);
    }

    public static void a(aoa aoa1, Set set)
    {
        if (a)
        {
            String s1 = String.valueOf(set);
            String s2 = String.valueOf(aoa1.a());
            eev.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 32 + String.valueOf(s2).length())).append("setFocusedConversation ").append(s1).append(" account:").append(s2).toString());
        }
        synchronized (g)
        {
            h = aoa1.a();
            i = new HashSet(set);
        }
        return;
        aoa1;
        obj;
        JVM INSTR monitorexit ;
        throw aoa1;
    }

    public static void a(aoa aoa1, boolean flag)
    {
        aoa1 = a(aoa1.h(), 13);
        aoa1.putExtra("retry_request", flag);
        b(aoa1, jmq.a());
    }

    public static void a(aoa aoa1, long al[])
    {
        aoa1 = a(aoa1.h(), 80);
        aoa1.putExtra("message_row_ids", al);
        c(aoa1, jmq.a());
    }

    public static void a(aoa aoa1, Long along[], String s1)
    {
        int j1 = along.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            Long long1 = along[i1];
            Intent intent = a(aoa1.h(), 44, s1);
            intent.putExtra("message_row_id", g.a(long1, 0L));
            intent.putExtra("timestamp", SystemClock.elapsedRealtime() * 1000L);
            c(intent, jmq.a());
        }

        i(aoa1, s1);
    }

    public static void a(aoa aoa1, String as[])
    {
        aoa1 = a(aoa1.h(), 187);
        aoa1.putExtra("recent_call_row_ids", as);
        c(aoa1, jmq.a());
    }

    public static void a(aow aow1, String s1, String as[])
    {
        Object obj;
        StringBuilder stringbuilder;
        aoz aoz1;
        Context context;
        int i1;
        int j1;
        int k1;
        if (as != null)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        stringbuilder = new StringBuilder();
        aow1.a();
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        k1 = as.length;
        j1 = 0;
_L4:
        if (j1 >= k1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = as[j1];
        aow1.a(s1, ((String) (obj)), dsu.e, 0);
        stringbuilder.append("-");
        stringbuilder.append(((String) (obj)));
        j1++;
        if (true) goto _L4; else goto _L3
_L2:
        aow1.k(s1, 0xffffffff80000000L);
_L3:
        aoz1 = aow1.f(s1);
        aow1.b();
        aow1.c();
        aoq.d(aow1);
        if (aoz1 == null)
        {
            return;
        }
        break MISSING_BLOCK_LABEL_119;
        s1;
        aow1.c();
        throw s1;
        obj = aoz1.d;
        as = ((String []) (obj));
        if (obj == null)
        {
            as = aoz1.o;
        }
        context = g.nU;
        obj = new cf(context);
        ((cf) (obj)).a(true);
        if (i1 != 0)
        {
            i1 = l.aH;
        } else
        {
            i1 = l.aG;
        }
        ((cf) (obj)).a(context.getResources().getString(i1));
        ((cf) (obj)).b(as);
        ((cf) (obj)).a(System.currentTimeMillis());
        ((cf) (obj)).a(com.google.android.apps.hangouts.R.drawable.cb);
        aow1 = g.a(aow1.f().h(), s1, aoz1.b);
        aow1.addFlags(0x4000000);
        ((cf) (obj)).a(PendingIntent.getActivity(context, 0, aow1, 0x10000000));
        aow1 = (NotificationManager)context.getSystemService("notification");
        as = String.valueOf(stringbuilder.toString());
        aow1.notify((new StringBuilder(String.valueOf(s1).length() + 17 + String.valueOf(as).length())).append("failed_to_delete:").append(s1).append(as).toString(), 11, ((cf) (obj)).g());
        return;
    }

    private void a(dcw dcw1, Intent intent, dfy dfy1, aoa aoa1)
    {
        if (dfy1.f())
        {
            if (a)
            {
                String s1 = String.valueOf(dfy1.getClass().getSimpleName());
                aoa1 = String.valueOf(aoa1.a());
                e((new StringBuilder(String.valueOf(s1).length() + 23 + String.valueOf(aoa1).length())).append(s1).append(" is executed directly: ").append(aoa1).toString());
            }
            m.remove(dfy1);
            dfy1.a(2);
            a(dcw1, intent, ((dgj) (dfy1)));
        } else
        {
            if (dfy1.e())
            {
                if (a)
                {
                    dcw1 = String.valueOf(dfy1.getClass().getSimpleName());
                    intent = String.valueOf(aoa1.a());
                    e((new StringBuilder(String.valueOf(dcw1).length() + 12 + String.valueOf(intent).length())).append(dcw1).append(" is queued: ").append(intent).toString());
                }
                m.add(dfy1);
                dfy1.a(1);
                return;
            }
            if (a)
            {
                dcw1 = String.valueOf(dfy1.getClass().getSimpleName());
                intent = String.valueOf(aoa1.a());
                e((new StringBuilder(String.valueOf(dcw1).length() + 13 + String.valueOf(intent).length())).append(dcw1).append(" is ignored: ").append(intent).toString());
                return;
            }
        }
    }

    public static void a(dhw dhw1)
    {
        e = dhw1;
    }

    public static void a(dhx dhx1)
    {
        f = dhx1;
    }

    public static void a(dhy dhy1)
    {
        if (!o.contains(dhy1))
        {
            o.add(dhy1);
        }
    }

    public static void a(dir dir1, Intent intent)
    {
        a(dir1, intent, jmq.a());
    }

    private static void a(dir dir1, Intent intent, jnv jnv1)
    {
        intent.putExtra("rid", dir1.a());
        b(intent, jnv1);
        if (a)
        {
            dir1 = String.valueOf(dir1);
            intent = String.valueOf(g(intent.getIntExtra("op", 0)));
            e((new StringBuilder(String.valueOf(dir1).length() + 30 + String.valueOf(intent).length())).append("start command request ").append(dir1).append(" opCode ").append(intent).toString());
        }
    }

    public static void a(dnt dnt)
    {
        u.post(new dhc(dnt));
    }

    public static void a(grd grd1, List list)
    {
        Iterator iterator = list.iterator();
_L8:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        int i1;
        boolean flag;
        list = (eeh)iterator.next();
        i1 = g.a((Integer)((eeh) (list)).a, 0);
        flag = g.a((Boolean)((eeh) (list)).b, false);
        i1;
        JVM INSTR lookupswitch 2: default 80
    //                   2: 114
    //                   6: 131;
           goto _L3 _L4 _L5
_L3:
        if (a)
        {
            e((new StringBuilder(77)).append("RichPresenceEnabledStateNotification received for unhandled type: ").append(i1).toString());
        }
        continue; /* Loop/switch isn't completed */
_L4:
        list = "rich_status_device_reporting_key";
_L6:
        grd1.b(list, flag);
        continue; /* Loop/switch isn't completed */
_L5:
        list = "last_seen_bool_key";
        if (true) goto _L6; else goto _L2
_L2:
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static void a(PrintWriter printwriter)
    {
label0:
        {
            synchronized (v)
            {
                if (s != null)
                {
                    break label0;
                }
            }
            return;
        }
        SimpleDateFormat simpledateformat;
        printwriter.println("enqueueTime          s-q   e-s   e-q opcode");
        simpledateformat = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.getDefault());
        int i1 = 0;
_L2:
        if (i1 >= s.a())
        {
            break; /* Loop/switch isn't completed */
        }
        dhu dhu1 = (dhu)s.a(i1);
        printwriter.println(String.format(Locale.getDefault(), "%s %5d %5d %5d %s", new Object[] {
            simpledateformat.format(Long.valueOf(dhu1.b)), Long.valueOf((dhu1.d - dhu1.c) / 0xf4240L), Long.valueOf((dhu1.e - dhu1.d) / 0xf4240L), Long.valueOf((dhu1.e - dhu1.c) / 0xf4240L), g(dhu1.a)
        }));
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        printwriter;
        obj;
        JVM INSTR monitorexit ;
        throw printwriter;
    }

    public static void a(String s1, aoa aoa1)
    {
        u.post(new dgw(aoa1, s1));
    }

    public static void a(String s1, aoa aoa1, long l1, long l2, jnv jnv1)
    {
        aoa1 = a(aoa1.h(), 53);
        aoa1.putExtra("timestamp", l1);
        aoa1.putExtra("gcm_handle_timestamps", l2);
        dmw.a(aoa1, s1);
        c(aoa1, jnv1);
    }

    public static void a(String s1, aoa aoa1, Runnable runnable)
    {
        u.post(new dgx(aoa1, s1, runnable));
    }

    public static void a(String s1, cgd cgd1, boolean flag)
    {
        u.post(new dgz(s1, cgd1, flag));
    }

    public static void a(String s1, String s2)
    {
        Intent intent = new Intent(g.nU, com/google/android/apps/hangouts/realtimechat/RealTimeChatService);
        intent.setAction(s1);
        intent.putExtra("op", 100);
        intent.putExtra("package", s2);
        b(intent, jmq.a());
    }

    public static void a(String s1, List list)
    {
        u.post(new dha(s1, list));
    }

    private static void a(ArrayList arraylist)
    {
        int ai[] = dcn.c(false);
        if (ai.length == 0)
        {
            eev.c("Babel", "All accounts removed");
        } else
        {
            int i1 = ai[0];
            aoa aoa1 = dcn.e(i1);
            if (aoa1 != null && !dcn.f(aoa1) && !aoa1.o())
            {
                if (eev.a("Babel", 3))
                {
                    eev.c("Babel", (new StringBuilder(56)).append("Use account ").append(i1).append(" to unregistered removed accounts").toString());
                }
                for (Iterator iterator = arraylist.iterator(); iterator.hasNext();)
                {
                    String s1 = (String)iterator.next();
                    aoa aoa2 = dcn.a(cgd.a(s1));
                    if (aoa2 != null)
                    {
                        arraylist = String.valueOf(eev.b(aoa2.a()));
                        eev.g("Babel", (new StringBuilder(String.valueOf(arraylist).length() + 62 + String.valueOf(s1).length())).append("Removing a valid account by mistake:accountName=").append(arraylist).append(", accountGaia=").append(s1).toString());
                        return;
                    }
                }

                Intent intent = a(i1, 104);
                intent.putStringArrayListExtra("account_gaiaids", arraylist);
                b(intent, jmq.a());
                return;
            }
        }
    }

    public static void a(boolean flag)
    {
        if (a)
        {
            e((new StringBuilder(87)).append("requestWarmSyncForAllAccounts suppressNotifications: false fromBackgroundPolling: ").append(flag).toString());
        }
        int ai[] = dcn.c(true);
        int j1 = ai.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            int k1 = ai[i1];
            if (dcn.e(k1) != null)
            {
                a(k1, false, false, 0, flag);
            }
        }

    }

    public static void a(byte abyte0[])
    {
        if (!dcn.j())
        {
            return;
        } else
        {
            Intent intent = a(dcn.l().h(), 115);
            intent.putExtra("mms_wap_push_data", abyte0);
            c(intent, jmq.a());
            return;
        }
    }

    public static int b(aoa aoa1, String s1, int i1)
    {
        aoa1 = a(aoa1.h(), 62, s1);
        aoa1.putExtra("otr_status", i1);
        return c(aoa1, jmq.a());
    }

    public static int b(aoa aoa1, String s1, long l1)
    {
        aoa1 = a(aoa1.h(), 35, s1);
        if (l1 > 0L)
        {
            aoa1.putExtra("watermark", l1);
        }
        return c(aoa1, jmq.a());
    }

    public static int b(aoa aoa1, String s1, String s2)
    {
        aoa1 = a(aoa1.h(), 58);
        aoa1.putExtra("query", s1);
        aoa1.putExtra("requester_id", s2);
        return c(aoa1, jmq.a());
    }

    public static cxr b(Intent intent)
    {
        Bundle bundle = intent.getExtras();
        if (bundle.containsKey("server_response_id"))
        {
            intent = g.nU;
            long l1 = bundle.getLong("server_response_id");
            return dlz.a(intent).c(l1);
        }
        if (bundle.containsKey("server_response"))
        {
            return dmc.b(intent.getByteArrayExtra("server_response"));
        } else
        {
            return null;
        }
    }

    public static void b()
    {
        if (a)
        {
            String s1 = String.valueOf(i);
            String s2 = h;
            eev.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 39 + String.valueOf(s2).length())).append("unsetFocusedConversation from ").append(s1).append(" account:").append(s2).toString());
        }
        synchronized (g)
        {
            h = null;
            i = null;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void b(int i1)
    {
        b(a(i1, 16), jmq.a());
    }

    public static void b(int i1, long l1)
    {
        Object obj = dcn.l();
        if (obj == null)
        {
            return;
        } else
        {
            obj = a(((aoa) (obj)).h(), 133);
            ((Intent) (obj)).putExtra("free_sms_storage_action_index", i1);
            ((Intent) (obj)).putExtra("free_sms_storage_duration", l1);
            c(((Intent) (obj)), jmq.a());
            return;
        }
    }

    private static void b(int i1, cxr cxr1)
    {
        long l1 = cxr1.d();
        long l2 = cxr1.e();
        if (dcz.m(i1) && l1 != -1L && l2 != -1L)
        {
            (new dcf(g.nU)).a(i1, l1, l2);
        }
    }

    public static void b(int i1, String s1)
    {
        b(a(i1, 103, s1), jmq.a());
    }

    public static void b(int i1, String s1, String s2)
    {
        s1 = a(i1, 147, s1);
        s1.putExtra("message_text", s2);
        b(((Intent) (s1)), jmq.a());
    }

    public static void b(long l1, long l2)
    {
        AlarmManager alarmmanager = (AlarmManager)g.nU.getSystemService("alarm");
        Intent intent = new Intent("com.google.android.apps.hangouts.RENEW_ACCOUNT_REGISTRATION");
        intent.putExtra("op", 141);
        alarmmanager.setInexactRepeating(2, l1, l2, PendingIntent.getBroadcast(g.nU, eee.a(111), intent, 0x10000000));
    }

    private static void b(Intent intent, jnv jnv1)
    {
        intent.putExtra("rqtms", SystemClock.elapsedRealtime());
        if (a || t)
        {
            intent.putExtra("rqtns", System.nanoTime());
        }
        Context context = g.nU;
        synchronized (q)
        {
            if (r == null)
            {
                if (a)
                {
                    e("initializing wakelock");
                }
                r = ((PowerManager)context.getSystemService("power")).newWakeLock(1, "hangouts_rtcs");
            }
        }
        if (a)
        {
            obj = String.valueOf(g(intent.getIntExtra("op", 0)));
            int i1;
            if (((String) (obj)).length() != 0)
            {
                obj = "acquiring wakelock for opcode ".concat(((String) (obj)));
            } else
            {
                obj = new String("acquiring wakelock for opcode ");
            }
            e(((String) (obj)));
        }
        r.acquire();
        intent.setClass(context, com/google/android/apps/hangouts/realtimechat/RealTimeChatService);
        intent.putExtra("pid", d);
        if (a)
        {
            intent.putExtra("stack_trace", eev.a(new Throwable()));
        }
        if (((dld)hlp.a(context, dld)).a(context, intent, jnv1) == null)
        {
            jnv1 = String.valueOf(intent);
            eev.g("Babel", (new StringBuilder(String.valueOf(jnv1).length() + 40)).append("RTCS failed to start service for intent ").append(jnv1).toString());
            i1 = intent.getIntExtra("account_id", -1);
            ((gdd)hlp.a(context, gdd)).a(i1).a(2307).d();
            r.release();
        }
        return;
        intent;
        obj;
        JVM INSTR monitorexit ;
        throw intent;
    }

    public static void b(aoa aoa1)
    {
        b(a(aoa1.h(), 14), jmq.a());
    }

    public static void b(aoa aoa1, long l1)
    {
        u.post(new dgo(aoa1, l1));
    }

    public static void b(aoa aoa1, String s1)
    {
        aoa1 = a(aoa1.h(), 69);
        aoa1.putExtra("member_gaiaid", s1);
        b(((Intent) (aoa1)), jmq.a());
    }

    public static void b(aoa aoa1, String as[])
    {
        aoa1 = a(aoa1.h(), 171);
        aoa1.putExtra("conversationids", as);
        c(aoa1, jmq.a());
    }

    public static void b(dhy dhy1)
    {
        o.remove(dhy1);
    }

    public static void b(String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(s1);
        a(arraylist);
    }

    public static void b(String s1, String s2)
    {
        u.post(new dhl(s1, s2));
    }

    public static int c(int i1, String s1)
    {
        Intent intent = a(i1, 151);
        intent.putExtra("phone_number", s1);
        return c(intent, jmq.a());
    }

    public static int c(int i1, String s1, String s2)
    {
        gdv.a(s1, eey.g(s1));
        gdv.a(s2, eey.g(s2));
        Intent intent = a(i1, 196);
        intent.putExtra("phone_number", s1);
        intent.putExtra("from_phone_number", s2);
        return c(intent, jmq.a());
    }

    private static int c(Intent intent, jnv jnv1)
    {
        dir dir1 = dir.b();
        a(dir1, intent, jnv1);
        return dir1.a();
    }

    public static int c(aoa aoa1, String s1, long l1)
    {
        aoa1 = a(aoa1.h(), 82, s1);
        aoa1.putExtra("scroll_timestamp", System.currentTimeMillis());
        aoa1.putExtra("scroll_to_item_timestamp", l1);
        return c(((Intent) (aoa1)), jmq.a());
    }

    public static int c(aoa aoa1, String s1, String s2)
    {
        aoa1 = a(aoa1.h(), 37, s1);
        aoa1.putExtra("conversation_name", s2);
        return c(((Intent) (aoa1)), jmq.a());
    }

    public static void c()
    {
        int i1 = 0;
        if (a)
        {
            e("requestPatchAfterRequestWriterUpgradeForAllAccounts");
        }
        int ai[] = dcn.c(false);
        for (int j1 = ai.length; i1 < j1; i1++)
        {
            int k1 = ai[i1];
            if (a)
            {
                e((new StringBuilder(49)).append("requestPatchAfterRequestWriterUpgrade ").append(k1).toString());
            }
            c(a(k1, 114), jmq.a());
        }

    }

    public static void c(int i1)
    {
        c(a(i1, 188), jmq.a());
    }

    public static void c(Intent intent)
    {
        if (!dcn.j())
        {
            return;
        } else
        {
            aoa aoa1 = dcn.l();
            intent.setClass(g.nU, com/google/android/apps/hangouts/realtimechat/RealTimeChatService);
            intent.putExtra("op", 109);
            intent.putExtra("account_id", aoa1.h());
            c(intent, jmq.a());
            return;
        }
    }

    public static void c(aoa aoa1)
    {
        djt djt1 = djt.a(aoa1);
        if (djt1 == null)
        {
            if (a)
            {
                e("Do not renew active client for sms only account");
            }
        } else
        if (!djt1.e() && !djt1.f())
        {
            if (a)
            {
                aoa1 = String.valueOf(aoa1.a());
                if (aoa1.length() != 0)
                {
                    aoa1 = "SetActiveClientOperation is idle: ".concat(aoa1);
                } else
                {
                    aoa1 = new String("SetActiveClientOperation is idle: ");
                }
                e(aoa1);
                return;
            }
        } else
        {
            b(a(aoa1.h(), 60), jmq.a());
            return;
        }
    }

    public static void c(aoa aoa1, long l1)
    {
        aoa1 = a(aoa1.h(), 169);
        aoa1.putExtra("extra_duration", l1);
        c(((Intent) (aoa1)), jmq.a());
    }

    public static void c(aoa aoa1, String s1)
    {
        aoa1 = a(aoa1.h(), 85);
        aoa1.putExtra("phone_number", s1);
        b(aoa1, jmq.a());
    }

    public static void c(String s1)
    {
        String as[] = s1.split("\\|");
        if (as.length != 4)
        {
            s1 = String.valueOf(s1);
            if (s1.length() != 0)
            {
                s1 = "onRequestDiscarded invalid token: ".concat(s1);
            } else
            {
                s1 = new String("onRequestDiscarded invalid token: ");
            }
            eev.g("Babel", s1);
            return;
        } else
        {
            s1 = a(dcn.a(as[2], null).h(), 113, as[3]);
            s1.putExtra("message_row_id", Long.valueOf(as[1]));
            c(((Intent) (s1)), jmq.a());
            return;
        }
    }

    public static int d(aoa aoa1)
    {
        return c(a(aoa1.h(), 96), jmq.a());
    }

    public static int d(aoa aoa1, String s1, long l1)
    {
        aoa1 = a(aoa1.h(), 149, s1);
        aoa1.putExtra("timestamp", l1);
        return c(aoa1, jmq.a());
    }

    public static int d(aoa aoa1, String s1, String s2)
    {
        return c(a(aoa1.h(), 177, s1).putExtra("ringtone_uri", s2), jmq.a());
    }

    public static void d()
    {
        if (a)
        {
            e("cancelAllDBCleanupAlarms");
        }
        ((AlarmManager)g.nU.getSystemService("alarm")).cancel(s());
    }

    public static void d(int i1)
    {
        b(a(i1, 89), jmq.a());
    }

    public static void d(Intent intent)
    {
        aoa aoa1 = dcn.l();
        if (aoa1 == null)
        {
            return;
        } else
        {
            intent.setClass(g.nU, com/google/android/apps/hangouts/realtimechat/RealTimeChatService);
            intent.putExtra("op", 128);
            intent.putExtra("account_id", aoa1.h());
            c(intent, jmq.a());
            return;
        }
    }

    private void d(Intent intent, jnv jnv1)
    {
        Object obj1;
        int i1;
        int j1;
        int j2;
        j1 = intent.getIntExtra("op", -1);
        j2 = intent.getIntExtra("account_id", -1);
        obj1 = dcn.e(j2);
        i1 = intent.getIntExtra("rid", -1);
        if (a)
        {
            String s1 = String.valueOf(g(j1));
            eev.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 63)).append("processIntent opCode ").append(s1).append(" account ").append(j2).append(" requestId ").append(i1).toString());
            b.c(g(j1));
        }
        if (f != null)
        {
            f.a(intent);
        }
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        eev.g("Babel", (new StringBuilder(48)).append("Skipping intent for invalid account: ").append(j2).toString());
        if (j1 == 78)
        {
            g.b(2379);
        }
_L128:
        return;
_L2:
        Object obj = dcn.g(((aoa) (obj1)));
        j1;
        JVM INSTR lookupswitch 33: default 468
    //                   13: 1455
    //                   14: 1336
    //                   19: 1511
    //                   55: 1809
    //                   66: 2092
    //                   72: 2159
    //                   76: 2069
    //                   91: 2322
    //                   104: 1412
    //                   111: 2454
    //                   114: 2483
    //                   120: 2524
    //                   121: 2749
    //                   124: 2896
    //                   136: 2924
    //                   139: 1621
    //                   143: 2412
    //                   144: 2380
    //                   153: 3010
    //                   160: 3079
    //                   162: 3100
    //                   163: 3256
    //                   175: 2567
    //                   176: 2693
    //                   187: 3066
    //                   188: 3060
    //                   190: 3034
    //                   192: 2500
    //                   194: 3272
    //                   198: 3296
    //                   199: 2609
    //                   200: 2676
    //                   202: 1688;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36
_L3:
        j1;
        JVM INSTR tableswitch 30 203: default 1180
    //                   30 1181
    //                   31 3853
    //                   32 4989
    //                   33 5023
    //                   34 1180
    //                   35 5047
    //                   36 5230
    //                   37 5269
    //                   38 5315
    //                   39 3328
    //                   40 1180
    //                   41 5493
    //                   42 5566
    //                   43 1180
    //                   44 4582
    //                   45 1180
    //                   46 1180
    //                   47 4388
    //                   48 5883
    //                   49 5923
    //                   50 1180
    //                   51 1180
    //                   52 1180
    //                   53 3535
    //                   54 5590
    //                   55 1180
    //                   56 6135
    //                   57 1180
    //                   58 5955
    //                   59 5986
    //                   60 5855
    //                   61 1180
    //                   62 5714
    //                   63 1180
    //                   64 1180
    //                   65 5615
    //                   66 1180
    //                   67 1180
    //                   68 5206
    //                   69 6377
    //                   70 1180
    //                   71 3393
    //                   72 1180
    //                   73 6400
    //                   74 1180
    //                   75 1180
    //                   76 1180
    //                   77 1180
    //                   78 6448
    //                   79 6424
    //                   80 4868
    //                   81 5121
    //                   82 5159
    //                   83 4638
    //                   84 4493
    //                   85 3647
    //                   86 3790
    //                   87 1180
    //                   88 1180
    //                   89 6633
    //                   90 6650
    //                   91 1180
    //                   92 5750
    //                   93 1180
    //                   94 1180
    //                   95 1180
    //                   96 5817
    //                   97 5834
    //                   98 6025
    //                   99 6791
    //                   100 1180
    //                   101 6815
    //                   102 1180
    //                   103 6835
    //                   104 1180
    //                   105 1180
    //                   106 1180
    //                   107 1180
    //                   108 1180
    //                   109 6849
    //                   110 1180
    //                   111 1180
    //                   112 6918
    //                   113 4946
    //                   114 1180
    //                   115 6856
    //                   116 6869
    //                   117 3829
    //                   118 1180
    //                   119 1180
    //                   120 1180
    //                   121 1180
    //                   122 1180
    //                   123 1180
    //                   124 1180
    //                   125 1180
    //                   126 1180
    //                   127 1180
    //                   128 6933
    //                   129 1180
    //                   130 4324
    //                   131 6940
    //                   132 6944
    //                   133 6948
    //                   134 6107
    //                   135 6734
    //                   136 1180
    //                   137 6121
    //                   138 1180
    //                   139 1180
    //                   140 6970
    //                   141 1180
    //                   142 7002
    //                   143 1180
    //                   144 1180
    //                   145 6609
    //                   146 7042
    //                   147 7055
    //                   148 7101
    //                   149 1180
    //                   150 7118
    //                   151 7135
    //                   152 4196
    //                   153 1180
    //                   154 1180
    //                   155 1180
    //                   156 1180
    //                   157 7243
    //                   158 1180
    //                   159 1180
    //                   160 1180
    //                   161 1180
    //                   162 1180
    //                   163 1180
    //                   164 1180
    //                   165 1180
    //                   166 1180
    //                   167 6039
    //                   168 1180
    //                   169 7291
    //                   170 1180
    //                   171 6084
    //                   172 7309
    //                   173 1180
    //                   174 1180
    //                   175 1180
    //                   176 1180
    //                   177 5401
    //                   178 5447
    //                   179 6767
    //                   180 5079
    //                   181 3671
    //                   182 3695
    //                   183 3728
    //                   184 3759
    //                   185 1181
    //                   186 5869
    //                   187 1180
    //                   188 1180
    //                   189 6710
    //                   190 1180
    //                   191 4892
    //                   192 1180
    //                   193 5679
    //                   194 1180
    //                   195 7168
    //                   196 7260
    //                   197 7217
    //                   198 1180
    //                   199 1180
    //                   200 1180
    //                   201 7333
    //                   202 1180
    //                   203 5541;
           goto _L37 _L38 _L39 _L40 _L41 _L37 _L42 _L43 _L44 _L45 _L46 _L37 _L47 _L48 _L37 _L49 _L37 _L37 _L50 _L51 _L52 _L37 _L37 _L37 _L53 _L54 _L37 _L55 _L37 _L56 _L57 _L58 _L37 _L59 _L37 _L37 _L60 _L37 _L37 _L61 _L62 _L37 _L63 _L37 _L64 _L37 _L37 _L37 _L37 _L65 _L66 _L67 _L68 _L69 _L70 _L71 _L72 _L73 _L37 _L37 _L74 _L75 _L37 _L76 _L37 _L37 _L37 _L77 _L78 _L79 _L80 _L37 _L81 _L37 _L82 _L37 _L37 _L37 _L37 _L37 _L83 _L37 _L37 _L84 _L85 _L37 _L86 _L87 _L88 _L37 _L37 _L37 _L37 _L37 _L37 _L37 _L37 _L37 _L37 _L89 _L37 _L90 _L91 _L92 _L93 _L94 _L95 _L37 _L96 _L37 _L37 _L97 _L37 _L98 _L37 _L37 _L99 _L100 _L101 _L102 _L37 _L103 _L104 _L105 _L37 _L37 _L37 _L37 _L106 _L37 _L37 _L37 _L37 _L37 _L37 _L37 _L37 _L37 _L107 _L37 _L108 _L37 _L109 _L110 _L37 _L37 _L37 _L37 _L111 _L112 _L113 _L114 _L115 _L116 _L117 _L118 _L38 _L119 _L37 _L37 _L120 _L37 _L121 _L37 _L122 _L37 _L123 _L124 _L125 _L37 _L37 _L37 _L126 _L37 _L127
_L37:
        return;
_L38:
        try
        {
            jnv1 = (aid)intent.getSerializableExtra("audience");
            a(((dcw) (obj)), intent, new ddn(((aoa) (obj1)), intent.getStringExtra("conversation_name"), jnv1, (aot)intent.getSerializableExtra("conversation_lookup"), intent.getBooleanExtra("conversation_hangout", false), intent.getBooleanExtra("force_group", false), intent.getIntExtra("transport_type", 0), intent.getStringExtra("invite_token_url")));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (jnv jnv1)
        {
            boolean flag = aoc.g(this, j2);
            eev.e("Babel", (new StringBuilder(45)).append("Exception in processIntent, logged off: ").append(flag).toString(), jnv1);
            a(intent, new did(intent.getIntExtra("rid", -1), 2, null), null);
            if ((jnv1 instanceof RuntimeException) && !flag)
            {
                throw (RuntimeException)jnv1;
            }
        }
          goto _L128
_L5:
        l(j2);
        g.f();
        g.a(((aoa) (obj1)).a(), 0, 0);
        if (!def.c().d())
        {
            eev.f("Babel", "GCM registration not done. Skip unregistering account");
            return;
        }
        if (((gqz)hlp.a(g.j(), gqz)).c(j2))
        {
            a(((dcw) (obj)), intent, new dki(((aoa) (obj1))));
            return;
        }
          goto _L128
_L12:
        if (!def.c().d())
        {
            eev.g("Babel", "GCM registration not done before unregistering account");
            return;
        } else
        {
            a(((dcw) (obj)), intent, new dkj(((aoa) (obj1)), intent.getStringArrayListExtra("account_gaiaids")));
            return;
        }
_L4:
        if (a)
        {
            e("OP_REGISTER_ACCOUNT");
        }
        if (!def.c().d())
        {
            eev.g("Babel", "GCM registration not done before registering account");
            return;
        } else
        {
            a(((dcw) (obj)), intent, new dii(((aoa) (obj1)), intent.getBooleanExtra("retry_request", false)));
            return;
        }
_L6:
        if (a)
        {
            e("OP_SET_SELF_INFO_BIT");
        }
        i1 = intent.getIntExtra("setselfinfo_bit", -1);
        if (i1 == -1)
        {
            eev.g("Babel", "OP_SET_SELF_INFO_BIT -- no EXTRA_SETSELFINO_BIT specified");
            return;
        }
        boolean flag1 = intent.getBooleanExtra("setselfinfo_bit_value", false);
        if (a)
        {
            e((new StringBuilder(55)).append("OP_SET_SELF_INFO_BIT whichBit: ").append(i1).append(" value: ").append(flag1).toString());
        }
        a(((dcw) (obj)), intent, new dka(((aoa) (obj1)), i1, flag1));
        return;
_L19:
        if (edc.b())
        {
            (new ede()).a("rtcs_handle_deferred_notification").a(((aoa) (obj1))).b();
        }
        if (a)
        {
            e("handle OP_TRIGGER_DEFERRED_NOTIFICATION");
        }
        jnv1 = intent.getStringExtra("message_id");
        intent = intent.getStringExtra("conversation_id");
        cfo.a(getApplicationContext(), j2, jnv1, intent);
        return;
_L36:
        if (a)
        {
            e("handle OP_TRIGGER_RENOTIFICATION");
        }
        jnv1 = intent.getStringExtra("conversation_id");
        obj = intent.getStringExtra("message_id");
        long l3 = intent.getLongExtra("message_timestamp", 0L);
        intent = (new aow(this, j2)).e(jnv1, ((String) (obj)));
        if (intent != null && l3 < ((apk) (intent)).I)
        {
            if (a)
            {
                e("The message is already seen, no renotification.");
                return;
            }
        } else
        {
            if (a)
            {
                e("The message is not seen yet. Renotify the user.");
            }
            cfo.a(getApplicationContext(), j2, dgm.e, true, jnv.d());
            g.a(dcn.e(j2), 2366);
            return;
        }
          goto _L128
_L7:
        if (edc.b())
        {
            (new ede()).a("rtcs_handle_warm_sync").a(((aoa) (obj1))).b();
        }
        long l4 = intent.getLongExtra("expected_hash", -1L);
        long l7 = (new dcf(g.j())).a(((aoa) (obj1)).h());
        if (l4 != -1L && l4 == l7)
        {
            if (a)
            {
                intent = String.valueOf(((aoa) (obj1)).a());
                if (intent.length() != 0)
                {
                    intent = "RequestWarmSyncOperation is cancelled due to matched hash values for account: ".concat(intent);
                } else
                {
                    intent = new String("RequestWarmSyncOperation is cancelled due to matched hash values for account: ");
                }
                e(intent);
                g.a(((aoa) (obj1)), 2310);
                return;
            }
        } else
        {
            diu diu1 = diu.b(j2);
            if (a)
            {
                jnv1 = String.valueOf(((aoa) (obj1)).a());
                boolean flag2;
                boolean flag8;
                if (jnv1.length() != 0)
                {
                    jnv1 = "RequestWarmSyncOperation is executed directly: ".concat(jnv1);
                } else
                {
                    jnv1 = new String("RequestWarmSyncOperation is executed directly: ");
                }
                e(jnv1);
            }
            diu1.o();
            flag2 = intent.getBooleanExtra("suppress_notifications", false);
            flag8 = intent.getBooleanExtra("no_missed_events_expected", false);
            i1 = intent.getIntExtra("sync_type", 0);
            diu1.a(flag8);
            diu1.b(flag2);
            diu1.d(i1);
            diu1.a(2);
            a(((dcw) (obj)), intent, diu1);
            return;
        }
          goto _L128
_L10:
        intent = intent.getStringExtra("conversation_id");
        (new aow(this, j2)).l(intent);
        return;
_L8:
        long l5 = intent.getLongExtra("dnd_expiration", -1L);
        a(((dcw) (obj)), intent, new djv(((aoa) (obj1)), l5));
        ((drj)hlp.a(g.j(), drj)).a(j2, l5);
        b(((aoa) (obj1)), l5);
        cfo.a(getApplicationContext(), j2, true);
        return;
_L9:
        boolean flag3 = intent.getBooleanExtra("archive", true);
        boolean flag9 = intent.getBooleanExtra("perform_locally", false);
        jnv1 = intent.getStringArrayExtra("conversationids");
        long al[] = intent.getLongArrayExtra("timestamps");
        if (jnv1.length != al.length)
        {
            throw new IllegalStateException("Must have same number of conversation ids and timestamps to archive");
        }
        ArrayList arraylist = new ArrayList();
        for (i1 = 0; i1 < jnv1.length; i1++)
        {
            arraylist.add(new dcj(jnv1[i1], al[i1]));
        }

        jnv1 = new dci(((aoa) (obj1)), arraylist, flag3, flag9);
        jnv1.a(intent.getIntExtra("rid", -1));
        a(((dcw) (obj)), intent, jnv1);
        cfo.a(getApplicationContext(), j2, true);
        aoq.a(g.j(), j2);
        return;
_L11:
        jnv1 = new ddv(((aoa) (obj1)), intent.getStringExtra("conversation_id"), intent.getLongExtra("timestamp", -1L));
        jnv1.a(intent.getIntExtra("rid", -1));
        a(((dcw) (obj)), intent, jnv1);
        cfo.a(getApplicationContext(), j2, true);
        return;
_L21:
        jnv1 = intent.getStringExtra("conversation_id");
        intent = intent.getStringArrayExtra("event_ids");
        a(new aow(this, j2), jnv1, intent);
        return;
_L20:
        intent = intent.getStringExtra("conversation_id");
        jnv1 = new dgk();
        aoq.a(((aoa) (obj1)), jnv1, intent);
        ((dcw) (obj)).a(jnv1.c(), dir.b().a(), z);
        return;
_L13:
        aoq.b(new aow(this, j2), intent.getStringExtra("conversation_id"), intent.getLongExtra("extra_pending_conversation_operations", 0L));
        return;
_L14:
        a(((dcw) (obj)), intent, new ded(((aoa) (obj1))));
        return;
_L31:
        a(((dcw) (obj)), intent, new dkb(((aoa) (obj1)), intent.getStringExtra("status_message")));
        return;
_L15:
        jnv1 = intent.getStringExtra("gaia_id");
        if (!TextUtils.isEmpty(jnv1))
        {
            a(((dcw) (obj)), intent, new ddz(((aoa) (obj1)), jnv1));
            return;
        } else
        {
            eev.g("Babel", "Dismiss suggested contacts operation scheduled without gaiaid");
            return;
        }
_L26:
        jnv1 = intent.getStringExtra("member_gaiaid");
        if (!TextUtils.isEmpty(jnv1))
        {
            a(((dcw) (obj)), intent, new dkh(((aoa) (obj1)), jnv1));
            return;
        } else
        {
            eev.g("Babel", "Undismiss suggested contacts operation scheduled without gaiaid");
            return;
        }
_L34:
        jnv1 = intent.getByteArrayExtra("current_version");
        String s2 = intent.getStringExtra("gaia_id");
        boolean flag4 = intent.getBooleanExtra("remove", false);
        if (!TextUtils.isEmpty(s2))
        {
            a(((dcw) (obj)), intent, new dkn(((aoa) (obj1)), jnv1, s2, flag4));
            return;
        } else
        {
            eev.g("Babel", "Favorite contacts operation scheduled without gaiaid");
            return;
        }
_L35:
        a(((dcw) (obj)), intent, new del(((aoa) (obj1))));
        return;
_L27:
        jnv1 = intent.getByteArrayExtra("pdu");
        boolean flag5 = intent.getBooleanExtra("is_sms_read", false);
        aoq.a(new SmsMessage[] {
            SmsMessage.createFromPdu(jnv1)
        }, ((aoa) (obj1)), 0, Boolean.valueOf(flag5));
        if (!flag5)
        {
            cfo.a(getApplicationContext(), j2, true);
            return;
        }
          goto _L128
_L16:
        i1 = intent.getIntExtra("extra_rich_presence_type", -1);
        if (i1 < 0 || !intent.hasExtra("extra_rich_presence_type_enabled"))
        {
            if (a)
            {
                if (i1 < 0)
                {
                    intent = " Invalid rich presence type.";
                } else
                {
                    intent = " Unknown if enabled.";
                }
                intent = String.valueOf(intent);
                if (intent.length() != 0)
                {
                    intent = "SetRichPresenceEnabledState failed.".concat(intent);
                } else
                {
                    intent = new String("SetRichPresenceEnabledState failed.");
                }
                e(intent);
                return;
            }
        } else
        {
            boolean flag6 = intent.getBooleanExtra("extra_rich_presence_type_enabled", false);
            jnv1 = new ArrayList(1);
            jnv1.add(new eeh(Integer.valueOf(i1), Boolean.valueOf(flag6)));
            a(((dcw) (obj)), intent, new djz(((aoa) (obj1)), jnv1));
            return;
        }
          goto _L128
_L17:
        intent = (cfz)intent.getParcelableExtra("participant_entity");
        (new aow(this, j2)).a(intent, true);
        return;
_L18:
        jnv1 = new aow(this, j2);
        obj = intent.getStringExtra("conversation_id");
        intent = jnv1.e().a("SELECT count(*) from messages WHERE conversation_id=? LIMIT 1", new String[] {
            obj
        });
        if (intent.moveToFirst() && intent.getInt(0) == 0)
        {
            jnv1.B(((String) (obj)));
        }
        if (intent == null) goto _L128; else goto _L129
_L129:
        intent.close();
        return;
        jnv1;
        if (intent != null)
        {
            intent.close();
        }
        throw jnv1;
_L22:
        jnv1 = (ddg)intent.getParcelableExtra("recent_call_action_info");
        g.a(((aoa) (obj1)), intent.getIntExtra("recent_call_type", 0), jnv1);
        return;
_L30:
        g.a(((aoa) (obj1)), intent.getLongExtra("recent_call_timestamp", 0L), intent.getStringExtra("recent_call_rate"), intent.getBooleanExtra("recent_call_is_free_call", true));
        return;
_L29:
        g.a(((aoa) (obj1)));
        return;
_L28:
        g.a(((aoa) (obj1)), intent.getStringArrayExtra("recent_call_row_ids"));
        return;
_L23:
        (new aow(this, j2)).i(intent.getStringExtra("conversation_id"));
        return;
_L24:
        if (a)
        {
            intent = String.valueOf(eev.b(((aoa) (obj1)).a()));
            int k1;
            if (intent.length() != 0)
            {
                intent = "pollParasiteOperations for account ".concat(intent);
            } else
            {
                intent = new String("pollParasiteOperations for account ");
            }
            eev.b("Babel", intent);
        }
        if (djr.d() && !g.u(getApplicationContext()))
        {
            c(((aoa) (obj1)));
        }
        h(((aoa) (obj1)));
        a(j2, false);
        i(((aoa) (obj1)));
        j(j2);
        k(j2);
        intent = dcn.c(true);
        j1 = intent.length;
        i1 = 0;
        while (i1 < j1) 
        {
            k1 = intent[i1];
            if (diu.b(k1).f())
            {
                a(k1, false, false, 2, false);
            }
            i1++;
        }
          goto _L128
_L25:
        u.post(new dhn(this));
        return;
_L32:
        a(((dcw) (obj)), intent, new dep(((aoa) (obj1)), intent.getStringExtra("phone_number")));
        return;
_L33:
        a(((dcw) (obj)), intent, new din(((aoa) (obj1)), intent.getStringExtra("conversation_id"), intent.getIntExtra("report_abuse_type", 0)));
        return;
_L46:
        jnv1 = b(intent);
        if (jnv1 != null) goto _L131; else goto _L130
_L130:
        eev.f("Babel", "Received null server response");
        return;
_L131:
        f(intent);
        jnv1.c(System.currentTimeMillis() * 1000L);
        jnv1 = a(getApplicationContext(), ((aoa) (obj1)), ((dcw) (obj)), jnv1);
        a(intent, new did(i1, 1, null), jnv1);
        return;
_L63:
        Object obj2;
        Object obj3;
        obj3 = intent.getStringExtra("simulated_event_msg_num");
        obj2 = new ArrayList();
        jnv1 = j;
        jnv1;
        JVM INSTR monitorenter ;
        String as[];
        as = ((String) (obj3)).split("\\|");
        j1 = as.length;
        i1 = 0;
_L133:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        int l1 = Integer.parseInt(as[i1]);
        ((List) (obj2)).add(j.get(l1, null));
        j.remove(l1);
        i1++;
        if (true) goto _L133; else goto _L132
_L132:
        jnv1;
        JVM INSTR monitorexit ;
        jnv1 = ((List) (obj2)).iterator();
        while (jnv1.hasNext()) 
        {
            a(((aoa) (obj1)), ((dcw) (obj)), (dmw)jnv1.next(), 0L, 0L, 0L, jnv.d());
        }
          goto _L128
        obj;
        jnv1;
        JVM INSTR monitorexit ;
        throw obj;
_L53:
        long l6;
        l6 = SystemClock.elapsedRealtime();
        obj2 = dmw.a(intent, ((aoa) (obj1)), true);
        if (obj2 == null) goto _L135; else goto _L134
_L134:
        obj2 = ((List) (obj2)).iterator();
        while (((Iterator) (obj2)).hasNext()) 
        {
            as = (dmw)((Iterator) (obj2)).next();
            if (as instanceof dmo)
            {
                ((dmo)as).a(1);
            }
            a(((aoa) (obj1)), ((dcw) (obj)), as, intent.getLongExtra("timestamp", 0L), intent.getLongExtra("gcm_handle_timestamps", 0L), l6 * 1000L, jnv1);
        }
          goto _L128
_L135:
        eev.g("Babel", "could not parse ServerUpdate");
        return;
_L72:
        a(((dcw) (obj)), intent, new crq(((aoa) (obj1)), intent.getStringExtra("phone_number")));
        return;
_L115:
        a(((dcw) (obj)), intent, new dcg(((aoa) (obj1)), intent.getByteArrayExtra("broadcast")));
        return;
_L116:
        jnv1 = intent.getStringExtra("hangout_id");
        a(((dcw) (obj)), intent, new deh(((aoa) (obj1)), intent.getStringExtra("broadcast_id"), jnv1));
        return;
_L117:
        a(((dcw) (obj)), intent, new dfr(((aoa) (obj1)), intent.getByteArrayExtra("broadcast"), intent.getByteArrayExtra("sync_metadata")));
        return;
_L118:
        a(((dcw) (obj)), intent, new dik(((aoa) (obj1)), intent.getStringExtra("broadcast_id"), intent.getStringExtra("hangout_id")));
        return;
_L73:
        a(((dcw) (obj)), intent, new crj(((aoa) (obj1)), intent.getStringExtra("phone_number"), intent.getStringExtra("verification_code"), intent.getBooleanExtra("is_discoverable", false)));
        return;
_L88:
        a(((dcw) (obj)), intent, new die(((aoa) (obj1)), intent.getStringExtra("conversation_id")));
        return;
_L39:
        String s4;
        String s5;
        String s6;
        String s7;
        String s8;
        int i2;
        int k2;
        boolean flag7;
        obj2 = intent.getStringExtra("conversation_id");
        as = intent.getStringExtra("message_id");
        s4 = intent.getStringExtra("message_text");
        s5 = intent.getStringExtra("uri");
        s6 = intent.getStringExtra("picasa_photo_id");
        j1 = intent.getIntExtra("rotation", 0);
        i2 = intent.getIntExtra("width", 0);
        k2 = intent.getIntExtra("height", 0);
        s7 = intent.getStringExtra("content_type");
        s8 = intent.getStringExtra("subject");
        flag7 = intent.getBooleanExtra("requires_mms", false);
        jnv1 = (bzk)intent.getParcelableExtra("place");
        if (jnv1 != null) goto _L137; else goto _L136
_L136:
        jnv1 = null;
_L141:
        aow aow1;
        int l2;
        l6 = intent.getLongExtra("timestamp", 0L);
        l2 = intent.getIntExtra("otr_state", 0);
        aow1 = new aow(this, j2);
        if (!dcz.x(j2) || g.e(aow1.g(((String) (obj2))))) goto _L139; else goto _L138
_L138:
        jnv1 = new djb(getApplicationContext(), ((aoa) (obj1)), ((String) (obj2)), as, s4, s5, j1, s6, i2, k2, s7, s8, flag7, jnv1, l6, l2, ((dcw) (obj)), i1, z);
_L142:
        a(((dcw) (obj)), intent, jnv1);
        if (!a) goto _L128; else goto _L140
_L140:
        l6 = intent.getLongExtra("rtcs_timestamp_begin_ms", -1L);
        long l8 = SystemClock.elapsedRealtime();
        eev.b("Babel", (new StringBuilder(64)).append("****** IntentService Delay (SendMessage): ").append(l8 - l6).append("ms").toString());
        return;
_L137:
        jnv1 = jnv1.a();
          goto _L141
_L139:
        jnv1 = new dja(getApplicationContext(), ((aoa) (obj1)), ((String) (obj2)), as, s4, s5, j1, s6, i2, k2, s7, s8, flag7, jnv1, l6, l2);
          goto _L142
_L105:
        jnv1 = intent.getStringExtra("conversation_id");
        i1 = intent.getIntExtra("stress_current_message_id", 0);
        j1 = intent.getIntExtra("stress_max_message_id", 0);
        if (a)
        {
            obj = String.valueOf("Sending stress message from RealTimeChatService:");
            eev.b("Babel_Stress", (new StringBuilder(String.valueOf(obj).length() + 11)).append(((String) (obj))).append(i1).toString());
        }
        obj = g.j(i1);
        ((dml)hlp.a(getApplicationContext(), dml)).a(((aoa) (obj1)), jnv1, ((String) (obj)), null, 0, null, 0, 0, null, null, false, null, 0);
        a(((aoa) (obj1)), jnv1, i1 + 1, j1);
        return;
_L90:
        jnv1 = intent.getStringExtra("conversation_id");
        obj2 = intent.getStringExtra("uri");
        as = intent.getStringExtra("subject");
        i1 = intent.getIntExtra("draft_attachment_count", 0);
        a(((dcw) (obj)), intent, new dja(getApplicationContext(), ((aoa) (obj1)), jnv1, ((String) (obj2)), as, i1));
        return;
_L50:
        jnv1 = intent.getStringExtra("conversation_id");
        obj2 = intent.getStringExtra("message_id");
        i1 = intent.getIntExtra("error", 0);
        eev.a("Babel", (new StringBuilder(String.valueOf(jnv1).length() + 24 + String.valueOf(obj2).length())).append("OP_SET_MESSAGE_FAILED: ").append(jnv1).append(" ").append(((String) (obj2))).toString());
        a(((dcw) (obj)), intent, new djy(((aoa) (obj1)), jnv1, ((String) (obj2)), i1));
        return;
_L71:
        jnv1 = intent.getStringExtra("conversation_id");
        flag7 = intent.getBooleanExtra("insert_error_message", false);
        obj = new aow(this, j2);
        ((aow) (obj)).a(jnv1, dsu.a, dsu.d);
        aoq.a(((aow) (obj)), jnv1, ((aow) (obj)).W(jnv1));
        ((aow) (obj)).e(jnv1, 4);
        if (!flag7) goto _L128; else goto _L143
_L143:
        l6 = System.currentTimeMillis();
        aoq.a(((aow) (obj)), new ArrayList(), jnv1, jnv1, l6 * 1000L, -1L);
        return;
_L49:
        jnv1 = intent.getStringExtra("conversation_id");
        l6 = intent.getLongExtra("message_row_id", -1L);
        long l9 = intent.getLongExtra("timestamp", 0L);
        a(((dcw) (obj)), intent, new dja(getApplicationContext(), ((aoa) (obj1)), jnv1, l6, l9));
        return;
_L70:
        jnv1 = intent.getStringExtra("conversation_id");
        as = g.b(((aoa) (obj1)), jnv1);
        j1 = 1;
        s4 = ((aoa) (obj1)).b().a;
        obj2 = new ArrayList();
        i1 = as.b() - 1;
_L181:
        if (i1 < 0) goto _L145; else goto _L144
_L144:
        cfz cfz1 = as.a(i1).h();
        if (!s4.equals(cfz1.b()))
        {
            ((List) (obj2)).add(cfz1);
        }
          goto _L146
_L145:
        i1 = j1;
        if (((List) (obj2)).size() > 1)
        {
            i1 = 2;
        }
        i2 = as.d() - 1;
        j1 = i1;
        i1 = i2;
_L148:
        if (i1 < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        ((List) (obj2)).add(g.b(as.b(i1).b(), as.b(i1).d()));
        j1 = 2;
        i1--;
        if (true) goto _L148; else goto _L147
_L147:
        ArrayList arraylist1 = new ArrayList();
        arraylist1.add(new cwg(new cvz(jnv1, j1, null, ((List) (obj2)))));
        a(((dcw) (obj)), intent, new dho(this, ((aoa) (obj1)), arraylist1));
        return;
_L67:
        a(((dcw) (obj)), intent, new ddx(((aoa) (obj1)), intent.getLongArrayExtra("message_row_ids")));
        return;
_L121:
        jnv1 = intent.getStringExtra("conversation_id");
        i1 = intent.getIntExtra("type", -1);
        gdv.b(Integer.valueOf(i1), Integer.valueOf(-1));
        a(((dcw) (obj)), intent, new ddy(((aoa) (obj1)), jnv1, dsv.values()[i1]));
        return;
_L85:
        jnv1 = intent.getStringExtra("conversation_id");
        l6 = intent.getLongExtra("message_row_id", -1L);
        obj = new aow(this, j2);
        aoq.a(((aow) (obj)), l6);
        aoq.d(((aow) (obj)), jnv1);
        return;
_L40:
        a(((dcw) (obj)), intent, new dfh(((aoa) (obj1)), intent.getStringExtra("conversation_id"), (aid)intent.getSerializableExtra("audience")));
        return;
_L41:
        a(((dcw) (obj)), intent, new dfi(((aoa) (obj1)), intent.getStringExtra("conversation_id")));
        return;
_L42:
        a(((dcw) (obj)), intent, new dkm(((aoa) (obj1)), intent.getStringExtra("conversation_id"), intent.getLongExtra("watermark", 0L)));
        return;
_L114:
        jnv1 = intent.getStringExtra("conversation_id");
        i1 = intent.getIntExtra("call_media_type", 0);
        obj = new aow(this, j2);
        ((aow) (obj)).a(i1, ((aow) (obj)).O(jnv1), jnv1);
        return;
_L68:
        l6 = intent.getLongExtra("scroll_timestamp", 0L);
        long l10 = intent.getLongExtra("scroll_to_item_timestamp", 0L);
        (new aow(this, j2)).a(l6, l10);
        return;
_L69:
        jnv1 = intent.getStringExtra("conversation_id");
        l6 = intent.getLongExtra("scroll_timestamp", 0L);
        long l11 = intent.getLongExtra("scroll_to_item_timestamp", 0L);
        (new aow(this, j2)).b(jnv1, l6, l11);
        return;
_L61:
        a(((dcw) (obj)), intent, new djx(((aoa) (obj1)), intent.getByteArrayExtra("hangout_invite_receipt")));
        return;
_L43:
        intent.getStringExtra("conversation_id");
        a(((dcw) (obj)), intent, new dil(((aoa) (obj1)), intent.getStringExtra("conversation_id"), intent.getStringExtra("message_id")));
        return;
_L44:
        obj2 = intent.getStringExtra("conversation_id");
        jnv1 = intent.getStringExtra("conversation_name");
        obj1 = new dkk(((aoa) (obj1)), ((String) (obj2)));
        ((dkk) (obj1)).a(jnv1);
        a(((dcw) (obj)), intent, ((dgj) (obj1)));
        return;
_L45:
        jnv1 = intent.getStringExtra("conversation_id");
        i1 = intent.getIntExtra("notification_level", 0);
        jnv1 = (new aow(this, j2)).af(jnv1).iterator();
        while (jnv1.hasNext()) 
        {
            obj2 = new dkk(((aoa) (obj1)), (String)jnv1.next());
            ((dkk) (obj2)).a(i1);
            a(((dcw) (obj)), intent, ((dgj) (obj2)));
        }
          goto _L128
_L111:
        obj2 = intent.getStringExtra("conversation_id");
        jnv1 = intent.getStringExtra("ringtone_uri");
        obj1 = new dkk(((aoa) (obj1)), ((String) (obj2)));
        ((dkk) (obj1)).b(jnv1);
        a(((dcw) (obj)), intent, ((dgj) (obj1)));
        return;
_L112:
        obj2 = intent.getStringExtra("conversation_id");
        jnv1 = intent.getStringExtra("ringtone_uri");
        obj1 = new dkk(((aoa) (obj1)), ((String) (obj2)));
        ((dkk) (obj1)).c(jnv1);
        a(((dcw) (obj)), intent, ((dgj) (obj1)));
        return;
_L47:
        a(((dcw) (obj)), intent, new dim(((aoa) (obj1)), intent.getStringExtra("conversation_id"), intent.getBooleanExtra("accept", false), intent.getBooleanExtra("report_inviter", false), intent.getBooleanExtra("block_inviter", false)));
        return;
_L127:
        a(((dcw) (obj)), intent, new ddu(((aoa) (obj1)), intent.getIntExtra("affinity", 0)));
        return;
_L48:
        a(((dcw) (obj)), intent, new dit(((aoa) (obj1)), intent.getStringExtra("conversation_id")));
        return;
_L54:
        a(((dcw) (obj)), intent, new dis(((aoa) (obj1)), intent.getIntExtra("conversation_sync_filter", 1)));
        return;
_L60:
        jnv1 = intent.getStringExtra("conversation_id");
        obj2 = new aow(this, j2);
        if (((aow) (obj2)).t(jnv1) == 2) goto _L150; else goto _L149
_L149:
        l6 = 0L;
_L151:
        a(((dcw) (obj)), intent, new dip(((aoa) (obj1)), jnv1, l6));
        return;
_L150:
        l6 = ((aow) (obj2)).Q(jnv1);
          goto _L151
_L122:
        jnv1 = intent.getStringExtra("gaia_id");
        obj = (ContentValues)intent.getParcelableExtra("content_values");
        (new aow(this, j2)).a(jnv1, ((ContentValues) (obj)));
        return;
_L59:
        i1 = intent.getIntExtra("otr_status", 1);
        a(((dcw) (obj)), intent, new dft(((aoa) (obj1)), intent.getStringExtra("conversation_id"), i1));
        return;
_L76:
        jnv1 = new dde(((aoa) (obj1)), intent.getStringExtra("member_gaiaid"), intent.getStringExtra("phone_number"), intent.getStringExtra("user_name"), intent.getBooleanExtra("blocked", true), intent.getBooleanExtra("retry_request", true));
        jnv1.a(intent.getIntExtra("rid", -1));
        a(((dcw) (obj)), intent, jnv1);
        return;
_L77:
        a(((dcw) (obj)), intent, new dfj(((aoa) (obj1))));
        return;
_L78:
        (new aow(this, j2)).T(intent.getStringExtra("conversation_id"));
        return;
_L58:
        a(((dcw) (obj)), intent, djt.a(((aoa) (obj1))), ((aoa) (obj1)));
        return;
_L119:
        a(((dcw) (obj)), intent, dkg.a(((aoa) (obj1))), ((aoa) (obj1)));
        return;
_L51:
        a(((dcw) (obj)), intent, new djk(((aoa) (obj1)), intent.getStringExtra("conversation_id"), intent.getBooleanExtra("is_present", false), intent.getIntExtra("timeout_secs", -1)));
        return;
_L52:
        a(((dcw) (obj)), intent, new djo(((aoa) (obj1)), intent.getStringExtra("conversation_id"), intent.getIntExtra("typing_status", 0)));
        return;
_L56:
        a(((dcw) (obj)), intent, new diy(((aoa) (obj1)), intent.getStringExtra("query"), intent.getStringExtra("requester_id")));
        return;
_L57:
        a(((dcw) (obj)), intent, new dek(((aoa) (obj1)), intent.getParcelableArrayListExtra("com.google.android.apps.hangouts.EntityLookupSpecs"), intent.getStringExtra("batch_gebi_tag"), intent.getBooleanExtra("from_contact_lookup", false)));
        return;
_L79:
        a(((dcw) (obj)), intent, dih.b(j2), ((aoa) (obj1)));
        return;
_L107:
        obj = intent.getStringExtra("conversation_id");
        jnv1 = new aow(this, j2);
        jnv1.a();
        aow.b(jnv1, ((String) (obj)));
        jnv1.b();
        jnv1.c();
        return;
        obj;
        jnv1.c();
        throw obj;
_L109:
        jnv1 = intent.getStringArrayExtra("conversationids");
        (new aow(this, j2)).a(jnv1);
        return;
_L94:
        a(((dcw) (obj)), intent, dku.b(j2), ((aoa) (obj1)));
        return;
_L96:
        a(((dcw) (obj)), intent, dkf.a(((aoa) (obj1))), ((aoa) (obj1)));
        return;
_L55:
        obj2 = dke.b(j2);
        flag7 = intent.getBooleanExtra("force_execution", false);
        if (!((dke) (obj2)).g()) goto _L153; else goto _L152
_L152:
        if (!a) goto _L128; else goto _L154
_L154:
        jnv1 = String.valueOf(((aoa) (obj1)).a());
        if (jnv1.length() == 0) goto _L156; else goto _L155
_L155:
        jnv1 = "SyncBaselineSuggestedContactsOperation already executing, skip: ".concat(jnv1);
_L157:
        e(jnv1);
        return;
_L156:
        jnv1 = new String("SyncBaselineSuggestedContactsOperation already executing, skip: ");
        if (true) goto _L157; else goto _L153
_L153:
        if (flag7) goto _L159; else goto _L158
_L158:
        if (!((dke) (obj2)).f())
        {
            continue; /* Loop/switch isn't completed */
        }
_L159:
        if (!a) goto _L161; else goto _L160
_L160:
        jnv1 = String.valueOf("SyncBaselineSuggestedContactsOperation is executed directly: ");
        obj1 = String.valueOf(((aoa) (obj1)).a());
        if (((String) (obj1)).length() == 0) goto _L163; else goto _L162
_L162:
        jnv1 = jnv1.concat(((String) (obj1)));
_L165:
        e(jnv1);
_L161:
        m.remove(obj2);
        ((dke) (obj2)).a(2);
        a(((dcw) (obj)), intent, ((dgj) (obj2)));
        return;
_L163:
        jnv1 = new String(jnv1);
        if (true) goto _L165; else goto _L164
_L164:
        if (!((dke) (obj2)).e()) goto _L128; else goto _L166
_L166:
        if (!a) goto _L168; else goto _L167
_L167:
        jnv1 = String.valueOf(((aoa) (obj1)).a());
        if (jnv1.length() == 0) goto _L170; else goto _L169
_L169:
        jnv1 = "SyncBaselineSuggestedContactsOperation is queued: ".concat(jnv1);
_L171:
        e(jnv1);
_L168:
        m.add(obj2);
        ((dke) (obj2)).a(1);
        return;
_L170:
        jnv1 = new String("SyncBaselineSuggestedContactsOperation is queued: ");
          goto _L171
_L62:
        a(((dcw) (obj)), intent, new der(((aoa) (obj1)), intent.getStringExtra("member_gaiaid")));
        return;
_L64:
        a(((dcw) (obj)), intent, new deo(((aoa) (obj1)), intent.getStringExtra("hangout_id")));
        return;
_L66:
        a(((dcw) (obj)), intent, new den(((aoa) (obj1)), intent.getStringExtra("conversation_id")));
        return;
_L65:
        jnv1 = intent.getStringExtra("hangout_id");
        obj2 = (Pair)n.remove(jnv1);
        if (obj2 == null) goto _L173; else goto _L172
_L172:
        jnv1 = String.valueOf(jnv1);
        if (jnv1.length() == 0) goto _L175; else goto _L174
_L174:
        jnv1 = "Pulled logdata for session ".concat(jnv1);
_L176:
        eev.c("Babel", jnv1);
        g.b(2380);
        a(((dcw) (obj)), intent, new dio(((aoa) (obj1)), (String)((Pair) (obj2)).first, (jjt)((Pair) (obj2)).second));
        g.b(2014);
        return;
_L175:
        jnv1 = new String("Pulled logdata for session ");
        if (true) goto _L176; else goto _L173
_L173:
        jnv1 = String.valueOf(jnv1);
        if (jnv1.length() == 0) goto _L178; else goto _L177
_L177:
        jnv1 = "No logdata for session ".concat(jnv1);
_L179:
        eev.g("Babel", jnv1);
        g.b(2239);
        return;
_L178:
        jnv1 = new String("No logdata for session ");
          goto _L179
_L99:
        a(((dcw) (obj)), intent, new dkv(((aoa) (obj1)), intent.getStringExtra("compressed_log_file")));
        return;
_L74:
        a(((dcw) (obj)), intent, new dej(((aoa) (obj1))));
        return;
_L75:
        i1 = intent.getIntExtra("chat_acl_key", 0);
        jnv1 = intent.getStringExtra("chat_acl_circle_id");
        obj2 = intent.getStringExtra("chat_acl_circle_name");
        String s3 = intent.getStringExtra("chat_acl_level");
        a(((dcw) (obj)), intent, new dju(((aoa) (obj1)), cuy.values()[i1], jnv1, ((String) (obj2)), s3));
        return;
_L120:
        a(((dcw) (obj)), intent, new dev(((aoa) (obj1)), intent.getStringExtra("user_id")));
        return;
_L95:
        jnv1 = intent.getStringExtra("picasa_photo_id");
        a(((dcw) (obj)), intent, new dew(((aoa) (obj1)), intent.getStringExtra("gaia_id"), jnv1));
        return;
_L113:
        a(((dcw) (obj)), intent, new deg(((aoa) (obj1)), intent.getStringExtra("picasa_photo_id")));
        return;
_L80:
        a(((dcw) (obj)), intent, new djj(((aoa) (obj1)), intent.getStringExtra("email_address")));
        return;
_L81:
        aoq.a(((aoa) (obj1)), intent.getStringExtra("conversation_id"), intent.getStringExtra("conversation_name"));
        return;
_L82:
        aoq.a(((aoa) (obj1)), intent.getStringExtra("conversation_id"), 2);
        return;
_L83:
        aoq.a(((aoa) (obj1)), intent);
        return;
_L86:
        due.a(j2, intent.getByteArrayExtra("mms_wap_push_data"));
        return;
_L87:
        a(((dcw) (obj)), intent, new diw(((aoa) (obj1)), intent.getStringExtra("mms_content_location"), intent.getByteArrayExtra("mms_transaction_id"), intent.getLongExtra("notification_row_id", -1L), intent.getBooleanExtra("mms_auto_retrieve", false)));
        return;
_L84:
        aoq.a(((aoa) (obj1)), intent, intent.getBooleanExtra("mms_auto_retrieve", false));
        return;
_L89:
        aoq.b(((aoa) (obj1)), intent);
        return;
_L91:
        g.k();
        return;
_L92:
        g.l();
        return;
_L93:
        dul.a(intent.getIntExtra("free_sms_storage_action_index", -1), intent.getLongExtra("free_sms_storage_duration", -1L));
        return;
_L97:
        aoq.a(((aoa) (obj1)), intent.getLongExtra("notification_row_id", -1L), intent.getBooleanExtra("mms_auto_retrieve", false), intent.getIntExtra("error", 0));
        return;
_L98:
        a(((dcw) (obj)), intent, new ddp(((aoa) (obj1)), intent.getIntExtra("hangout_type", 1), intent.getStringExtra("hangout_topic"), intent.getIntExtra("hangout_media_type", 1)));
        return;
_L100:
        aoq.b(((aoa) (obj1)), intent.getStringExtra("mms_dump_file"));
        return;
_L101:
        jnv1 = intent.getStringExtra("message_text");
        obj2 = intent.getStringExtra("conversation_id");
        if (obj2 == null || jnv1 == null) goto _L128; else goto _L180
_L180:
        a(((dcw) (obj)), intent, new dea(((aoa) (obj1)), ((String) (obj2)), jnv1));
        return;
_L102:
        a(((dcw) (obj)), intent, new dex(((aoa) (obj1))));
        return;
_L103:
        a(((dcw) (obj)), intent, new deb(((aoa) (obj1))));
        return;
_L104:
        jnv1 = intent.getStringExtra("phone_number");
        gdv.a(TextUtils.isEmpty(jnv1));
        a(((dcw) (obj)), intent, new dei(((aoa) (obj1)), jnv1));
        return;
_L123:
        jnv1 = hlp.c(getApplicationContext(), dbp).iterator();
        while (jnv1.hasNext()) 
        {
            a(((dcw) (obj)), intent, ((dbp)jnv1.next()).a());
        }
          goto _L128
_L125:
        a(((dcw) (obj)), intent, ((dbm)hlp.a(getApplicationContext(), dbm)).a());
        return;
_L106:
        a(((dcw) (obj)), intent, new deq(((aoa) (obj1))));
        return;
_L124:
        a(((dcw) (obj)), intent, new dec(((aoa) (obj1)), intent.getStringExtra("phone_number"), intent.getStringExtra("from_phone_number")));
        return;
_L108:
        l6 = intent.getLongExtra("extra_duration", 0L);
        try
        {
            Thread.sleep(l6);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return;
        }
_L110:
        a(((dcw) (obj)), intent, new dem(((aoa) (obj1)), intent.getStringArrayExtra("image_urls")));
        return;
_L126:
        jnv1 = intent.getStringExtra("phone_number");
        a(((dcw) (obj)), intent, new dau(((aoa) (obj1)), intent.getExtras().getBoolean("callerid_set_unset"), jnv1));
        return;
_L146:
        i1--;
          goto _L181
    }

    public static void d(String s1)
    {
        Object obj = dcn.l();
        if (obj == null)
        {
            return;
        } else
        {
            obj = a(((aoa) (obj)).h(), 146);
            ((Intent) (obj)).putExtra("mms_dump_file", s1);
            c(((Intent) (obj)), jmq.a());
            return;
        }
    }

    public static boolean d(aoa aoa1, String s1)
    {
        if (a)
        {
            String s2 = String.valueOf(i);
            String s3 = h;
            String s4 = String.valueOf(aoa1.a());
            eev.b("Babel", (new StringBuilder(String.valueOf(s2).length() + 30 + String.valueOf(s3).length() + String.valueOf(s1).length() + String.valueOf(s4).length())).append("isFocusedConversation ").append(s2).append("/").append(s3).append(" ?==? ").append(s1).append("/").append(s4).toString());
        }
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        if (TextUtils.equals(aoa1.a(), h) && i != null && i.contains(s1))
        {
            return true;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        aoa1;
        obj;
        JVM INSTR monitorexit ;
        throw aoa1;
    }

    public static int e(int i1)
    {
        return c(a(i1, 148), jmq.a());
    }

    public static int e(aoa aoa1, String s1)
    {
        if (r())
        {
            return ((alw)hlp.a(g.nU, alw)).a(new dkb(aoa1, s1)).a();
        } else
        {
            aoa1 = a(aoa1.h(), 192);
            aoa1.putExtra("status_message", s1);
            return c(aoa1, jmq.a());
        }
    }

    public static int e(aoa aoa1, String s1, String s2)
    {
        return c(a(aoa1.h(), 178, s1).putExtra("ringtone_uri", s2), jmq.a());
    }

    public static void e()
    {
        c(i(173), jmq.a());
    }

    static void e(Intent intent)
    {
        b(intent, jmq.a());
    }

    public static void e(aoa aoa1)
    {
        b(a(aoa1.h(), 162), jmq.a());
    }

    private static void e(String s1)
    {
        String s2 = String.valueOf("[RealTimeChatService] ");
        s1 = String.valueOf(s1);
        if (s1.length() != 0)
        {
            s1 = s2.concat(s1);
        } else
        {
            s1 = new String(s2);
        }
        eev.b("Babel", s1);
    }

    public static int f(int i1)
    {
        return c(a(i1, 150), jmq.a());
    }

    public static int f(aoa aoa1, String s1)
    {
        return c(a(aoa1.h(), 143, s1), jmq.a());
    }

    public static int f(aoa aoa1, String s1, String s2)
    {
        aoa1 = a(aoa1.h(), 135);
        aoa1.putExtra("picasa_photo_id", s2);
        aoa1.putExtra("gaia_id", s1);
        return c(aoa1, jmq.a());
    }

    public static void f()
    {
        c(i(174), jmq.a());
    }

    private void f(Intent intent)
    {
        Bundle bundle = intent.getExtras();
        if (bundle.containsKey("server_response_id"))
        {
            int i1 = intent.getIntExtra("account_id", -1);
            if (!((gqz)hlp.a(getApplicationContext(), gqz)).a(i1).d("preserve_response_data"))
            {
                intent = getApplicationContext();
                long l1 = bundle.getLong("server_response_id");
                dlz.a(intent).d(l1);
            }
        }
    }

    public static void f(aoa aoa1)
    {
        u.post(new dhp(aoa1));
    }

    public static int g()
    {
        return c(i(165), jmq.a());
    }

    public static int g(aoa aoa1, String s1)
    {
        return c(a(aoa1.h(), 117, s1), jmq.a());
    }

    public static String g(int i1)
    {
        switch (i1)
        {
        case 15: // '\017'
        case 17: // '\021'
        case 18: // '\022'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
        case 24: // '\030'
        case 25: // '\031'
        case 26: // '\032'
        case 27: // '\033'
        case 28: // '\034'
        case 29: // '\035'
        case 34: // '"'
        case 40: // '('
        case 43: // '+'
        case 45: // '-'
        case 46: // '.'
        case 50: // '2'
        case 51: // '3'
        case 57: // '9'
        case 61: // '='
        case 63: // '?'
        case 64: // '@'
        case 67: // 'C'
        case 70: // 'F'
        case 75: // 'K'
        case 77: // 'M'
        case 87: // 'W'
        case 88: // 'X'
        case 93: // ']'
        case 95: // '_'
        case 102: // 'f'
        case 105: // 'i'
        case 106: // 'j'
        case 107: // 'k'
        case 108: // 'l'
        case 110: // 'n'
        case 118: // 'v'
        case 119: // 'w'
        case 122: // 'z'
        case 123: // '{'
        case 125: // '}'
        case 126: // '~'
        case 127: // '\177'
        case 129: 
        case 138: 
        case 154: 
        case 155: 
        case 156: 
        case 158: 
        case 159: 
        case 161: 
        case 164: 
        case 166: 
        case 168: 
        case 170: 
        case 177: 
        case 178: 
        case 187: 
        case 188: 
        case 190: 
        case 191: 
        case 194: 
        case 198: 
        case 201: 
        default:
            String s1 = String.valueOf(Integer.toString(i1));
            return (new StringBuilder(String.valueOf(s1).length() + 17)).append("(unknown opcode ").append(s1).append(")").toString();

        case 13: // '\r'
            return "OP_REGISTER_ACCOUNT";

        case 14: // '\016'
            return "OP_UNREGISTER_ACCOUNT";

        case 16: // '\020'
            return "OP_ACCOUNT_REMOVED";

        case 19: // '\023'
            return "OP_SET_SELF_INFO_BIT";

        case 30: // '\036'
            return "OP_START_CONVERSATION";

        case 31: // '\037'
            return "OP_SEND_MESSAGE";

        case 32: // ' '
            return "OP_INVITE_PARTICIPANTS";

        case 33: // '!'
            return "OP_LEAVE_CONVERSATION";

        case 35: // '#'
            return "OP_UPDATE_CONVERSATION_WATERMARK";

        case 36: // '$'
            return "OP_REMOVE_MESSAGE";

        case 37: // '%'
            return "OP_SET_CONVERSATION_NAME";

        case 38: // '&'
            return "OP_SET_CONVERSATION_NOTIFICATION_LEVEL";

        case 39: // '\''
            return "OP_RECEIVE_RESPONSE";

        case 41: // ')'
            return "OP_REPLY_TO_INVITATION";

        case 203: 
            return "OP_DECLINE_ALL_INVITES";

        case 42: // '*'
            return "OP_REQUEST_MORE_EVENTS";

        case 44: // ','
            return "OP_RETRY_SEND_MESSAGE";

        case 47: // '/'
            return "OP_SET_MESSAGE_FAILED";

        case 48: // '0'
            return "OP_SEND_PRESENCE_REQUEST";

        case 49: // '1'
            return "OP_SEND_TYPING_REQUEST";

        case 52: // '4'
            return "OP_REQUEST_SUGGESTED_CONTACTS";

        case 53: // '5'
            return "OP_RECEIVE_SERVER_UPDATE";

        case 54: // '6'
            return "OP_REQUEST_MORE_CONVERSATIONS";

        case 55: // '7'
            return "OP_REQUEST_WARM_SYNC";

        case 56: // '8'
            return "OP_SYNC_BASELINE_SUGGESTED_CONTACTS";

        case 193: 
            return "OP_CACHE_PRESENCE";

        case 58: // ':'
            return "OP_REQUEST_SEARCH_CONTACTS";

        case 59: // ';'
            return "OP_REQUEST_GET_CONTACT_BY_ID";

        case 60: // '<'
            return "OP_SET_ACTIVE_CLIENT";

        case 62: // '>'
            return "OP_MODIFY_OTR_STATUS";

        case 65: // 'A'
            return "OP_REQUEST_CONVERSATION_META_DATA";

        case 66: // 'B'
            return "OP_SET_DND_SETTING";

        case 68: // 'D'
            return "OP_SET_HANGOUT_NOTIFICATION_STATUS";

        case 69: // 'E'
            return "OP_GET_PROFILE";

        case 71: // 'G'
            return "OP_RECEIVE_SIMULATED_EVENT";

        case 72: // 'H'
            return "OP_ARCHIVE_CONVERSATIONS";

        case 73: // 'I'
            return "OP_REQUEST_HANGOUT_INFO";

        case 74: // 'J'
            return "OP_LOCALE_CHANGED";

        case 76: // 'L'
            return "OP_EXPIRE_LAST_MESSAGE";

        case 78: // 'N'
            return "OP_REPORT_CALL_PERF_STATS";

        case 79: // 'O'
            return "OP_REQUEST_HANGOUT_PARTICIPANTS";

        case 80: // 'P'
            return "OP_DELETE_MESSAGE";

        case 81: // 'Q'
            return "OP_UPDATE_CONVERSATION_SCROLL_TIME";

        case 82: // 'R'
            return "OP_UPDATE_MESSAGE_SCROLL_TIME";

        case 83: // 'S'
            return "OP_RETRY_CREATE_CONVERSATION";

        case 84: // 'T'
            return "OP_SET_CONVERSATION_CREATE_FAILED";

        case 85: // 'U'
            return "OP_START_PHONE_VERIFICATION";

        case 86: // 'V'
            return "OP_FINISH_PHONE_VERIFICATION";

        case 89: // 'Y'
            return "OP_GET_CHAT_ACL_SETTINGS";

        case 90: // 'Z'
            return "OP_SET_CHAT_ACL_SETTING";

        case 91: // '['
            return "OP_DELETE_CONVERSATION";

        case 92: // '\\'
            return "OP_SET_USER_BLOCK";

        case 94: // '^'
            return "OP_CLEANUP_DB";

        case 96: // '`'
            return "OP_LOAD_BLOCKED_PEOPLE";

        case 97: // 'a'
            return "OP_CLEAR_ALERTED_MESSAGES";

        case 98: // 'b'
            return "OP_REFRESH_PARTICIPANTS_INFO";

        case 99: // 'c'
            return "OP_SEND_OFFNETWORK_INVITATION";

        case 100: // 'd'
            return "OP_HANDLE_PACKAGE_REPLACED";

        case 101: // 'e'
            return "OP_REVERT_CONVERSATION_NAME";

        case 103: // 'g'
            return "OP_SET_CONVERSATION_INVITE_FAILURE";

        case 104: // 'h'
            return "OP_UNREGISTER_REMOVED_ACCOUNTS";

        case 109: // 'm'
            return "OP_RECEIVE_SMS_MESSAGE";

        case 111: // 'o'
            return "OP_SEND_PENDING_CONVERSATION_OPERATIONS";

        case 112: // 'p'
            return "OP_RECEIVE_MMS_MESSAGE";

        case 113: // 'q'
            return "OP_COMPLETE_CANCEL_SEND_MESSAGE";

        case 114: // 'r'
            return "OP_PATCH_AFTER_REQUEST_WRITER_UPGRADE";

        case 115: // 's'
            return "OP_RECEIVE_MMS_WAP_PUSH";

        case 116: // 't'
            return "OP_RETRIEVE_MMS_MESSAGE";

        case 117: // 'u'
            return "OP_RESTART_PURGED_CONVERSATION";

        case 192: 
            return "OP_SET_STATUS_MESSAGE";

        case 120: // 'x'
            return "OP_DISMISS_SUGGESTED_CONTACT";

        case 121: // 'y'
            return "OP_SET_RICH_PRESENCE_ENABLED_STATE";

        case 124: // '|'
            return "OP_INSERT_PARTICIPANT_ENTITY";

        case 128: 
            return "OP_RECEIVE_SMS_DELIVERY_REPORT";

        case 130: 
            return "OP_FORWARD_MMS_MESSAGE";

        case 131: 
            return "OP_HANDLE_STORAGE_LOW_SMS";

        case 132: 
            return "OP_HANDLE_STORAGE_OK_SMS";

        case 133: 
            return "OP_FREE_SMS_STORAGE";

        case 134: 
            return "OP_UPLOAD_ANALYTICS";

        case 189: 
            return "OP_GET_USER_PHOTO_ALBUMS";

        case 135: 
            return "OP_GET_VIDEO_DATA";

        case 136: 
            return "OP_REMOVE_CONVERSATION_IF_EMPTY";

        case 137: 
            return "OP_SYNC_SMS_MESSAGES";

        case 139: 
            return "OP_TRIGGER_DEFERRED_NOTIFICATION";

        case 140: 
            return "OP_REVIVE_MMS_NOTIFICATION";

        case 141: 
            return "OP_RENEW_ACCOUNT_REGISTRATION";

        case 142: 
            return "OP_CREATE_HANGOUT_ID";

        case 143: 
            return "OP_LEAVE_CONTINGENCY_FAILED";

        case 144: 
            return "OP_DELETE_CONVERSATION_FAILED";

        case 145: 
            return "OP_UPLOAD_VIDEO_CALL_LOGS";

        case 146: 
            return "OP_RECEIVE_SMSMMS_FROM_DUMP_FILE";

        case 147: 
            return "OP_SEND_EASTER_EGG";

        case 148: 
            return "OP_GET_VOICE_ACCOUNT_INFO";

        case 149: 
            return "OP_CLEANUP_EVENT_SUGGESTIONS";

        case 150: 
            return "OP_ENABLE_VOICE_CALLING";

        case 151: 
            return "OP_GET_CALL_RATE";

        case 195: 
            return "OP_SYNC_PROXY_NUMBERS";

        case 197: 
            return "OP_GET_PROXY_NUMBER";

        case 152: 
            return "OP_SEND_STRESS_TEST_MESSAGE";

        case 153: 
            return "OP_ADD_RECENT_PSTN_CALL";

        case 157: 
            return "OP_GET_PHONE_LIST";

        case 196: 
            return "OP_FETCH_PROXY_NUMBER";

        case 160: 
            return "OP_CLEAR_CONTINUATION_TOKEN";

        case 162: 
            return "OP_POLL_PARASITE_OPERATIONS";

        case 181: 
            return "OP_ADD_BROADCAST";

        case 182: 
            return "OP_GET_BROADCAST";

        case 183: 
            return "OP_MODIFY_BROADCAST";

        case 184: 
            return "OP_REMOVE_BROADCAST";

        case 163: 
            return "OP_WARN_NO_SIM_FOR_SMS";

        case 165: 
            return "OP_MAYBE_REFRESH_CONTACTS_DATA";

        case 167: 
            return "OP_REFRESH_SMS_PARTICIPANTS";

        case 169: 
            return "OP_TEST_WATCHDOG";

        case 171: 
            return "OP_UNMERGE_CONVERSATIONS";

        case 172: 
            return "OP_REQUEST_FIFE_URLS";

        case 173: 
            return "OP_MERGE_ALL_CONVERSATIONS";

        case 174: 
            return "OP_UNMERGE_ALL_CONVERSATIONS";

        case 175: 
            return "OP_UNDISMISS_SUGGESTED_CONTACT";

        case 180: 
            return "OP_UPDATE_CONVERSATION_CALL_MEDIA_TYPE";

        case 176: 
            return "OP_SAVE_SMS_AND_NOTIFY_IF_UNREAD";

        case 179: 
            return "OP_GET_AUDIO_DATA";

        case 185: 
            return "OP_FORK_CONVERSATION";

        case 186: 
            return "OP_TICKLE_GCM";

        case 199: 
            return "OP_UPDATE_FAVORITE_CONTACT";

        case 200: 
            return "OP_GET_FAVORITES";

        case 202: 
            return "OP_TRIGGER_RENOTIFICATION";
        }
    }

    public static void g(aoa aoa1)
    {
        c(a(aoa1.h(), 163), jmq.a());
    }

    public static void g(aoa aoa1, String s1, String s2)
    {
        synchronized (g)
        {
            if (d(aoa1, s1))
            {
                h = aoa1.a();
                if (i.remove(s1))
                {
                    i.add(s2);
                }
            }
        }
        synchronized (l)
        {
            l.put(s1, s2);
        }
        u.post(new dhd(s1, s2));
        return;
        aoa1;
        obj;
        JVM INSTR monitorexit ;
        throw aoa1;
        s1;
        aoa1;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public static int h(aoa aoa1, String s1)
    {
        return c(a(aoa1.h(), 33, s1), jmq.a());
    }

    public static void h()
    {
        u.post(new dgq());
    }

    private static final void h(int i1)
    {
        b.b(g(i1));
    }

    private static void h(aoa aoa1)
    {
        dkg dkg1 = dkg.a(aoa1);
        if (dkg1 == null)
        {
            e("Do not tickle gcm for sms only account");
        } else
        if (!dkg1.e() && !dkg1.f())
        {
            if (a)
            {
                e("TickleGcmOperation skipped");
                return;
            }
        } else
        {
            b(a(aoa1.h(), 186), jmq.a());
            return;
        }
    }

    private static Intent i(int i1)
    {
        Intent intent = new Intent(g.nU, com/google/android/apps/hangouts/realtimechat/RealTimeChatService);
        intent.putExtra("op", i1);
        h(i1);
        return intent;
    }

    public static void i()
    {
        u.post(new dgr());
    }

    private static void i(aoa aoa1)
    {
        dkf dkf1 = dkf.a(aoa1);
        if (!dkf1.e() && !dkf1.f())
        {
            if (a)
            {
                aoa1 = String.valueOf(aoa1.a());
                if (aoa1.length() != 0)
                {
                    aoa1 = "SyncSmsDeletedMessagesOperation is idle: ".concat(aoa1);
                } else
                {
                    aoa1 = new String("SyncSmsDeletedMessagesOperation is idle: ");
                }
                e(aoa1);
            }
            return;
        } else
        {
            c(a(aoa1.h(), 137), jmq.a());
            return;
        }
    }

    public static void i(aoa aoa1, String s1)
    {
        if (aow.a(s1) && !aow.b(s1))
        {
            c(a(aoa1.h(), 83, s1), jmq.a());
        }
    }

    public static void j()
    {
        aoa aoa1 = dcn.l();
        if (aoa1 == null)
        {
            return;
        } else
        {
            c(a(aoa1.h(), 131), jmq.a());
            return;
        }
    }

    private static void j(int i1)
    {
        dih dih1 = dih.b(i1);
        if (!dih1.e() && !dih1.f())
        {
            if (a)
            {
                e((new StringBuilder(49)).append("RefreshParticipantsOperation is idle: ").append(i1).toString());
            }
            return;
        } else
        {
            c(a(i1, 98), jmq.a());
            return;
        }
    }

    public static void j(aoa aoa1, String s1)
    {
        c(a(aoa1.h(), 180, s1).putExtra("call_media_type", 0), jmq.a());
    }

    public static int k(aoa aoa1, String s1)
    {
        aoa1 = a(aoa1.h(), 120);
        aoa1.putExtra("gaia_id", s1);
        return c(aoa1, jmq.a());
    }

    public static void k()
    {
        aoa aoa1 = dcn.l();
        if (aoa1 == null)
        {
            return;
        } else
        {
            c(a(aoa1.h(), 132), jmq.a());
            return;
        }
    }

    private static void k(int i1)
    {
        dku dku1 = dku.b(i1);
        if (!dku1.e() && !dku1.f())
        {
            if (a)
            {
                e((new StringBuilder(45)).append("UploadAnalyticsOperation is idle: ").append(i1).toString());
            }
            return;
        } else
        {
            c(a(i1, 134), jmq.a());
            return;
        }
    }

    public static int l(aoa aoa1, String s1)
    {
        return c(a(aoa1.h(), 42, s1), jmq.a());
    }

    private static void l(int i1)
    {
        Object obj = djt.b(i1);
        if (obj != null)
        {
            m.remove(obj);
        }
        obj = dke.c(i1);
        if (obj != null)
        {
            m.remove(obj);
        }
        obj = dih.c(i1);
        if (obj != null)
        {
            m.remove(obj);
        }
    }

    public static boolean l()
    {
        return a;
    }

    public static int m(aoa aoa1, String s1)
    {
        if (aow.a(s1))
        {
            return 0;
        } else
        {
            return c(a(aoa1.h(), 65, s1), jmq.a());
        }
    }

    public static void m()
    {
        q();
    }

    public static int n(aoa aoa1, String s1)
    {
        return c(a(aoa1.h(), 97, s1), jmq.a());
    }

    public static SparseArray n()
    {
        return y;
    }

    public static int o(aoa aoa1, String s1)
    {
        return c(a(aoa1.h(), 79, s1), jmq.a());
    }

    public static CopyOnWriteArrayList o()
    {
        return o;
    }

    public static int p(aoa aoa1, String s1)
    {
        aoa1 = a(aoa1.h(), 145);
        aoa1.putExtra("compressed_log_file", s1);
        return c(aoa1, jmq.a());
    }

    public static CopyOnWriteArrayList p()
    {
        return p;
    }

    public static int q(aoa aoa1, String s1)
    {
        aoa1 = a(aoa1.h(), 189);
        aoa1.putExtra("user_id", s1);
        return c(aoa1, jmq.a());
    }

    private static void q()
    {
        boolean flag = g.a(g.nU, "babel_log_dump", false);
        Object obj = v;
        obj;
        JVM INSTR monitorenter ;
        if (!flag) goto _L2; else goto _L1
_L1:
        if (s != null) goto _L2; else goto _L3
_L3:
        s = new gnd(100);
_L5:
        t = flag;
        obj;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (flag) goto _L5; else goto _L4
_L4:
        if (s == null) goto _L5; else goto _L6
_L6:
        s = null;
          goto _L5
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static int r(aoa aoa1, String s1)
    {
        aoa1 = a(aoa1.h(), 179);
        aoa1.putExtra("picasa_photo_id", s1);
        return c(aoa1, jmq.a());
    }

    private static boolean r()
    {
        return ((dkx)hlp.a(g.nU, dkx)).a();
    }

    public static int s(aoa aoa1, String s1)
    {
        aoa1 = a(aoa1.h(), 99);
        aoa1.putExtra("email_address", s1);
        return c(aoa1, jmq.a());
    }

    private static PendingIntent s()
    {
        Intent intent = new Intent("com.google.android.apps.hangouts.CLEANUP_DB");
        intent.putExtra("op", 94);
        return PendingIntent.getBroadcast(g.nU, eee.a(102), intent, 0x10000000);
    }

    public static int t(aoa aoa1, String s1)
    {
        return c(a(aoa1.h(), 160, s1), jmq.a());
    }

    public static int u(aoa aoa1, String s1)
    {
        aoa1 = a(aoa1.h(), 194);
        aoa1.putExtra("phone_number", s1);
        return c(aoa1, jmq.a());
    }

    protected void a(Intent intent, long l1, jnv jnv1)
    {
        if (intent != null) goto _L2; else goto _L1
_L1:
        eev.f("Babel", "RTCS onHandleIntent called with null intent");
_L16:
        return;
_L2:
        int i1;
        int j1;
        long l2;
        long l3;
        boolean flag;
        i1 = intent.getIntExtra("op", 0);
        if (i1 == 78)
        {
            g.b(2376);
        }
        j1 = intent.getIntExtra("account_id", -1);
        l3 = intent.getLongExtra("rqtms", 0L);
        if (a || t)
        {
            l2 = intent.getLongExtra("rqtns", 0L);
        } else
        {
            l2 = 0L;
        }
        if (a)
        {
            long l4 = (l1 - l2) / 0xf4240L;
            String s1 = String.valueOf(g(i1));
            eev.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 86)).append("RTCIntent: start processing intent:").append(s1).append(" account:").append(j1).append(" delay: ").append(l4).append(" ms").toString());
        }
        if (d == intent.getIntExtra("pid", -1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (a)
        {
            String s2 = String.valueOf(intent);
            String s6 = String.valueOf(intent.getAction());
            String s10 = String.valueOf(g(i1));
            e((new StringBuilder(String.valueOf(s2).length() + 47 + String.valueOf(s6).length() + String.valueOf(s10).length())).append("onHandleIntent ").append(s2).append(" ").append(s6).append(" opcode: ").append(s10).append(" respectWakeLock ").append(flag).toString());
        }
        if (flag && (r == null || !r.isHeld()))
        {
            jnv1 = String.valueOf(intent);
            String s3 = String.valueOf(intent.getAction());
            String s7 = String.valueOf(g(i1));
            String s11 = String.valueOf(r);
            if (r == null)
            {
                intent = "(null)";
            } else
            {
                intent = Boolean.valueOf(r.isHeld());
            }
            intent = String.valueOf(intent);
            eev.g("Babel", (new StringBuilder(String.valueOf(jnv1).length() + 58 + String.valueOf(s3).length() + String.valueOf(s7).length() + String.valueOf(s11).length() + String.valueOf(intent).length())).append("RTCS.onHandleIntent called ").append(jnv1).append(" ").append(s3).append(" opcode: ").append(s7).append(" sWakeLock: ").append(s11).append(" isHeld: ").append(intent).toString());
            if (i1 == 78)
            {
                g.b(2377);
            }
            throw new IllegalStateException();
        }
        aoq.a();
        i1;
        JVM INSTR lookupswitch 9: default 1554
    //                   16: 951
    //                   74: 850
    //                   94: 897
    //                   100: 934
    //                   141: 919
    //                   149: 969
    //                   165: 1094
    //                   173: 1100
    //                   174: 1107;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L3:
        aoa aoa1 = dcn.e(j1);
        if (aoa1 != null) goto _L14; else goto _L13
_L13:
        eev.g("Babel", "skipping intent for invalid account");
        if (i1 != 78)
        {
            break; /* Loop/switch isn't completed */
        }
        g.b(2378);
_L18:
        if (edc.b())
        {
            edc.c();
        }
        aoq.b();
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (a)
        {
            e("releasing wakelock");
        }
        int k1;
        long l5;
        try
        {
            r.release();
        }
        // Misplaced declaration of an exception variable
        catch (jnv jnv1)
        {
            String s4 = String.valueOf(intent);
            String s8 = String.valueOf(intent.getAction());
            String s12 = String.valueOf(g(i1));
            String s14 = String.valueOf(r);
            if (r == null)
            {
                intent = "(null)";
            } else
            {
                intent = Boolean.valueOf(r.isHeld());
            }
            intent = String.valueOf(intent);
            eev.g("Babel", (new StringBuilder(String.valueOf(s4).length() + 62 + String.valueOf(s8).length() + String.valueOf(s12).length() + String.valueOf(s14).length() + String.valueOf(intent).length())).append("RTCS.onHandleIntent exit crash ").append(s4).append(" ").append(s8).append(" opcode: ").append(s12).append(" sWakeLock: ").append(s14).append(" isHeld: ").append(intent).toString());
            throw jnv1;
        }
        if (!t && !a) goto _L16; else goto _L15
_L15:
        l5 = System.nanoTime();
        if (t && s != null)
        {
            jnv1 = new dhu(i1, l3, l2, l1, l5);
            synchronized (v)
            {
                if (s != null)
                {
                    s.a(jnv1);
                }
            }
        }
        if (!a) goto _L16; else goto _L17
_L17:
        l1 = (l5 - l1) / 0xf4240L;
        intent = String.valueOf(g(i1));
        eev.b("Babel", (new StringBuilder(String.valueOf(intent).length() + 86)).append("RTCIntent: finish processing intent:").append(intent).append(" account:").append(j1).append(" time: ").append(l1).append(" ms").toString());
        return;
_L5:
        eev.c("Babel", "locale changed.");
        EsProvider.a(this);
          goto _L18
        jnv1;
        aoq.b();
        if (flag)
        {
            if (a)
            {
                e("releasing wakelock");
            }
            try
            {
                r.release();
            }
            // Misplaced declaration of an exception variable
            catch (jnv jnv1)
            {
                String s5 = String.valueOf(intent);
                String s9 = String.valueOf(intent.getAction());
                String s13 = String.valueOf(g(i1));
                String s15 = String.valueOf(r);
                if (r == null)
                {
                    intent = "(null)";
                } else
                {
                    intent = Boolean.valueOf(r.isHeld());
                }
                intent = String.valueOf(intent);
                eev.g("Babel", (new StringBuilder(String.valueOf(s5).length() + 62 + String.valueOf(s9).length() + String.valueOf(s13).length() + String.valueOf(s15).length() + String.valueOf(intent).length())).append("RTCS.onHandleIntent exit crash ").append(s5).append(" ").append(s9).append(" opcode: ").append(s13).append(" sWakeLock: ").append(s15).append(" isHeld: ").append(intent).toString());
                throw jnv1;
            }
        }
        throw jnv1;
_L6:
        eev.c("Babel", "clean up database.");
        dnw.c().a(getApplicationContext());
          goto _L18
_L8:
        eev.c("Babel", "renew accounts.");
        dcn.p();
          goto _L18
_L7:
        PackageReplacedReceiver.a(intent.getAction(), intent.getStringExtra("package"));
          goto _L18
_L4:
        l(j1);
        dny.a(j1);
        dod.a(j1);
          goto _L18
_L9:
        jnv1 = intent.getStringExtra("conversation_id");
        l5 = intent.getLongExtra("timestamp", 0L);
        k1 = (new aow(this, j1)).e(jnv1, l5);
        if (a)
        {
            eev.b("Babel", (new StringBuilder(String.valueOf(jnv1).length() + 152)).append("Deleted ").append(k1).append(" played event suggestions for conversation ").append(jnv1).append(" on account ").append(j1).append(" where the last played event was at timestamp ").append(l5).append(".").toString());
        }
          goto _L18
_L10:
        doy.e();
          goto _L18
_L11:
        aow.a(this);
          goto _L18
_L12:
        aow.b(this);
          goto _L18
_L14:
        if (dcn.f(aoa1) && !a(intent) && i1 != 19)
        {
            break MISSING_BLOCK_LABEL_1147;
        }
        d(intent, jnv1);
          goto _L18
        if (i1 != 78)
        {
            break MISSING_BLOCK_LABEL_1160;
        }
        g.b(2525);
        g.b(j1, 2566).a(i1).d();
          goto _L18
        jnv1;
        intent;
        JVM INSTR monitorexit ;
        throw jnv1;
    }

    public void a(Intent intent, jnv jnv1)
    {
        long l1;
        if (a || t)
        {
            l1 = System.nanoTime();
        } else
        {
            l1 = 0L;
        }
        if (C != null)
        {
            C.b(intent);
        }
        a(intent, l1, jnv1);
        if (C != null)
        {
            C.a();
        }
    }

    protected boolean a(Intent intent)
    {
        switch (intent.getIntExtra("op", -1))
        {
        default:
            return false;

        case 13: // '\r'
        case 14: // '\016'
            return true;

        case 39: // '\''
            intent = intent.getStringExtra("server_response_type");
            break;
        }
        return czm.getName().equals(intent);
    }

    public void onCreate()
    {
        if (a)
        {
            e("Creating RTCS");
        }
        super.onCreate();
        DebugActivity.a(getApplicationContext());
        if (!A)
        {
            if (a)
            {
                eev.c("Babel", "start and bind to the request writer");
            }
            getApplicationContext().startService(RequestWriter.k());
            bindService(new Intent(this, com/google/android/apps/hangouts/requestwriter/RequestWriter), B, 1);
            A = true;
        }
        (new dhs(this)).execute(new Void[0]);
    }

    public void onDestroy()
    {
        if (a)
        {
            eev.b("Babel", "Destroying RTCS");
        }
        if (A)
        {
            if (a)
            {
                eev.c("Babel", "unbind to the request writer");
            }
            unbindService(B);
            z = null;
            A = false;
        }
        super.onDestroy();
        if (C != null)
        {
            C.b();
        }
    }

    public int onStartCommand(Intent intent, int i1, int j1)
    {
        if ((i1 & 1) != 0)
        {
            String s1 = String.valueOf(intent);
            String s2 = String.valueOf(intent.getAction());
            String s3 = String.valueOf(g(intent.getIntExtra("op", 0)));
            eev.f("Babel", (new StringBuilder(String.valueOf(s1).length() + 98 + String.valueOf(s2).length() + String.valueOf(s3).length())).append("RTCS.onStartCommand called for redelivery / retry ").append(s1).append(" ").append(s2).append(" opcode: ").append(s3).append(" flags ").append(i1).append(" startId ").append(j1).toString());
        }
        return super.onStartCommand(intent, i1, j1);
    }

    static 
    {
        hnc hnc = eev.n;
        q();
        g.a(g.nU).a(new dgy());
    }
}
