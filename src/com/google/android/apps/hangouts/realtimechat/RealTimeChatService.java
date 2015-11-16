// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.realtimechat;

import aik;
import aim;
import ais;
import alw;
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
import ani;
import ank;
import anv;
import any;
import aob;
import aoe;
import aoh;
import aos;
import apd;
import aqm;
import byh;
import byy;
import cej;
import ceu;
import cey;
import cf;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.phone.DebugActivity;
import com.google.android.apps.hangouts.phone.PackageReplacedReceiver;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;
import cps;
import cpz;
import crm;
import csv;
import cti;
import ctr;
import ctv;
import cuc;
import cvn;
import cvr;
import cvs;
import cwa;
import cwi;
import cwk;
import cwl;
import cwn;
import cwp;
import cwq;
import cwt;
import cxi;
import cxt;
import cxx;
import cya;
import cyj;
import cyk;
import cyq;
import cyr;
import cys;
import cyt;
import cyv;
import cyy;
import cyz;
import cza;
import czf;
import czh;
import czi;
import czj;
import czm;
import czn;
import czo;
import dag;
import daj;
import daz;
import dba;
import dbc;
import dbd;
import dbe;
import dbf;
import dbn;
import dbo;
import dbq;
import dbv;
import dbw;
import dbx;
import dcf;
import dcg;
import dch;
import dcm;
import dcn;
import dco;
import dcp;
import dcq;
import dcr;
import dcs;
import dct;
import dcu;
import dcv;
import dcx;
import dcy;
import dcz;
import dda;
import ddb;
import ddc;
import ddd;
import dde;
import ddf;
import ddg;
import ddh;
import ddi;
import ddj;
import ddl;
import ddn;
import ddo;
import ddp;
import ddz;
import dea;
import deb;
import deh;
import dei;
import dek;
import dep;
import dey;
import dfa;
import dfb;
import dfd;
import dfe;
import dff;
import dfg;
import dfh;
import dfi;
import dfj;
import dfk;
import dfl;
import dfm;
import dfn;
import dfo;
import dfp;
import dfq;
import dfr;
import dfs;
import dft;
import dfu;
import dfv;
import dfw;
import dfx;
import dfy;
import dfz;
import dga;
import dgb;
import dgc;
import dgd;
import dge;
import dgf;
import dgg;
import dgh;
import dgi;
import dgj;
import dgl;
import dgm;
import dgn;
import dgo;
import dgp;
import dgu;
import dgv;
import dgy;
import dgz;
import dha;
import dhb;
import dhc;
import dhd;
import dhe;
import dhf;
import dhg;
import dhi;
import dhj;
import dhk;
import dhl;
import dhn;
import dhp;
import dhr;
import dhs;
import dhx;
import dhy;
import dic;
import did;
import dig;
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
import div;
import diw;
import dix;
import diy;
import diz;
import dja;
import djh;
import dji;
import djj;
import djk;
import djl;
import djm;
import dkb;
import dki;
import dkl;
import dko;
import dkt;
import dkz;
import dlb;
import dlg;
import dme;
import doq;
import dqb;
import dqc;
import drk;
import drs;
import dzf;
import dzy;
import eaa;
import eba;
import ebj;
import ebr;
import ebw;
import ebz;
import ffo;
import g;
import gam;
import gbh;
import gbk;
import gkb;
import gms;
import gmu;
import gmw;
import gz;
import h;
import hgx;
import izx;
import izy;
import jac;
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
import jbw;
import jdh;
import jed;
import jhb;
import l;

public class RealTimeChatService extends djl
{

    private static final boolean a = false;
    private static boolean b = false;
    private static final int c = Process.myPid();
    private static volatile dgn d = null;
    private static volatile dgo e = null;
    private static final Object f = new Object();
    private static String g;
    private static Set h;
    private static final SparseArray i = new SparseArray();
    private static int j;
    private static final Map k = new gz();
    private static final Queue l = new LinkedBlockingQueue();
    private static Map m = new ConcurrentHashMap();
    private static final CopyOnWriteArrayList n = new CopyOnWriteArrayList();
    private static final CopyOnWriteArrayList o = new CopyOnWriteArrayList();
    private static final Object p = new Object();
    private static android.os.PowerManager.WakeLock q;
    private static gkb r;
    private static boolean s;
    private static final Handler t = new Handler(Looper.getMainLooper());
    private static final Object u = new Object();
    private static final ScheduledExecutorService v = Executors.newSingleThreadScheduledExecutor();
    private static final SparseArray w = new SparseArray();
    private static final SparseArray x = new SparseArray();
    private ServiceConnection A;
    private djj B;
    private volatile dkb y;
    private boolean z;

    public RealTimeChatService()
    {
        super("RealTimeChatService");
        A = new dfe(this);
    }

    public RealTimeChatService(String s1)
    {
        super(s1);
        A = new dfe(this);
    }

    public static int a(int i1, int j1, dbx dbx1)
    {
        Intent intent = a(i1, 153);
        intent.putExtra("recent_call_type", j1);
        intent.putExtra("recent_call_action_info", dbx1);
        return c(intent, jhb.d());
    }

    public static int a(int i1, int j1, boolean flag)
    {
        Intent intent = a(i1, 19);
        intent.putExtra("setselfinfo_bit", j1);
        intent.putExtra("setselfinfo_bit_value", flag);
        return c(intent, jhb.d());
    }

    public static int a(int i1, long l1, String s1, boolean flag)
    {
        Intent intent = a(i1, 190);
        intent.putExtra("recent_call_timestamp", l1);
        intent.putExtra("recent_call_rate", s1);
        intent.putExtra("recent_call_is_free_call", flag);
        return c(intent, jhb.d());
    }

    public static int a(int i1, csv csv1, String s1, String s2, String s3)
    {
        Intent intent = a(i1, 90);
        intent.putExtra("chat_acl_key", csv1.ordinal());
        intent.putExtra("chat_acl_circle_id", s1);
        intent.putExtra("chat_acl_circle_name", s2);
        intent.putExtra("chat_acl_level", s3);
        return c(intent, jhb.d());
    }

    public static int a(int i1, String s1)
    {
        Intent intent = a(i1, 175);
        intent.putExtra("member_gaiaid", s1);
        return c(intent, jhb.d());
    }

    public static int a(int i1, String s1, ContentValues contentvalues)
    {
        Intent intent = a(i1, 193);
        intent.putExtra("gaia_id", s1);
        intent.putExtra("content_values", contentvalues);
        return c(intent, jhb.d());
    }

    public static int a(int i1, boolean flag)
    {
        dir dir1 = dir.b(i1);
        if (!flag && !dir1.e() && !dir1.f())
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
            return c(intent, jhb.d());
        }
    }

    public static int a(ani ani1, int i1)
    {
        ani1 = a(ani1.h(), 54);
        ani1.putExtra("conversation_sync_filter", i1);
        return c(ani1, jhb.d());
    }

    public static int a(ani ani1, int i1, int j1)
    {
        ani1 = a(ani1.h(), 142);
        ani1.putExtra("hangout_type", i1);
        ani1.putExtra("hangout_topic", null);
        ani1.putExtra("hangout_media_type", j1);
        return c(ani1, jhb.d());
    }

    public static int a(ani ani1, int i1, boolean flag)
    {
        ani1 = a(ani1.h(), 121);
        ani1.putExtra("extra_rich_presence_type", i1);
        ani1.putExtra("extra_rich_presence_type_enabled", flag);
        return c(ani1, jhb.d());
    }

    public static int a(ani ani1, long l1)
    {
        ani1 = a(ani1.h(), 81);
        ani1.putExtra("scroll_timestamp", System.currentTimeMillis());
        ani1.putExtra("scroll_to_item_timestamp", l1);
        return c(ani1, jhb.d());
    }

    public static int a(ani ani1, aik aik1, String s1)
    {
        ani1 = a(ani1.h(), 185);
        ani1.putExtra("audience", aik1);
        ani1.putExtra("original_conversation_id", s1);
        ani1.putExtra("conversation_lookup", aob.a);
        return c(ani1, jhb.d());
    }

    public static int a(ani ani1, izx izx1, jbw jbw1)
    {
        return c(b(ani1.h(), 183).putExtra("broadcast", izx.toByteArray(izx1)).putExtra("sync_metadata", jbw.toByteArray(jbw1)), jhb.d());
    }

    public static int a(ani ani1, String s1, int i1)
    {
        ani1 = a(ani1.h(), 38, s1);
        ani1.putExtra("notification_level", i1);
        return c(ani1, jhb.d());
    }

    public static int a(ani ani1, String s1, long l1)
    {
        ani1 = a(ani1.h(), 91, s1);
        ani1.putExtra("timestamp", l1);
        return c(ani1, jhb.d());
    }

    public static int a(ani ani1, String s1, long l1, boolean flag)
    {
        return a(ani1, new String[] {
            s1
        }, new long[] {
            l1
        }, flag, false);
    }

    public static int a(ani ani1, String s1, aik aik1)
    {
        ani1 = a(ani1.h(), 32, s1);
        ani1.putExtra("audience", aik1);
        return c(ani1, jhb.d());
    }

    public static int a(ani ani1, String s1, String s2)
    {
        return c(b(ani1.h(), 182).putExtra("hangout_id", s2).putExtra("broadcast_id", s1), jhb.d());
    }

    public static int a(ani ani1, String s1, String s2, int i1)
    {
        ani1 = a(ani1.h(), 47, s1);
        ani1.putExtra("message_id", s2);
        ani1.putExtra("error", i1);
        return c(ani1, jhb.d());
    }

    public static int a(ani ani1, String s1, String s2, String s3)
    {
        izx izx1 = new izx();
        izx1.m = Integer.valueOf(5);
        izx1.c = "HANGOUT_ABUSE_REPORT_RECORDING";
        izx1.a = s1;
        izx1.f = s2;
        izx1.i = new jac();
        izx1.i.c = s3;
        s1 = new izy();
        izx1.i.f = s1;
        s1.a = Integer.valueOf(1);
        s1.b = s3;
        return c(b(ani1.h(), 181).putExtra("broadcast", izx.toByteArray(izx1)), jhb.d());
    }

    public static int a(ani ani1, String s1, String s2, String s3, int i1, String s4, int j1, int k1, 
            String s5, String s6, boolean flag, ffo ffo, int l1)
    {
        Intent intent;
        intent = a(ani1.h(), 31, s1);
        intent.putExtra("message_text", s2);
        intent.putExtra("uri", s3);
        intent.putExtra("rotation", i1);
        intent.putExtra("picasa_photo_id", s4);
        intent.putExtra("width", j1);
        intent.putExtra("height", k1);
        intent.putExtra("content_type", s5);
        intent.putExtra("subject", s6);
        intent.putExtra("requires_mms", flag);
        if (ffo != null)
        {
            intent.putExtra("place", byh.a(ffo));
        }
        intent.putExtra("timestamp", SystemClock.elapsedRealtime() * 1000L);
        intent.putExtra("otr_state", l1);
        if (!ebr.a() || s2 == null || !s2.startsWith("///") || !s2.endsWith("///")) goto _L2; else goto _L1
_L1:
        String as[];
        s2 = s2.substring(3, s2.length() - 3);
        as = s2.split("\\.");
        if (as.length <= 0) goto _L4; else goto _L3
_L3:
        i1 = Integer.parseInt(as[0]);
_L7:
        if (as.length <= 1) goto _L6; else goto _L5
_L5:
        long l2 = Long.parseLong(as[1]);
_L8:
        (new Thread(new dga(i1, ani1, s1, s2, s3, s4, j1, k1, s5, s6, flag, ffo, l2))).start();
_L2:
        return c(intent, jhb.d());
_L4:
        i1 = 10;
          goto _L7
_L6:
        l2 = 500L;
          goto _L8
        ani1;
          goto _L2
    }

    public static int a(ani ani1, String s1, String s2, String s3, boolean flag, boolean flag1)
    {
        ani1 = a(ani1.h(), 92);
        ani1.putExtra("member_gaiaid", s1);
        ani1.putExtra("phone_number", s2);
        ani1.putExtra("user_name", s3);
        ani1.putExtra("blocked", flag);
        ani1.putExtra("retry_request", flag1);
        return c(ani1, jhb.d());
    }

    public static int a(ani ani1, String s1, boolean flag)
    {
        ani1 = a(ani1.h(), 84, s1);
        ani1.putExtra("insert_error_message", flag);
        return c(ani1, jhb.d());
    }

    public static int a(ani ani1, String s1, boolean flag, boolean flag1, boolean flag2)
    {
        ani1 = a(ani1.h(), 41, s1);
        ani1.putExtra("accept", flag);
        ani1.putExtra("block_inviter", flag2);
        ani1.putExtra("report_inviter", flag1);
        return c(ani1, jhb.d());
    }

    public static int a(ani ani1, String s1, String as[])
    {
        ani1 = a(ani1.h(), 144, s1);
        ani1.putExtra("event_ids", as);
        return c(ani1, jhb.d());
    }

    public static int a(ani ani1, ArrayList arraylist, String s1, boolean flag)
    {
        ani1 = a(ani1.h(), 59);
        ani1.putExtra("batch_gebi_tag", s1);
        ani1.putExtra("from_contact_lookup", flag);
        ani1.putParcelableArrayListExtra("com.google.android.apps.hangouts.EntityLookupSpecs", arraylist);
        return c(ani1, jhb.d());
    }

    public static int a(ani ani1, jed jed1)
    {
        ani1 = a(ani1.h(), 68);
        ani1.putExtra("hangout_invite_receipt", jed.toByteArray(jed1));
        return c(ani1, jhb.d());
    }

    public static int a(ani ani1, byte abyte0[], boolean flag)
    {
        ani1 = a(ani1.h(), 176);
        ani1.putExtra("pdu", abyte0);
        ani1.putExtra("is_sms_read", flag);
        return c(ani1, jhb.d());
    }

    public static int a(ani ani1, String as[], long al[], boolean flag, boolean flag1)
    {
        ani1 = a(ani1.h(), 72);
        ani1.putExtra("conversationids", as);
        ani1.putExtra("timestamps", al);
        ani1.putExtra("archive", flag);
        ani1.putExtra("perform_locally", flag1);
        return c(ani1, jhb.d());
    }

    public static int a(aoe aoe1, String s1, long l1)
    {
        aoe1 = a(aoe1.f().h(), 111);
        aoe1.putExtra("conversation_id", s1);
        aoe1.putExtra("extra_pending_conversation_operations", l1);
        return c(aoe1, jhb.d());
    }

    public static int a(List list, ani ani1)
    {
        String s1 = "";
        SparseArray sparsearray = i;
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
        k1 = j;
        j = k1 + 1;
        s1 = String.valueOf(s1);
        s2 = (new StringBuilder(String.valueOf(s1).length() + 11)).append(s1).append(k1).toString();
        s1 = s2;
        if (i1 >= j1 - 1)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        s1 = String.valueOf(s2).concat("|");
        i.put(k1, list.get(i1));
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        sparsearray;
        JVM INSTR monitorexit ;
        list = a(ani1.h(), 71);
        list.putExtra("simulated_event_msg_num", s1);
        return c(list, jhb.d());
        list;
        sparsearray;
        JVM INSTR monitorexit ;
        throw list;
    }

    private static Intent a(int i1, int j1)
    {
        Intent intent = h(j1);
        intent.putExtra("account_id", i1);
        return intent;
    }

    private static Intent a(int i1, int j1, String s1)
    {
        Intent intent = new Intent(g.nS, com/google/android/apps/hangouts/realtimechat/RealTimeChatService);
        intent.putExtra("op", j1);
        intent.putExtra("account_id", i1);
        intent.putExtra("conversation_id", s1);
        return intent;
    }

    public static djj a(RealTimeChatService realtimechatservice, djj djj1)
    {
        realtimechatservice.B = djj1;
        return djj1;
    }

    public static dkb a(RealTimeChatService realtimechatservice, dkb dkb)
    {
        realtimechatservice.y = dkb;
        return dkb;
    }

    private Object a(dbn dbn1, Intent intent, dfa dfa1)
    {
        if (b && dfa1 == null)
        {
            ebw.f("Babel", "executeOperation called with no operation");
            return null;
        }
        dfa1.a(intent.getStringExtra("stack_trace"));
        dfa1.a();
        int i1 = intent.getIntExtra("rid", -1);
        dgu dgu1 = new dgu(i1, dfa1.b(), null);
        Object obj = dfa1.c();
        a(intent, dgu1, obj);
        if (dfa1.a(dbn1, i1, y))
        {
            do
            {
                dbn1 = (dep)l.poll();
                if (dbn1 == null)
                {
                    break;
                }
                intent = dbf.h(((dep) (dbn1)).b);
                if (intent == null)
                {
                    dbn1 = String.valueOf(ebw.b(((dep) (dbn1)).b.a()));
                    if (dbn1.length() != 0)
                    {
                        dbn1 = "Account is not valid. Skip parasite operation:".concat(dbn1);
                    } else
                    {
                        dbn1 = new String("Account is not valid. Skip parasite operation:");
                    }
                    ebw.f("Babel", dbn1);
                } else
                {
                    dbn1.a(2);
                    dbn1.a();
                    dbn1.a(intent, 0, y);
                }
            } while (true);
            dhl.k();
        }
        return obj;
    }

    public static String a(Intent intent, ani ani1)
    {
        int i1 = intent.getIntExtra("op", -1);
        i1;
        JVM INSTR lookupswitch 2: default 36
    //                   39: 43
    //                   53: 93;
           goto _L1 _L2 _L3
_L1:
        ani1 = g(i1);
_L5:
        return ani1;
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
        Iterator iterator = cyq.a(intent, ani1, false).iterator();
        intent = "ServerUpdate: ";
        do
        {
            ani1 = intent;
            if (!iterator.hasNext())
            {
                continue;
            }
            ani1 = (cyq)iterator.next();
            intent = String.valueOf(intent);
            ani1 = String.valueOf(ani1.getClass().getSimpleName());
            intent = (new StringBuilder(String.valueOf(intent).length() + 2 + String.valueOf(ani1).length())).append(intent).append(ani1).append(", ").toString();
        } while (true);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static String a(String s1)
    {
        synchronized (k)
        {
            s1 = (String)k.get(s1);
        }
        return s1;
        s1;
        map;
        JVM INSTR monitorexit ;
        throw s1;
    }

    private List a(ani ani1, dbn dbn1, cvn cvn1)
    {
        dfb dfb1 = new dfb();
        LinkedList linkedlist = new LinkedList();
        if (a)
        {
            String s1 = String.valueOf(cvn1);
            ebw.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 17)).append("processResponse: ").append(s1).toString());
        }
        a(ani1, cvn1, dfb1, ((List) (linkedlist)));
        cej.a(getApplicationContext(), ani1.h(), dfb1.g());
        ani1 = dfb1.c();
        if (!ani1.isEmpty())
        {
            if (ebw.a("Babel", 3))
            {
                int i1 = ani1.size();
                cvn1 = String.valueOf(cvn1.getClass().getSimpleName());
                ebw.c("Babel", (new StringBuilder(String.valueOf(cvn1).length() + 62)).append("processResponse: sending ").append(i1).append(" requests from processing ").append(cvn1).toString());
            }
            dbn1.a(ani1, 0, y);
        }
        return linkedlist;
    }

    public static void a()
    {
        Intent intent = new Intent(g.nS, com/google/android/apps/hangouts/realtimechat/RealTimeChatService);
        intent.putExtra("op", 74);
        b(intent, jhb.d());
    }

    public static void a(int i1)
    {
        a(i1, false, false, 0, false);
        a(i1, false);
        i(i1);
        j(i1);
        aqm.a(i1);
    }

    public static void a(int i1, int j1, ArrayList arraylist, int k1)
    {
        dbf.h(dbf.e(j1)).a(new dey(arraylist, k1), i1);
    }

    public static void a(int i1, long l1)
    {
        Intent intent = a(i1, 66);
        intent.putExtra("dnd_expiration", l1);
        b(intent, jhb.d());
    }

    public static void a(int i1, long l1, boolean flag, int j1)
    {
        Intent intent = a(i1, 140);
        intent.putExtra("notification_row_id", l1);
        intent.putExtra("mms_auto_retrieve", flag);
        intent.putExtra("error", j1);
        c(intent, jhb.d());
    }

    public static void a(int i1, ani ani1, dgu dgu1)
    {
        t.post(new dfm(i1, ani1, dgu1));
    }

    public static void a(int i1, cvn cvn1)
    {
        Intent intent = a(i1, 39);
        long l1 = -1L;
        byte abyte0[] = cvn1.f();
        int j1 = abyte0.length;
        long l2 = g.a(g.nS, "babel_maximum_request_writer_intent_extra_size", 0L);
        if ((long)j1 > l2)
        {
            l1 = dki.a(g.nS).a(cvn1);
            intent.putExtra("server_response_id", l1);
        } else
        {
            intent.putExtra("server_response", abyte0);
        }
        intent.putExtra("server_response_type", cvn1.getClass().getName());
        intent.putExtra("rid", cvn1.b());
        if (a)
        {
            cvn1 = String.valueOf(cvn1);
            ebw.b("Babel", (new StringBuilder(String.valueOf(cvn1).length() + 104)).append("handleServerResponse: ").append(cvn1).append(" size(").append(j1).append(") stored response id: ").append(l1).append(" accountId: ").append(i1).toString());
        }
        b(intent, jhb.d());
    }

    public static void a(int i1, String s1, String s2)
    {
        s1 = a(i1, 101, s1);
        s1.putExtra("conversation_name", s2);
        b(s1, jhb.d());
    }

    public static void a(int i1, String s1, byte abyte0[], long l1, boolean flag)
    {
        Intent intent = a(i1, 116);
        intent.putExtra("mms_content_location", s1);
        intent.putExtra("mms_transaction_id", abyte0);
        intent.putExtra("notification_row_id", l1);
        intent.putExtra("mms_auto_retrieve", flag);
        c(intent, jhb.d());
    }

    public static void a(int i1, boolean flag, String s1)
    {
        Intent intent = a(i1, 201);
        intent.putExtra("phone_number", s1);
        intent.putExtra("callerid_set_unset", flag);
        b(intent, jhb.d());
    }

    public static void a(int i1, boolean flag, boolean flag1, int j1, boolean flag2)
    {
        a(i1, flag, flag1, j1, flag2, -1L);
    }

    public static void a(int i1, boolean flag, boolean flag1, int j1, boolean flag2, long l1)
    {
        obj = dhl.b(i1);
        if (!((dhl) (obj)).l()) goto _L2; else goto _L1
_L1:
        Object obj1;
        boolean flag3 = false;
        if (flag1)
        {
            flag3 = ((dhl) (obj)).m();
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
        k1 = eba.a(i1, 1, 109, null);
        obj1 = PendingIntent.getBroadcast(g.nS, k1, ((Intent) (obj1)), 0x10000000);
        l1 = SystemClock.elapsedRealtime();
        synchronized (x)
        {
            l2 = g.a((Long)x.get(i1), 0L);
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
        l3 = ((dhl) (obj)).c(j1);
        l1 = l3 - l1;
        if (l1 <= 5000L)
        {
            ScheduledFuture scheduledfuture = (ScheduledFuture)w.get(i1);
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
        w.put(i1, v.schedule(new dgd(((PendingIntent) (obj1)), i1), l1, TimeUnit.MILLISECONDS));
        return;
        ((AlarmManager)g.nS.getSystemService("alarm")).set(2, l3, ((PendingIntent) (obj1)));
        synchronized (x)
        {
            x.put(i1, Long.valueOf(l3));
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
        ((AlarmManager)g.nS.getSystemService("alarm")).setInexactRepeating(2, l1, l2, r());
    }

    private void a(Intent intent, dgu dgu1, Object obj)
    {
        t.post(new dgh(this, intent, dgu1, obj));
        gbk.a(new dgi(this, intent, dgu1, obj));
    }

    public static void a(Uri uri, long l1, boolean flag)
    {
        if (!dbf.j())
        {
            return;
        } else
        {
            Intent intent = a(dbf.l().h(), 112);
            intent.putExtra("uri", uri);
            intent.putExtra("thread_id", -1L);
            intent.putExtra("notification_row_id", l1);
            intent.putExtra("mms_auto_retrieve", flag);
            c(intent, jhb.d());
            return;
        }
    }

    public static void a(ani ani1)
    {
        dbf.h(ani1).a(new ddl(true), dhi.b().a());
    }

    private void a(ani ani1, cvn cvn1, dfb dfb1, List list)
    {
        if (ebw.a("Babel", 3))
        {
            String s1 = String.valueOf(cvn1.getClass().getSimpleName());
            String s2 = ani1.a();
            ebw.c("Babel", (new StringBuilder(String.valueOf(s1).length() + 26 + String.valueOf(s2).length())).append("processResponse ").append(s1).append(" for acct ").append(s2).toString());
        }
        if (cvn1 instanceof cxi)
        {
            cxi cxi1 = (cxi)cvn1;
            Object obj;
            if (cxi1.k() == 1)
            {
                obj = cxi1.m();
                Iterator iterator;
                if (!TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    dbf.a(ani1, ((String) (obj)));
                } else
                {
                    ebw.g("Babel", "Full jid should not be empty");
                }
            } else
            {
                obj = cxi1.l();
                if (TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    obj = String.valueOf(ebw.b(ani1.a()));
                    if (((String) (obj)).length() != 0)
                    {
                        obj = "Account unregistered: ".concat(((String) (obj)));
                    } else
                    {
                        obj = new String("Account unregistered: ");
                    }
                    ebw.e("Babel", ((String) (obj)));
                } else
                {
                    String s3 = String.valueOf(ebw.b(ani1.a()));
                    ebw.e("Babel", (new StringBuilder(String.valueOf(obj).length() + 44 + String.valueOf(s3).length())).append("Removed account ").append(((String) (obj))).append(" unregistered using account:").append(s3).toString());
                }
            }
            obj = ((gms)hgx.a(getBaseContext(), gms)).b(ani1.h());
            for (iterator = hgx.c(getBaseContext(), dha).iterator(); iterator.hasNext(); ((dha)iterator.next()).a(((gmw) (obj)), cxi1)) { }
            ((gmw) (obj)).d();
        }
        if (!(cvn1 instanceof cxx)) goto _L2; else goto _L1
_L1:
        dii dii1 = dii.a(ani1);
        if (!((cxx)cvn1).g) goto _L4; else goto _L3
_L3:
        ebw.f("Babel", "Client is invalid. Force retry GcmRegistration");
        dcx.c().h();
_L11:
        dii1.a(3);
_L2:
        if (cvn1 instanceof cyk)
        {
            cyk cyk1 = (cyk)cvn1;
            if (ani1 != null)
            {
                b(ani1.h(), cyk1);
            }
        }
        if (cvn1 instanceof cyj)
        {
            cyj cyj1 = (cyj)cvn1;
            if (ani1 != null)
            {
                b(ani1.h(), cyj1);
            }
        }
        Object obj1;
        if (cvn1 instanceof cwt)
        {
            Object obj2 = (cwt)cvn1;
            dir dir1 = dir.b(ani1.h());
            if (a)
            {
                obj1 = String.valueOf(ani1.a());
                if (((String) (obj1)).length() != 0)
                {
                    obj1 = "SyncBaselineSuggestedContactsOperation successful: ".concat(((String) (obj1)));
                } else
                {
                    obj1 = new String("SyncBaselineSuggestedContactsOperation successful: ");
                }
                e(((String) (obj1)));
            }
            dir1.a(3);
            anv.a(ani1, ((cwt) (obj2)).k(), true);
            anv.a(ani1, ((cwt) (obj2)).l(), false);
        }
        if (cvn1 instanceof cwi)
        {
            obj1 = (cwi)cvn1;
            obj2 = dgy.b(ani1.h());
            if (((cwi) (obj1)).n() && ((dgy) (obj2)).d() == 2)
            {
                if (a)
                {
                    obj1 = String.valueOf(ani1.a());
                    if (((String) (obj1)).length() != 0)
                    {
                        obj1 = "RefreshParticipantsOperationOperation successful: ".concat(((String) (obj1)));
                    } else
                    {
                        obj1 = new String("RefreshParticipantsOperationOperation successful: ");
                    }
                    e(((String) (obj1)));
                }
                ((dgy) (obj2)).a(3);
            }
        }
        if (cvn1 instanceof cya)
        {
            obj1 = (cya)cvn1;
            t.post(new dfw(this, ani1, ((cya) (obj1))));
        }
        if (!(cvn1 instanceof cwq)) goto _L6; else goto _L5
_L5:
        a(ani1, (cwq)cvn1);
_L8:
        return;
_L4:
        if (a)
        {
            obj1 = String.valueOf(ani1.a());
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
        if (cvn1 instanceof cwn)
        {
            cwn cwn1 = (cwn)cvn1;
            a(cwn1.k(), cwn1.l());
            if (cwn1.l() == null || cwn1.l().size() == 0)
            {
                aoe aoe1 = new aoe(this, ani1.h());
                aoe1.a(0, aoe1.P(cwn1.k()), cwn1.k());
            }
        }
        if (cvn1 instanceof cwl)
        {
            cwl cwl1 = (cwl)cvn1;
            long l1;
            long l2;
            if (TextUtils.isEmpty(cwl1.k()))
            {
                gbh.a("hangoutId is empty");
            } else
            {
                dfb1.a(new cti(cwl1.k(), cwl1.l()));
            }
        }
        if (!(cvn1 instanceof cvr) && !(cvn1 instanceof cxt))
        {
            list.add(new dgu(cvn1.b(), 1, cvn1));
        }
        if (cvn1 instanceof cvs)
        {
            list = (cvs)cvn1;
            t.post(new dfz(this, list));
        }
        if (cvn1 instanceof cwp)
        {
            list = (cwp)cvn1;
            t.post(new dfx(this, list));
        }
        if (cvn1 instanceof cwa)
        {
            list = (cwa)cvn1;
            t.post(new dfy(this, list));
        }
        if (cvn1 instanceof cwk)
        {
            list = (cwk)cvn1;
            t.post(new dgb(this, list));
        }
        l1 = 0L;
        if (a)
        {
            l1 = SystemClock.elapsedRealtime();
        }
        dfb1.a(ani1);
        if (ank.g(this, ani1.h()))
        {
            list = null;
        } else
        {
            list = new aoe(this, ani1.h());
        }
        any.a(list, cvn1, dfb1);
        dfb1.e();
        if (a)
        {
            l2 = SystemClock.elapsedRealtime();
            if (l2 - l1 > 1000L)
            {
                dfb1 = String.valueOf(cvn1.getClass().getSimpleName());
                e((new StringBuilder(String.valueOf(dfb1).length() + 44)).append("processResponse ").append(dfb1).append(" took ").append(l2 - l1).append("ms").toString());
            }
        }
        if (!(cvn1 instanceof cxt) || list == null) goto _L8; else goto _L7
_L7:
        cvn1 = (cxt)cvn1;
        if (cvn1.r().length <= 0 || !cvn1.s()) goto _L8; else goto _L9
_L9:
        if (cvn1.o() != null && cvn1.o().length > 0 && cvn1.o()[0] != null && list.aj(cvn1.o()[0]) != null)
        {
            ebw.c("Babel", "sticker photo no upload");
            return;
        }
        ebw.c("Babel", "initiate full res upload");
        cvn1 = list.e(cvn1.k(), cvn1.m());
        if (cvn1 == null || ((aos) (cvn1)).j == null)
        {
            ebw.g("Babel", "empty image url, can't upload");
            return;
        }
        dfb1 = g.nS.getContentResolver().openFileDescriptor(Uri.parse(((aos) (cvn1)).j), "r");
        dfb1.getStatSize();
        dfb1.close();
        cvn1 = new deh(ani1.h(), ((aos) (cvn1)).m, ((aos) (cvn1)).n, "image/jpeg", ((aos) (cvn1)).j);
        dbf.h(ani1).a(h.a(new deh[] {
            cvn1
        }), dhi.b().a(), y);
        return;
        ani1;
        ebw.e("Babel", "error finding image", ani1);
        return;
        ani1;
        ebw.e("Babel", "error closing image", ani1);
        return;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public static void a(ani ani1, cyz cyz1)
    {
        t.post(new dfg(ani1, cyz1));
    }

    private void a(ani ani1, dbn dbn1, cyq cyq1, long l1, long l2, 
            long l3, jhb jhb1)
    {
        if (ebw.a("Babel", 3))
        {
            String s1 = null;
            if (cyq1 instanceof cys)
            {
                s1 = ((cys)cyq1).c;
            }
            String s2 = String.valueOf(cyq1.getClass().getSimpleName());
            String s3 = String.valueOf(ani1.b());
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
            ebw.c("Babel", (new StringBuilder(String.valueOf(s2).length() + 32 + String.valueOf(s3).length() + String.valueOf(s1).length())).append("processServerUpdate: ").append(s2).append(", account: ").append(s3).append(s1).toString());
        }
        if (!(cyq1 instanceof cyr)) goto _L2; else goto _L1
_L1:
        if (((cyr)cyq1).a != 1)
        {
            if (a)
            {
                dbn1 = String.valueOf(ani1.a());
                if (dbn1.length() != 0)
                {
                    dbn1 = "Clearing active client time stamp for account: ".concat(dbn1);
                } else
                {
                    dbn1 = new String("Clearing active client time stamp for account: ");
                }
                e(dbn1);
            }
            dii.a(ani1).h();
        }
_L4:
        return;
_L2:
        if (!(cyq1 instanceof czh))
        {
            break; /* Loop/switch isn't completed */
        }
        dbn1 = (czh)cyq1;
        if (((czh) (dbn1)).b == 1)
        {
            (new aoe(this, ani1.h())).s(((czh) (dbn1)).a);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!(cyq1 instanceof czj))
        {
            break; /* Loop/switch isn't completed */
        }
        dbn1 = (czj)cyq1;
        if (((czj) (dbn1)).b)
        {
            l1 = ((czj) (dbn1)).a;
            if (ani1 != null)
            {
                ((doq)hgx.a(getApplicationContext(), doq)).a(ani1.h(), l1);
            }
            b(ani1, l1);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (cyq1 instanceof czm)
        {
            dbn1 = (czm)cyq1;
            new dfb();
            ani1 = new aoe(this, ani1.h());
            (new dbe(dbn1)).b(ani1);
            return;
        }
        if (cyq1 instanceof cyt)
        {
            dbn1 = (cyt)cyq1;
            new dfb();
            ani1 = new aoe(this, ani1.h());
            (new dbw(dbn1)).a(ani1);
            return;
        }
        if (!(cyq1 instanceof cyv))
        {
            break; /* Loop/switch isn't completed */
        }
        cyq1 = ((cyv)cyq1).c;
        dbn1 = String.valueOf(cyq1);
        if (dbn1.length() != 0)
        {
            dbn1 = "ContactsNotification.selfFanoutId == ".concat(dbn1);
        } else
        {
            dbn1 = new String("ContactsNotification.selfFanoutId == ");
        }
        e(dbn1);
        if (!ctr.c(cyq1))
        {
            a(ani1.h(), true);
            return;
        }
        if (true) goto _L4; else goto _L6
_L6:
        if (cyq1 instanceof cyy)
        {
            dbn1 = (cyy)cyq1;
            new dfb();
            ani1 = new aoe(this, ani1.h());
            (new dco(dbn1)).a(ani1);
            return;
        }
        if (cyq1 instanceof czf)
        {
            dbn1 = (czf)cyq1;
            new dfb();
            ani1 = new aoe(this, ani1.h());
            (new diy(dbn1)).a(ani1);
            return;
        }
        if (cyq1 instanceof czi)
        {
            dbn1 = (czi)cyq1;
            cyq1 = ((gms)hgx.a(g.nS, gms)).b(ani1.h());
            a(((gmw) (cyq1)), ((czi) (dbn1)).a);
            cyq1.d();
            f(ani1);
            return;
        }
        if (cyq1 instanceof cyz)
        {
            a(ani1, (cyz)cyq1);
            return;
        }
        Context context = getApplicationContext();
        Object obj = new dfb();
        int i1 = ani1.h();
        ((dfb) (obj)).a(ani1);
        ((dfb) (obj)).b();
        any.a(new aoe(g.nS, i1), cyq1, ((dfb) (obj)), l1, l2, l3);
        ((dfb) (obj)).e();
        Object obj1 = ((dfb) (obj)).c();
        if (!((List) (obj1)).isEmpty())
        {
            if (ebw.a("Babel", 3))
            {
                int j1 = ((List) (obj1)).size();
                String s4 = String.valueOf(cyq1.getClass().getSimpleName());
                ebw.c("Babel", (new StringBuilder(String.valueOf(s4).length() + 66)).append("processServerUpdate: sending ").append(j1).append(" requests from processing ").append(s4).toString());
            }
            if (dbn1 != null)
            {
                dbn1.a(((java.util.Collection) (obj1)), 0);
            }
        }
        obj1 = ((dfb) (obj)).g();
        if (ebw.a("Babel", 3))
        {
            dbn1 = String.valueOf(((dfd) (obj1)).toString());
            cza cza1;
            if (dbn1.length() != 0)
            {
                dbn1 = "update should trigger notification? ".concat(dbn1);
            } else
            {
                dbn1 = new String("update should trigger notification? ");
            }
            ebw.c("Babel", dbn1);
        }
        if (cyq1 instanceof cza)
        {
            cza1 = (cza)cyq1;
            dbn1 = cza1.c;
            obj = cza1.m;
            l1 = cza1.e;
        } else
        {
            obj = "";
            l1 = 0L;
            dbn1 = "";
        }
        l2 = SystemClock.elapsedRealtime();
        if (obj1 == dfd.b)
        {
            h.a(i1, l2, 10, (new byy()).a(453).c(((String) (obj))).a(dbn1));
            ebw.a("Babel", "Scheduling future notification after late push");
            cyq1 = (AlarmManager)g.nS.getSystemService("alarm");
            jhb1 = new Intent("com.google.android.apps.hangouts.DEFERRED_NOTIFICATION");
            jhb1.putExtra("op", 139);
            jhb1.putExtra("account_id", ani1.h());
            jhb1.putExtra("message_id", ((String) (obj)));
            jhb1.putExtra("conversation_id", dbn1);
            i1 = eba.a(ani1.h(), 1, 110, null);
            ani1 = PendingIntent.getBroadcast(g.nS, i1, jhb1, 0x10000000);
            cyq1.set(2, SystemClock.elapsedRealtime() + g.a(g.nS, "babel_latenotifdly", 3000L), ani1);
            return;
        }
        if (obj1 == dfd.e)
        {
            h.a(i1, l2, 10, (new byy()).a(403).c(((String) (obj))).a(dbn1));
        }
        cej.a(g.nS, i1, ((dfd) (obj1)), true, jhb1);
        if (obj1 == dfd.d && dbq.q(i1))
        {
            if (a)
            {
                ebw.b("Babel", "Scheduling future re-notification for non-active client.");
            }
            jhb1 = (AlarmManager)context.getSystemService("alarm");
            Intent intent = new Intent("com.google.android.apps.hangouts.RE_NOTIFICATION");
            intent.putExtra("op", 202);
            intent.putExtra("account_id", i1);
            intent.putExtra("conversation_id", dbn1);
            intent.putExtra("message_id", ((String) (obj)));
            intent.putExtra("message_timestamp", l1);
            int k1 = eba.a(i1, 1, 16, dbn1);
            dbn1 = PendingIntent.getBroadcast(g.nS, k1, intent, 0x10000000);
            jhb1.set(2, SystemClock.elapsedRealtime() + g.a(g.nS, "babel_renotification_delay_ms", djk.o), dbn1);
        }
        if ((cyq1 instanceof crm) && ani1.H() && !((crm)cyq1).d.equals(ani1.b()))
        {
            cej.b(context, i1);
            return;
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    public static void a(ani ani1, dbo dbo1)
    {
        if (dbo1 != null)
        {
            dbo1 = dbo1.b();
        } else
        {
            dbo1 = null;
        }
        while (dbo1 == null || d != null && ((dzf) (dbo1)).a != null && d.a(ani1, dbo1) || !g.a(true, false)) 
        {
            return;
        }
        gbk.a(new dfl(ani1));
    }

    public static void a(ani ani1, dko dko, dbo dbo1)
    {
        t.post(new dfj(dko, ani1, dbo1));
        gbk.a(new dfk(dko, ani1, dbo1));
    }

    public static void a(ani ani1, String s1)
    {
        b(a(ani1.h(), 76, s1), jhb.d());
    }

    public static void a(ani ani1, String s1, int i1, int j1)
    {
        if (i1 >= j1)
        {
            return;
        }
        if (a)
        {
            ebw.b("Babel_Stress", (new StringBuilder(37)).append("Scheduling stress message:").append(i1).toString());
        }
        AlarmManager alarmmanager = (AlarmManager)g.nS.getSystemService("alarm");
        Intent intent = new Intent("com.google.android.apps.hangouts.MESSAGE_STRESS_TEST");
        intent.putExtra("op", 152);
        intent.putExtra("account_id", ani1.h());
        intent.putExtra("conversation_id", s1);
        intent.putExtra("stress_current_message_id", i1);
        intent.putExtra("stress_max_message_id", j1);
        ani1 = PendingIntent.getBroadcast(g.nS, eba.a(112), intent, 0x10000000);
        i1 = g.a(g.nS, "babel_stress_message_delay", 10);
        i1 = (new Random()).nextInt(i1 * 1000);
        alarmmanager.set(2, SystemClock.elapsedRealtime() + (long)i1, ani1);
    }

    public static void a(ani ani1, String s1, cey cey1, String s2, long l1, boolean flag)
    {
        t.post(new dfs(ani1, s1, cey1, s2, l1, flag));
    }

    public static void a(ani ani1, String s1, dqc dqc1)
    {
        ani1 = a(ani1.h(), 191);
        ani1.putExtra("conversation_id", s1);
        ani1.putExtra("type", dqc1.ordinal());
        c(ani1, jhb.d());
    }

    public static void a(ani ani1, String s1, String s2, boolean flag)
    {
        ani1 = a(ani1.h(), 86);
        ani1.putExtra("phone_number", s1);
        ani1.putExtra("verification_code", s2);
        ani1.putExtra("is_discoverable", flag);
        b(ani1, jhb.d());
    }

    public static void a(ani ani1, String s1, jdh jdh1)
    {
        String s2 = jdh1.d;
        Intent intent = a(ani1.h(), 78);
        intent.putExtra("hangout_id", s2);
        ani1 = String.valueOf(s2);
        if (ani1.length() != 0)
        {
            ani1 = "Stashing logdata for session ".concat(ani1);
        } else
        {
            ani1 = new String("Stashing logdata for session ");
        }
        ebw.c("Babel", ani1);
        m.put(s2, Pair.create(s1, jdh1));
        c(intent, jhb.d());
        g.b(2013);
    }

    public static void a(ani ani1, Set set)
    {
        if (a)
        {
            String s1 = String.valueOf(set);
            String s2 = ani1.a();
            ebw.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 32 + String.valueOf(s2).length())).append("setFocusedConversation ").append(s1).append(" account:").append(s2).toString());
        }
        synchronized (f)
        {
            g = ani1.a();
            h = new HashSet(set);
        }
        return;
        ani1;
        obj;
        JVM INSTR monitorexit ;
        throw ani1;
    }

    public static void a(ani ani1, boolean flag)
    {
        ani1 = a(ani1.h(), 13);
        ani1.putExtra("retry_request", flag);
        b(ani1, jhb.d());
    }

    public static void a(ani ani1, long al[])
    {
        ani1 = a(ani1.h(), 80);
        ani1.putExtra("message_row_ids", al);
        c(ani1, jhb.d());
    }

    public static void a(ani ani1, Long along[], String s1)
    {
        int j1 = along.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            Long long1 = along[i1];
            Intent intent = a(ani1.h(), 44, s1);
            intent.putExtra("message_row_id", g.a(long1, 0L));
            intent.putExtra("timestamp", SystemClock.elapsedRealtime() * 1000L);
            c(intent, jhb.d());
        }

        i(ani1, s1);
    }

    public static void a(ani ani1, String as[])
    {
        ani1 = a(ani1.h(), 187);
        ani1.putExtra("recent_call_row_ids", as);
        c(ani1, jhb.d());
    }

    public static void a(aoe aoe1, String s1, String as[])
    {
        Object obj;
        StringBuilder stringbuilder;
        aoh aoh1;
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
        aoe1.a();
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
        aoe1.a(s1, ((String) (obj)), dqb.e, 0);
        stringbuilder.append("-");
        stringbuilder.append(((String) (obj)));
        j1++;
        if (true) goto _L4; else goto _L3
_L2:
        aoe1.l(s1, 0xffffffff80000000L);
_L3:
        aoh1 = aoe1.f(s1);
        aoe1.b();
        aoe1.c();
        any.d(aoe1);
        if (aoh1 == null)
        {
            return;
        }
        break MISSING_BLOCK_LABEL_119;
        s1;
        aoe1.c();
        throw s1;
        obj = aoh1.d;
        as = ((String []) (obj));
        if (obj == null)
        {
            as = aoh1.o;
        }
        context = g.nS;
        obj = new cf(context);
        ((cf) (obj)).a(true);
        if (i1 != 0)
        {
            i1 = l.aN;
        } else
        {
            i1 = l.aM;
        }
        ((cf) (obj)).a(context.getResources().getString(i1));
        ((cf) (obj)).b(as);
        ((cf) (obj)).a(System.currentTimeMillis());
        ((cf) (obj)).a(com.google.android.apps.hangouts.R.drawable.cj);
        aoe1 = g.a(aoe1.f().h(), s1, aoh1.b);
        aoe1.addFlags(0x4000000);
        ((cf) (obj)).a(PendingIntent.getActivity(context, 0, aoe1, 0x10000000));
        aoe1 = (NotificationManager)context.getSystemService("notification");
        as = String.valueOf(stringbuilder.toString());
        aoe1.notify((new StringBuilder(String.valueOf(s1).length() + 17 + String.valueOf(as).length())).append("failed_to_delete:").append(s1).append(as).toString(), 11, ((cf) (obj)).g());
        return;
    }

    public static void a(czn czn)
    {
        t.post(new dft(czn));
    }

    private void a(dbn dbn1, Intent intent, dep dep1, ani ani1)
    {
        if (dep1.f())
        {
            if (a)
            {
                String s1 = String.valueOf(dep1.getClass().getSimpleName());
                ani1 = ani1.a();
                e((new StringBuilder(String.valueOf(s1).length() + 23 + String.valueOf(ani1).length())).append(s1).append(" is executed directly: ").append(ani1).toString());
            }
            l.remove(dep1);
            dep1.a(2);
            a(dbn1, intent, ((dfa) (dep1)));
        } else
        {
            if (dep1.e())
            {
                if (a)
                {
                    dbn1 = String.valueOf(dep1.getClass().getSimpleName());
                    intent = ani1.a();
                    e((new StringBuilder(String.valueOf(dbn1).length() + 12 + String.valueOf(intent).length())).append(dbn1).append(" is queued: ").append(intent).toString());
                }
                l.add(dep1);
                dep1.a(1);
                return;
            }
            if (a)
            {
                dbn1 = String.valueOf(dep1.getClass().getSimpleName());
                intent = ani1.a();
                e((new StringBuilder(String.valueOf(dbn1).length() + 13 + String.valueOf(intent).length())).append(dbn1).append(" is ignored: ").append(intent).toString());
                return;
            }
        }
    }

    public static void a(dgn dgn1)
    {
        d = dgn1;
    }

    public static void a(dgo dgo1)
    {
        e = dgo1;
    }

    public static void a(dgp dgp1)
    {
        if (!n.contains(dgp1))
        {
            n.add(dgp1);
        }
    }

    public static void a(dhi dhi1, Intent intent)
    {
        a(dhi1, intent, jhb.d());
    }

    private static void a(dhi dhi1, Intent intent, jhb jhb1)
    {
        intent.putExtra("rid", dhi1.a());
        b(intent, jhb1);
        if (a)
        {
            dhi1 = String.valueOf(dhi1);
            intent = g(intent.getIntExtra("op", 0));
            e((new StringBuilder(String.valueOf(dhi1).length() + 30 + String.valueOf(intent).length())).append("start command request ").append(dhi1).append(" opCode ").append(intent).toString());
        }
    }

    public static void a(gmw gmw1, List list)
    {
        Iterator iterator = list.iterator();
_L8:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        int i1;
        boolean flag;
        list = (ebj)iterator.next();
        i1 = g.a((Integer)((ebj) (list)).a, 0);
        flag = g.a((Boolean)((ebj) (list)).b, false);
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
        gmw1.b(list, flag);
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
            synchronized (u)
            {
                if (r != null)
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
        if (i1 >= r.a())
        {
            break; /* Loop/switch isn't completed */
        }
        dgl dgl1 = (dgl)r.a(i1);
        printwriter.println(String.format(Locale.getDefault(), "%s %5d %5d %5d %s", new Object[] {
            simpledateformat.format(Long.valueOf(dgl1.b)), Long.valueOf((dgl1.d - dgl1.c) / 0xf4240L), Long.valueOf((dgl1.e - dgl1.d) / 0xf4240L), Long.valueOf((dgl1.e - dgl1.c) / 0xf4240L), g(dgl1.a)
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

    public static void a(String s1, ani ani1)
    {
        t.post(new dfn(ani1, s1));
    }

    public static void a(String s1, ani ani1, long l1, long l2, jhb jhb1)
    {
        ani1 = a(ani1.h(), 53);
        ani1.putExtra("timestamp", l1);
        ani1.putExtra("gcm_handle_timestamps", l2);
        cyq.a(ani1, s1);
        c(ani1, jhb1);
    }

    public static void a(String s1, ani ani1, Runnable runnable)
    {
        t.post(new dfo(ani1, s1, runnable));
    }

    public static void a(String s1, cey cey1, boolean flag)
    {
        t.post(new dfq(s1, cey1, flag));
    }

    public static void a(String s1, String s2)
    {
        Intent intent = new Intent(g.nS, com/google/android/apps/hangouts/realtimechat/RealTimeChatService);
        intent.setAction(s1);
        intent.putExtra("op", 100);
        intent.putExtra("package", s2);
        b(intent, jhb.d());
    }

    public static void a(String s1, List list)
    {
        t.post(new dfr(s1, list));
    }

    private static void a(ArrayList arraylist)
    {
        int ai[] = dbf.c(false);
        if (ai.length == 0)
        {
            ebw.c("Babel", "All accounts removed");
        } else
        {
            int i1 = ai[0];
            ani ani1 = dbf.e(i1);
            if (ani1 != null && !dbf.g(ani1) && !ani1.q())
            {
                if (ebw.a("Babel", 3))
                {
                    ebw.c("Babel", (new StringBuilder(56)).append("Use account ").append(i1).append(" to unregistered removed accounts").toString());
                }
                for (Iterator iterator = arraylist.iterator(); iterator.hasNext();)
                {
                    String s1 = (String)iterator.next();
                    ani ani2 = dbf.a(cey.a(s1));
                    if (ani2 != null)
                    {
                        arraylist = String.valueOf(ebw.b(ani2.a()));
                        ebw.g("Babel", (new StringBuilder(String.valueOf(arraylist).length() + 62 + String.valueOf(s1).length())).append("Removing a valid account by mistake:accountName=").append(arraylist).append(", accountGaia=").append(s1).toString());
                        return;
                    }
                }

                Intent intent = a(i1, 104);
                intent.putStringArrayListExtra("account_gaiaids", arraylist);
                b(intent, jhb.d());
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
        int ai[] = dbf.c(true);
        int j1 = ai.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            int k1 = ai[i1];
            if (dbf.e(k1) != null)
            {
                a(k1, false, false, 0, flag);
            }
        }

    }

    public static void a(byte abyte0[])
    {
        if (!dbf.j())
        {
            return;
        } else
        {
            Intent intent = a(dbf.l().h(), 115);
            intent.putExtra("mms_wap_push_data", abyte0);
            c(intent, jhb.d());
            return;
        }
    }

    public static int b(ani ani1, String s1, int i1)
    {
        ani1 = a(ani1.h(), 62, s1);
        ani1.putExtra("otr_status", i1);
        return c(ani1, jhb.d());
    }

    public static int b(ani ani1, String s1, long l1)
    {
        ani1 = a(ani1.h(), 35, s1);
        if (l1 > 0L)
        {
            ani1.putExtra("watermark", l1);
        }
        return c(ani1, jhb.d());
    }

    public static int b(ani ani1, String s1, String s2)
    {
        return c(b(ani1.h(), 184).putExtra("hangout_id", s2).putExtra("broadcast_id", s1), jhb.d());
    }

    private static Intent b(int i1, int j1)
    {
        return (new Intent(g.nS, com/google/android/apps/hangouts/realtimechat/RealTimeChatService)).putExtra("account_id", i1).putExtra("op", j1);
    }

    public static cvn b(Intent intent)
    {
        Bundle bundle = intent.getExtras();
        if (bundle.containsKey("server_response_id"))
        {
            intent = g.nS;
            long l1 = bundle.getLong("server_response_id");
            return dki.a(intent).c(l1);
        }
        if (bundle.containsKey("server_response"))
        {
            return dkl.b(intent.getByteArrayExtra("server_response"));
        } else
        {
            return null;
        }
    }

    public static void b()
    {
        if (a)
        {
            String s1 = String.valueOf(h);
            String s2 = g;
            ebw.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 39 + String.valueOf(s2).length())).append("unsetFocusedConversation from ").append(s1).append(" account:").append(s2).toString());
        }
        synchronized (f)
        {
            g = null;
            h = null;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void b(int i1)
    {
        b(a(i1, 16), jhb.d());
    }

    public static void b(int i1, long l1)
    {
        Object obj = dbf.l();
        if (obj == null)
        {
            return;
        } else
        {
            obj = a(((ani) (obj)).h(), 133);
            ((Intent) (obj)).putExtra("free_sms_storage_action_index", i1);
            ((Intent) (obj)).putExtra("free_sms_storage_duration", l1);
            c(((Intent) (obj)), jhb.d());
            return;
        }
    }

    private static void b(int i1, cvn cvn1)
    {
        long l1 = cvn1.d();
        long l2 = cvn1.e();
        if (dbq.j(i1) && l1 != -1L && l2 != -1L)
        {
            (new daz(g.nS)).a(i1, l1, l2);
        }
    }

    public static void b(int i1, String s1)
    {
        b(a(i1, 103, s1), jhb.d());
    }

    public static void b(int i1, String s1, String s2)
    {
        s1 = a(i1, 147, s1);
        s1.putExtra("message_text", s2);
        b(((Intent) (s1)), jhb.d());
    }

    public static void b(long l1, long l2)
    {
        AlarmManager alarmmanager = (AlarmManager)g.nS.getSystemService("alarm");
        Intent intent = new Intent("com.google.android.apps.hangouts.RENEW_ACCOUNT_REGISTRATION");
        intent.putExtra("op", 141);
        alarmmanager.setInexactRepeating(2, l1, l2, PendingIntent.getBroadcast(g.nS, eba.a(111), intent, 0x10000000));
    }

    private static void b(Intent intent, jhb jhb1)
    {
        intent.putExtra("rqtms", SystemClock.elapsedRealtime());
        if (a || s)
        {
            intent.putExtra("rqtns", System.nanoTime());
        }
        Context context = g.nS;
        synchronized (p)
        {
            if (q == null)
            {
                if (a)
                {
                    e("initializing wakelock");
                }
                q = ((PowerManager)context.getSystemService("power")).newWakeLock(1, "hangouts_rtcs");
            }
        }
        if (a)
        {
            obj = String.valueOf(g(intent.getIntExtra("op", 0)));
            if (((String) (obj)).length() != 0)
            {
                obj = "acquiring wakelock for opcode ".concat(((String) (obj)));
            } else
            {
                obj = new String("acquiring wakelock for opcode ");
            }
            e(((String) (obj)));
        }
        q.acquire();
        intent.setClass(context, com/google/android/apps/hangouts/realtimechat/RealTimeChatService);
        intent.putExtra("pid", c);
        intent.putExtra("stack_trace", ebw.a(new Throwable()));
        if (((djm)hgx.a(context, djm)).a(context, intent, jhb1) == null)
        {
            jhb1 = String.valueOf(intent);
            ebw.g("Babel", (new StringBuilder(String.valueOf(jhb1).length() + 40)).append("RTCS failed to start service for intent ").append(jhb1).toString());
            g.a(dbf.e(intent.getIntExtra("account_id", -1)), 2307);
            q.release();
        }
        return;
        intent;
        obj;
        JVM INSTR monitorexit ;
        throw intent;
    }

    public static void b(ani ani1)
    {
        b(a(ani1.h(), 14), jhb.d());
    }

    public static void b(ani ani1, long l1)
    {
        t.post(new dff(ani1, l1));
    }

    public static void b(ani ani1, String s1)
    {
        ani1 = a(ani1.h(), 69);
        ani1.putExtra("member_gaiaid", s1);
        b(((Intent) (ani1)), jhb.d());
    }

    public static void b(ani ani1, String as[])
    {
        ani1 = a(ani1.h(), 171);
        ani1.putExtra("conversationids", as);
        c(ani1, jhb.d());
    }

    public static void b(dgp dgp1)
    {
        n.remove(dgp1);
    }

    public static void b(String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(s1);
        a(arraylist);
    }

    public static void b(String s1, String s2)
    {
        t.post(new dgc(s1, s2));
    }

    public static int c(int i1, String s1)
    {
        Intent intent = a(i1, 151);
        intent.putExtra("phone_number", s1);
        return c(intent, jhb.d());
    }

    public static int c(int i1, String s1, String s2)
    {
        gbh.a(s1, ebz.g(s1));
        gbh.a(s2, ebz.g(s2));
        Intent intent = a(i1, 196);
        intent.putExtra("phone_number", s1);
        intent.putExtra("from_phone_number", s2);
        return c(intent, jhb.d());
    }

    private static int c(Intent intent, jhb jhb1)
    {
        dhi dhi1 = dhi.b();
        a(dhi1, intent, jhb1);
        return dhi1.a();
    }

    public static int c(ani ani1, String s1, long l1)
    {
        ani1 = a(ani1.h(), 82, s1);
        ani1.putExtra("scroll_timestamp", System.currentTimeMillis());
        ani1.putExtra("scroll_to_item_timestamp", l1);
        return c(((Intent) (ani1)), jhb.d());
    }

    public static int c(ani ani1, String s1, String s2)
    {
        ani1 = a(ani1.h(), 36);
        ani1.putExtra("conversation_id", s1);
        ani1.putExtra("message_id", s2);
        return c(((Intent) (ani1)), jhb.d());
    }

    public static void c()
    {
        int i1 = 0;
        if (a)
        {
            e("requestPatchAfterRequestWriterUpgradeForAllAccounts");
        }
        int ai[] = dbf.c(false);
        for (int j1 = ai.length; i1 < j1; i1++)
        {
            int k1 = ai[i1];
            if (a)
            {
                e((new StringBuilder(49)).append("requestPatchAfterRequestWriterUpgrade ").append(k1).toString());
            }
            c(a(k1, 114), jhb.d());
        }

    }

    public static void c(int i1)
    {
        c(a(i1, 188), jhb.d());
    }

    public static void c(Intent intent)
    {
        if (!dbf.j())
        {
            return;
        } else
        {
            ani ani1 = dbf.l();
            intent.setClass(g.nS, com/google/android/apps/hangouts/realtimechat/RealTimeChatService);
            intent.putExtra("op", 109);
            intent.putExtra("account_id", ani1.h());
            c(intent, jhb.d());
            return;
        }
    }

    public static void c(ani ani1)
    {
        dii dii1 = dii.a(ani1);
        if (dii1 == null)
        {
            if (a)
            {
                e("Do not renew active client for sms only account");
            }
        } else
        if (!dii1.e() && !dii1.f())
        {
            if (a)
            {
                ani1 = String.valueOf(ani1.a());
                if (ani1.length() != 0)
                {
                    ani1 = "SetActiveClientOperation is idle: ".concat(ani1);
                } else
                {
                    ani1 = new String("SetActiveClientOperation is idle: ");
                }
                e(ani1);
                return;
            }
        } else
        {
            b(a(ani1.h(), 60), jhb.d());
            return;
        }
    }

    public static void c(ani ani1, long l1)
    {
        ani1 = a(ani1.h(), 169);
        ani1.putExtra("extra_duration", l1);
        c(((Intent) (ani1)), jhb.d());
    }

    public static void c(ani ani1, String s1)
    {
        ani1 = a(ani1.h(), 85);
        ani1.putExtra("phone_number", s1);
        b(ani1, jhb.d());
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
            ebw.g("Babel", s1);
            return;
        } else
        {
            s1 = a(dbf.a(as[2], null).h(), 113, as[3]);
            s1.putExtra("message_row_id", Long.valueOf(as[1]));
            c(((Intent) (s1)), jhb.d());
            return;
        }
    }

    public static int d(ani ani1)
    {
        return c(a(ani1.h(), 96), jhb.d());
    }

    public static int d(ani ani1, String s1, long l1)
    {
        ani1 = a(ani1.h(), 149, s1);
        ani1.putExtra("timestamp", l1);
        return c(ani1, jhb.d());
    }

    public static int d(ani ani1, String s1, String s2)
    {
        ani1 = a(ani1.h(), 58);
        ani1.putExtra("query", s1);
        ani1.putExtra("requester_id", s2);
        return c(ani1, jhb.d());
    }

    public static void d()
    {
        if (a)
        {
            e("cancelAllDBCleanupAlarms");
        }
        ((AlarmManager)g.nS.getSystemService("alarm")).cancel(r());
    }

    public static void d(int i1)
    {
        b(a(i1, 89), jhb.d());
    }

    public static void d(Intent intent)
    {
        ani ani1 = dbf.l();
        if (ani1 == null)
        {
            return;
        } else
        {
            intent.setClass(g.nS, com/google/android/apps/hangouts/realtimechat/RealTimeChatService);
            intent.putExtra("op", 128);
            intent.putExtra("account_id", ani1.h());
            c(intent, jhb.d());
            return;
        }
    }

    private void d(Intent intent, jhb jhb1)
    {
        Object obj1;
        int i1;
        int j1;
        int j2;
        j1 = intent.getIntExtra("op", -1);
        j2 = intent.getIntExtra("account_id", -1);
        obj1 = dbf.e(j2);
        i1 = intent.getIntExtra("rid", -1);
        if (a)
        {
            String s1 = g(j1);
            ebw.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 63)).append("processIntent opCode ").append(s1).append(" account ").append(j2).append(" requestId ").append(i1).toString());
        }
        if (e != null)
        {
            e.a(intent);
        }
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        ebw.g("Babel", (new StringBuilder(48)).append("Skipping intent for invalid account: ").append(j2).toString());
        if (j1 == 78)
        {
            g.b(2379);
        }
_L129:
        return;
_L2:
        Object obj = dbf.h(((ani) (obj1)));
        j1;
        JVM INSTR lookupswitch 33: default 452
    //                   13: 1440
    //                   14: 1321
    //                   19: 1496
    //                   55: 1794
    //                   66: 2077
    //                   72: 2144
    //                   76: 2054
    //                   91: 2307
    //                   104: 1397
    //                   111: 2439
    //                   114: 2468
    //                   120: 2509
    //                   121: 2732
    //                   124: 2879
    //                   136: 2907
    //                   139: 1606
    //                   143: 2397
    //                   144: 2365
    //                   153: 2993
    //                   160: 3062
    //                   162: 3083
    //                   163: 3239
    //                   175: 2551
    //                   176: 2676
    //                   187: 3049
    //                   188: 3043
    //                   190: 3017
    //                   192: 2485
    //                   194: 3255
    //                   198: 3279
    //                   199: 2593
    //                   200: 2659
    //                   202: 1673;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36
_L3:
        j1;
        JVM INSTR tableswitch 30 203: default 1164
    //                   30 1165
    //                   31 3833
    //                   32 4894
    //                   33 4928
    //                   34 1164
    //                   35 4952
    //                   36 5135
    //                   37 5174
    //                   38 5220
    //                   39 3311
    //                   40 1164
    //                   41 5398
    //                   42 5471
    //                   43 1164
    //                   44 4487
    //                   45 1164
    //                   46 1164
    //                   47 4293
    //                   48 5786
    //                   49 5826
    //                   50 1164
    //                   51 5858
    //                   52 1164
    //                   53 3515
    //                   54 5495
    //                   55 1164
    //                   56 6094
    //                   57 1164
    //                   58 5914
    //                   59 5945
    //                   60 5758
    //                   61 1164
    //                   62 5617
    //                   63 1164
    //                   64 1164
    //                   65 5520
    //                   66 1164
    //                   67 1164
    //                   68 5111
    //                   69 6336
    //                   70 1164
    //                   71 3373
    //                   72 1164
    //                   73 6359
    //                   74 1164
    //                   75 1164
    //                   76 1164
    //                   77 1164
    //                   78 6407
    //                   79 6383
    //                   80 4773
    //                   81 5026
    //                   82 5064
    //                   83 4543
    //                   84 4398
    //                   85 3627
    //                   86 3770
    //                   87 1164
    //                   88 1164
    //                   89 6592
    //                   90 6609
    //                   91 1164
    //                   92 5653
    //                   93 1164
    //                   94 1164
    //                   95 1164
    //                   96 5720
    //                   97 5737
    //                   98 5984
    //                   99 6749
    //                   100 1164
    //                   101 6773
    //                   102 1164
    //                   103 6793
    //                   104 1164
    //                   105 1164
    //                   106 1164
    //                   107 1164
    //                   108 1164
    //                   109 6807
    //                   110 1164
    //                   111 1164
    //                   112 6876
    //                   113 4851
    //                   114 1164
    //                   115 6814
    //                   116 6827
    //                   117 3809
    //                   118 1164
    //                   119 1164
    //                   120 1164
    //                   121 1164
    //                   122 1164
    //                   123 1164
    //                   124 1164
    //                   125 1164
    //                   126 1164
    //                   127 1164
    //                   128 6891
    //                   129 1164
    //                   130 4229
    //                   131 6898
    //                   132 6902
    //                   133 6906
    //                   134 6066
    //                   135 6693
    //                   136 1164
    //                   137 6080
    //                   138 1164
    //                   139 1164
    //                   140 6928
    //                   141 1164
    //                   142 6960
    //                   143 1164
    //                   144 1164
    //                   145 6568
    //                   146 7000
    //                   147 7013
    //                   148 7059
    //                   149 1164
    //                   150 7076
    //                   151 7093
    //                   152 4102
    //                   153 1164
    //                   154 1164
    //                   155 1164
    //                   156 1164
    //                   157 7201
    //                   158 1164
    //                   159 1164
    //                   160 1164
    //                   161 1164
    //                   162 1164
    //                   163 1164
    //                   164 1164
    //                   165 1164
    //                   166 1164
    //                   167 5998
    //                   168 1164
    //                   169 7249
    //                   170 1164
    //                   171 6043
    //                   172 7267
    //                   173 1164
    //                   174 1164
    //                   175 1164
    //                   176 1164
    //                   177 5306
    //                   178 5352
    //                   179 6725
    //                   180 4984
    //                   181 3651
    //                   182 3675
    //                   183 3708
    //                   184 3739
    //                   185 1165
    //                   186 5772
    //                   187 1164
    //                   188 1164
    //                   189 6669
    //                   190 1164
    //                   191 4797
    //                   192 1164
    //                   193 5584
    //                   194 1164
    //                   195 7126
    //                   196 7218
    //                   197 7175
    //                   198 1164
    //                   199 1164
    //                   200 1164
    //                   201 7291
    //                   202 1164
    //                   203 5446;
           goto _L37 _L38 _L39 _L40 _L41 _L37 _L42 _L43 _L44 _L45 _L46 _L37 _L47 _L48 _L37 _L49 _L37 _L37 _L50 _L51 _L52 _L37 _L53 _L37 _L54 _L55 _L37 _L56 _L37 _L57 _L58 _L59 _L37 _L60 _L37 _L37 _L61 _L37 _L37 _L62 _L63 _L37 _L64 _L37 _L65 _L37 _L37 _L37 _L37 _L66 _L67 _L68 _L69 _L70 _L71 _L72 _L73 _L74 _L37 _L37 _L75 _L76 _L37 _L77 _L37 _L37 _L37 _L78 _L79 _L80 _L81 _L37 _L82 _L37 _L83 _L37 _L37 _L37 _L37 _L37 _L84 _L37 _L37 _L85 _L86 _L37 _L87 _L88 _L89 _L37 _L37 _L37 _L37 _L37 _L37 _L37 _L37 _L37 _L37 _L90 _L37 _L91 _L92 _L93 _L94 _L95 _L96 _L37 _L97 _L37 _L37 _L98 _L37 _L99 _L37 _L37 _L100 _L101 _L102 _L103 _L37 _L104 _L105 _L106 _L37 _L37 _L37 _L37 _L107 _L37 _L37 _L37 _L37 _L37 _L37 _L37 _L37 _L37 _L108 _L37 _L109 _L37 _L110 _L111 _L37 _L37 _L37 _L37 _L112 _L113 _L114 _L115 _L116 _L117 _L118 _L119 _L38 _L120 _L37 _L37 _L121 _L37 _L122 _L37 _L123 _L37 _L124 _L125 _L126 _L37 _L37 _L37 _L127 _L37 _L128
_L37:
        return;
_L38:
        try
        {
            jhb1 = (aik)intent.getSerializableExtra("audience");
            a(((dbn) (obj)), intent, new dcf(((ani) (obj1)), intent.getStringExtra("conversation_name"), jhb1, (aob)intent.getSerializableExtra("conversation_lookup"), intent.getBooleanExtra("conversation_hangout", false), intent.getBooleanExtra("force_group", false), intent.getIntExtra("transport_type", 0), intent.getStringExtra("invite_token_url")));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (jhb jhb1)
        {
            boolean flag = ank.g(this, j2);
            ebw.e("Babel", (new StringBuilder(45)).append("Exception in processIntent, logged off: ").append(flag).toString(), jhb1);
            a(intent, new dgu(intent.getIntExtra("rid", -1), 2, null), null);
            if ((jhb1 instanceof RuntimeException) && !flag)
            {
                throw (RuntimeException)jhb1;
            }
        }
          goto _L129
_L5:
        k(j2);
        g.g();
        g.a(((ani) (obj1)).a(), 0, 0);
        if (!dcx.c().d())
        {
            ebw.f("Babel", "GCM registration not done. Skip unregistering account");
            return;
        }
        if (((gms)hgx.a(g.k(), gms)).c(j2))
        {
            a(((dbn) (obj)), intent, new div(((ani) (obj1))));
            return;
        }
          goto _L129
_L12:
        if (!dcx.c().d())
        {
            ebw.g("Babel", "GCM registration not done before unregistering account");
            return;
        } else
        {
            a(((dbn) (obj)), intent, new diw(((ani) (obj1)), intent.getStringArrayListExtra("account_gaiaids")));
            return;
        }
_L4:
        if (a)
        {
            e("OP_REGISTER_ACCOUNT");
        }
        if (!dcx.c().d())
        {
            ebw.g("Babel", "GCM registration not done before registering account");
            return;
        } else
        {
            a(((dbn) (obj)), intent, new dgz(((ani) (obj1)), intent.getBooleanExtra("retry_request", false)));
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
            ebw.g("Babel", "OP_SET_SELF_INFO_BIT -- no EXTRA_SETSELFINO_BIT specified");
            return;
        }
        boolean flag1 = intent.getBooleanExtra("setselfinfo_bit_value", false);
        if (a)
        {
            e((new StringBuilder(55)).append("OP_SET_SELF_INFO_BIT whichBit: ").append(i1).append(" value: ").append(flag1).toString());
        }
        a(((dbn) (obj)), intent, new dio(((ani) (obj1)), i1, flag1));
        return;
_L19:
        if (dzy.b())
        {
            (new eaa()).a("rtcs_handle_deferred_notification").a(((ani) (obj1))).b();
        }
        if (a)
        {
            e("handle OP_TRIGGER_DEFERRED_NOTIFICATION");
        }
        jhb1 = intent.getStringExtra("message_id");
        intent = intent.getStringExtra("conversation_id");
        cej.a(getApplicationContext(), j2, jhb1, intent);
        return;
_L36:
        if (a)
        {
            e("handle OP_TRIGGER_RENOTIFICATION");
        }
        jhb1 = intent.getStringExtra("conversation_id");
        obj = intent.getStringExtra("message_id");
        long l3 = intent.getLongExtra("message_timestamp", 0L);
        intent = (new aoe(this, j2)).e(jhb1, ((String) (obj)));
        if (intent != null && l3 < ((aos) (intent)).I)
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
            cej.a(getApplicationContext(), j2, dfd.e, true, jhb.d());
            g.a(dbf.e(j2), 2366);
            return;
        }
          goto _L129
_L7:
        if (dzy.b())
        {
            (new eaa()).a("rtcs_handle_warm_sync").a(((ani) (obj1))).b();
        }
        long l4 = intent.getLongExtra("expected_hash", -1L);
        long l7 = (new daz(g.k())).a(((ani) (obj1)).h());
        if (l4 != -1L && l4 == l7)
        {
            if (a)
            {
                intent = String.valueOf(((ani) (obj1)).a());
                if (intent.length() != 0)
                {
                    intent = "RequestWarmSyncOperation is cancelled due to matched hash values for account: ".concat(intent);
                } else
                {
                    intent = new String("RequestWarmSyncOperation is cancelled due to matched hash values for account: ");
                }
                e(intent);
                g.a(((ani) (obj1)), 2310);
                return;
            }
        } else
        {
            dhl dhl1 = dhl.b(j2);
            if (a)
            {
                jhb1 = String.valueOf(((ani) (obj1)).a());
                boolean flag2;
                boolean flag8;
                if (jhb1.length() != 0)
                {
                    jhb1 = "RequestWarmSyncOperation is executed directly: ".concat(jhb1);
                } else
                {
                    jhb1 = new String("RequestWarmSyncOperation is executed directly: ");
                }
                e(jhb1);
            }
            dhl1.n();
            flag2 = intent.getBooleanExtra("suppress_notifications", false);
            flag8 = intent.getBooleanExtra("no_missed_events_expected", false);
            i1 = intent.getIntExtra("sync_type", 0);
            dhl1.a(flag8);
            dhl1.b(flag2);
            dhl1.d(i1);
            dhl1.a(2);
            a(((dbn) (obj)), intent, dhl1);
            return;
        }
          goto _L129
_L10:
        intent = intent.getStringExtra("conversation_id");
        (new aoe(this, j2)).l(intent);
        return;
_L8:
        long l5 = intent.getLongExtra("dnd_expiration", -1L);
        a(((dbn) (obj)), intent, new dik(((ani) (obj1)), l5));
        ((doq)hgx.a(g.k(), doq)).a(j2, l5);
        b(((ani) (obj1)), l5);
        cej.a(getApplicationContext(), j2, true);
        return;
_L9:
        boolean flag3 = intent.getBooleanExtra("archive", true);
        boolean flag9 = intent.getBooleanExtra("perform_locally", false);
        jhb1 = intent.getStringArrayExtra("conversationids");
        long al[] = intent.getLongArrayExtra("timestamps");
        if (jhb1.length != al.length)
        {
            throw new IllegalStateException("Must have same number of conversation ids and timestamps to archive");
        }
        ArrayList arraylist = new ArrayList();
        for (i1 = 0; i1 < jhb1.length; i1++)
        {
            arraylist.add(new dbd(jhb1[i1], al[i1]));
        }

        jhb1 = new dbc(((ani) (obj1)), arraylist, flag3, flag9);
        jhb1.a(intent.getIntExtra("rid", -1));
        a(((dbn) (obj)), intent, jhb1);
        cej.a(getApplicationContext(), j2, true);
        any.a(g.k(), j2);
        return;
_L11:
        jhb1 = new dcn(((ani) (obj1)), intent.getStringExtra("conversation_id"), intent.getLongExtra("timestamp", -1L));
        jhb1.a(intent.getIntExtra("rid", -1));
        a(((dbn) (obj)), intent, jhb1);
        cej.a(getApplicationContext(), j2, true);
        return;
_L21:
        jhb1 = intent.getStringExtra("conversation_id");
        intent = intent.getStringArrayExtra("event_ids");
        a(new aoe(this, j2), jhb1, intent);
        return;
_L20:
        intent = intent.getStringExtra("conversation_id");
        jhb1 = new dfb();
        any.a(((ani) (obj1)), jhb1, intent);
        ((dbn) (obj)).a(jhb1.c(), dhi.b().a(), y);
        return;
_L13:
        any.b(new aoe(this, j2), intent.getStringExtra("conversation_id"), intent.getLongExtra("extra_pending_conversation_operations", 0L));
        return;
_L14:
        a(((dbn) (obj)), intent, new dcv(((ani) (obj1))));
        return;
_L31:
        a(((dbn) (obj)), intent, new dip(((ani) (obj1)), intent.getStringExtra("status_message")));
        return;
_L15:
        jhb1 = intent.getStringExtra("gaia_id");
        if (!TextUtils.isEmpty(jhb1))
        {
            a(((dbn) (obj)), intent, new dcr(((ani) (obj1)), jhb1));
            return;
        } else
        {
            ebw.g("Babel", "Dismiss suggested contacts operation scheduled without gaiaid");
            return;
        }
_L26:
        jhb1 = intent.getStringExtra("member_gaiaid");
        if (!TextUtils.isEmpty(jhb1))
        {
            a(((dbn) (obj)), intent, new diu(((ani) (obj1)), jhb1));
            return;
        } else
        {
            ebw.g("Babel", "Undismiss suggested contacts operation scheduled without gaiaid");
            return;
        }
_L34:
        jhb1 = intent.getByteArrayExtra("current_version");
        String s2 = intent.getStringExtra("gaia_id");
        boolean flag4 = intent.getBooleanExtra("remove", false);
        if (!TextUtils.isEmpty(s2))
        {
            a(((dbn) (obj)), intent, new dja(((ani) (obj1)), jhb1, s2, flag4));
            return;
        } else
        {
            ebw.g("Babel", "Favorite contacts operation scheduled without gaiaid");
            return;
        }
_L35:
        a(((dbn) (obj)), intent, new ddd(((ani) (obj1))));
        return;
_L27:
        jhb1 = intent.getByteArrayExtra("pdu");
        boolean flag5 = intent.getBooleanExtra("is_sms_read", false);
        any.a(new SmsMessage[] {
            SmsMessage.createFromPdu(jhb1)
        }, ((ani) (obj1)), 0, Boolean.valueOf(flag5));
        if (!flag5)
        {
            cej.a(getApplicationContext(), j2, true);
            return;
        }
          goto _L129
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
            jhb1 = new ArrayList(1);
            jhb1.add(new ebj(Integer.valueOf(i1), Boolean.valueOf(flag6)));
            a(((dbn) (obj)), intent, new din(((ani) (obj1)), jhb1));
            return;
        }
          goto _L129
_L17:
        intent = (ceu)intent.getParcelableExtra("participant_entity");
        (new aoe(this, j2)).a(intent, true);
        return;
_L18:
        jhb1 = new aoe(this, j2);
        obj = intent.getStringExtra("conversation_id");
        intent = jhb1.e().a("SELECT count(*) from messages WHERE conversation_id=? LIMIT 1", new String[] {
            obj
        });
        if (intent.moveToFirst() && intent.getInt(0) == 0)
        {
            jhb1.B(((String) (obj)));
        }
        if (intent == null) goto _L129; else goto _L130
_L130:
        intent.close();
        return;
        jhb1;
        if (intent != null)
        {
            intent.close();
        }
        throw jhb1;
_L22:
        jhb1 = (dbx)intent.getParcelableExtra("recent_call_action_info");
        g.a(((ani) (obj1)), intent.getIntExtra("recent_call_type", 0), jhb1);
        return;
_L30:
        g.a(((ani) (obj1)), intent.getLongExtra("recent_call_timestamp", 0L), intent.getStringExtra("recent_call_rate"), intent.getBooleanExtra("recent_call_is_free_call", true));
        return;
_L29:
        g.a(((ani) (obj1)));
        return;
_L28:
        g.a(((ani) (obj1)), intent.getStringArrayExtra("recent_call_row_ids"));
        return;
_L23:
        (new aoe(this, j2)).i(intent.getStringExtra("conversation_id"));
        return;
_L24:
        if (a)
        {
            intent = String.valueOf(ebw.b(((ani) (obj1)).a()));
            int k1;
            if (intent.length() != 0)
            {
                intent = "pollParasiteOperations for account ".concat(intent);
            } else
            {
                intent = new String("pollParasiteOperations for account ");
            }
            ebw.b("Babel", intent);
        }
        if (dig.d() && !g.u(getApplicationContext()))
        {
            c(((ani) (obj1)));
        }
        h(((ani) (obj1)));
        a(j2, false);
        i(((ani) (obj1)));
        i(j2);
        j(j2);
        intent = dbf.c(true);
        j1 = intent.length;
        i1 = 0;
        while (i1 < j1) 
        {
            k1 = intent[i1];
            if (dhl.b(k1).f())
            {
                a(k1, false, false, 2, false);
            }
            i1++;
        }
          goto _L129
_L25:
        t.post(new dge(this));
        return;
_L32:
        a(((dbn) (obj)), intent, new ddh(((ani) (obj1)), intent.getStringExtra("phone_number")));
        return;
_L33:
        a(((dbn) (obj)), intent, new dhe(((ani) (obj1)), intent.getStringExtra("conversation_id"), intent.getIntExtra("report_abuse_type", 0)));
        return;
_L46:
        jhb1 = b(intent);
        if (jhb1 != null) goto _L132; else goto _L131
_L131:
        ebw.f("Babel", "Received null server response");
        return;
_L132:
        f(intent);
        jhb1.c(System.currentTimeMillis() * 1000L);
        jhb1 = a(((ani) (obj1)), ((dbn) (obj)), jhb1);
        a(intent, new dgu(i1, 1, null), jhb1);
        return;
_L64:
        Object obj2;
        Object obj3;
        obj3 = intent.getStringExtra("simulated_event_msg_num");
        obj2 = new ArrayList();
        jhb1 = i;
        jhb1;
        JVM INSTR monitorenter ;
        String as[];
        as = ((String) (obj3)).split("\\|");
        j1 = as.length;
        i1 = 0;
_L134:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        int l1 = Integer.parseInt(as[i1]);
        ((List) (obj2)).add(i.get(l1, null));
        i.remove(l1);
        i1++;
        if (true) goto _L134; else goto _L133
_L133:
        jhb1;
        JVM INSTR monitorexit ;
        jhb1 = ((List) (obj2)).iterator();
        while (jhb1.hasNext()) 
        {
            a(((ani) (obj1)), ((dbn) (obj)), (cyq)jhb1.next(), 0L, 0L, 0L, jhb.d());
        }
          goto _L129
        obj;
        jhb1;
        JVM INSTR monitorexit ;
        throw obj;
_L54:
        long l6;
        l6 = SystemClock.elapsedRealtime();
        obj2 = cyq.a(intent, ((ani) (obj1)), true);
        if (obj2 == null) goto _L136; else goto _L135
_L135:
        obj2 = ((List) (obj2)).iterator();
        while (((Iterator) (obj2)).hasNext()) 
        {
            as = (cyq)((Iterator) (obj2)).next();
            if (as instanceof crm)
            {
                ((crm)as).a(1);
            }
            a(((ani) (obj1)), ((dbn) (obj)), as, intent.getLongExtra("timestamp", 0L), intent.getLongExtra("gcm_handle_timestamps", 0L), l6 * 1000L, jhb1);
        }
          goto _L129
_L136:
        ebw.g("Babel", "could not parse ServerUpdate");
        return;
_L73:
        a(((dbn) (obj)), intent, new cpz(((ani) (obj1)), intent.getStringExtra("phone_number")));
        return;
_L116:
        a(((dbn) (obj)), intent, new dba(((ani) (obj1)), intent.getByteArrayExtra("broadcast")));
        return;
_L117:
        jhb1 = intent.getStringExtra("hangout_id");
        a(((dbn) (obj)), intent, new dcz(((ani) (obj1)), intent.getStringExtra("broadcast_id"), jhb1));
        return;
_L118:
        a(((dbn) (obj)), intent, new dei(((ani) (obj1)), intent.getByteArrayExtra("broadcast"), intent.getByteArrayExtra("sync_metadata")));
        return;
_L119:
        a(((dbn) (obj)), intent, new dhb(((ani) (obj1)), intent.getStringExtra("broadcast_id"), intent.getStringExtra("hangout_id")));
        return;
_L74:
        a(((dbn) (obj)), intent, new cps(((ani) (obj1)), intent.getStringExtra("phone_number"), intent.getStringExtra("verification_code"), intent.getBooleanExtra("is_discoverable", false)));
        return;
_L89:
        a(((dbn) (obj)), intent, new dgv(((ani) (obj1)), intent.getStringExtra("conversation_id")));
        return;
_L39:
        String s4;
        String s5;
        String s6;
        String s7;
        int i2;
        int k2;
        boolean flag7;
        obj2 = intent.getStringExtra("conversation_id");
        as = intent.getStringExtra("message_text");
        s4 = intent.getStringExtra("uri");
        s5 = intent.getStringExtra("picasa_photo_id");
        j1 = intent.getIntExtra("rotation", 0);
        i2 = intent.getIntExtra("width", 0);
        k2 = intent.getIntExtra("height", 0);
        s6 = intent.getStringExtra("content_type");
        s7 = intent.getStringExtra("subject");
        flag7 = intent.getBooleanExtra("requires_mms", false);
        jhb1 = (byh)intent.getParcelableExtra("place");
        if (jhb1 != null) goto _L138; else goto _L137
_L137:
        jhb1 = null;
_L141:
        aoe aoe1;
        int l2;
        l6 = intent.getLongExtra("timestamp", 0L);
        l2 = intent.getIntExtra("otr_state", 0);
        aoe1 = new aoe(this, j2);
        if (!dbq.v(j2) || g.e(aoe1.g(((String) (obj2))))) goto _L140; else goto _L139
_L139:
        jhb1 = new dhs(getApplicationContext(), ((ani) (obj1)), ((String) (obj2)), as, s4, j1, s5, i2, k2, s6, s7, flag7, jhb1, l6, l2, ((dbn) (obj)), i1, y);
_L142:
        a(((dbn) (obj)), intent, jhb1);
        return;
_L138:
        jhb1 = jhb1.a();
          goto _L141
_L140:
        jhb1 = new dhr(getApplicationContext(), ((ani) (obj1)), ((String) (obj2)), as, s4, j1, s5, i2, k2, s6, s7, flag7, jhb1, l6, l2);
          goto _L142
_L106:
        jhb1 = intent.getStringExtra("conversation_id");
        i1 = intent.getIntExtra("stress_current_message_id", 0);
        j1 = intent.getIntExtra("stress_max_message_id", 0);
        if (a)
        {
            obj = String.valueOf("Sending stress message from RealTimeChatService:");
            ebw.b("Babel_Stress", (new StringBuilder(String.valueOf(obj).length() + 11)).append(((String) (obj))).append(i1).toString());
        }
        obj = g.j(i1);
        ((dkt)hgx.a(getApplicationContext(), dkt)).a(((ani) (obj1)), jhb1, ((String) (obj)), null, 0, null, 0, 0, null, null, false, null, 0);
        a(((ani) (obj1)), jhb1, i1 + 1, j1);
        return;
          goto _L141
_L91:
        jhb1 = intent.getStringExtra("conversation_id");
        obj2 = intent.getStringExtra("uri");
        as = intent.getStringExtra("subject");
        i1 = intent.getIntExtra("draft_attachment_count", 0);
        a(((dbn) (obj)), intent, new dhr(getApplicationContext(), ((ani) (obj1)), jhb1, ((String) (obj2)), as, i1));
        return;
_L50:
        jhb1 = intent.getStringExtra("conversation_id");
        obj2 = intent.getStringExtra("message_id");
        i1 = intent.getIntExtra("error", 0);
        ebw.a("Babel", (new StringBuilder(String.valueOf(jhb1).length() + 24 + String.valueOf(obj2).length())).append("OP_SET_MESSAGE_FAILED: ").append(jhb1).append(" ").append(((String) (obj2))).toString());
        a(((dbn) (obj)), intent, new dim(((ani) (obj1)), jhb1, ((String) (obj2)), i1));
        return;
_L72:
        jhb1 = intent.getStringExtra("conversation_id");
        flag7 = intent.getBooleanExtra("insert_error_message", false);
        obj = new aoe(this, j2);
        ((aoe) (obj)).a(jhb1, dqb.a, dqb.d);
        any.a(((aoe) (obj)), jhb1, ((aoe) (obj)).X(jhb1));
        ((aoe) (obj)).e(jhb1, 4);
        if (!flag7) goto _L129; else goto _L143
_L143:
        l6 = System.currentTimeMillis();
        any.a(((aoe) (obj)), new ArrayList(), jhb1, jhb1, l6 * 1000L, -1L);
        return;
_L49:
        jhb1 = intent.getStringExtra("conversation_id");
        l6 = intent.getLongExtra("message_row_id", -1L);
        long l8 = intent.getLongExtra("timestamp", 0L);
        a(((dbn) (obj)), intent, new dhr(getApplicationContext(), ((ani) (obj1)), jhb1, l6, l8));
        return;
_L71:
        jhb1 = intent.getStringExtra("conversation_id");
        as = g.c(((ani) (obj1)), jhb1);
        j1 = 1;
        s4 = ((ani) (obj1)).b().a;
        obj2 = new ArrayList();
        i1 = as.b() - 1;
_L181:
        if (i1 < 0) goto _L145; else goto _L144
_L144:
        ceu ceu1 = as.a(i1).h();
        if (!s4.equals(ceu1.b()))
        {
            ((List) (obj2)).add(ceu1);
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
        arraylist1.add(new cuc(new ctv(jhb1, j1, null, ((List) (obj2)))));
        a(((dbn) (obj)), intent, new dgf(this, ((ani) (obj1)), arraylist1));
        return;
_L68:
        a(((dbn) (obj)), intent, new dcp(((ani) (obj1)), intent.getLongArrayExtra("message_row_ids")));
        return;
_L122:
        jhb1 = intent.getStringExtra("conversation_id");
        i1 = intent.getIntExtra("type", -1);
        gbh.b(Integer.valueOf(i1), Integer.valueOf(-1));
        a(((dbn) (obj)), intent, new dcq(((ani) (obj1)), jhb1, dqc.values()[i1]));
        return;
_L86:
        jhb1 = intent.getStringExtra("conversation_id");
        l6 = intent.getLongExtra("message_row_id", -1L);
        obj = new aoe(this, j2);
        any.a(((aoe) (obj)), l6);
        any.d(((aoe) (obj)), jhb1);
        return;
_L40:
        a(((dbn) (obj)), intent, new ddz(((ani) (obj1)), intent.getStringExtra("conversation_id"), (aik)intent.getSerializableExtra("audience")));
        return;
_L41:
        a(((dbn) (obj)), intent, new dea(((ani) (obj1)), intent.getStringExtra("conversation_id")));
        return;
_L42:
        a(((dbn) (obj)), intent, new diz(((ani) (obj1)), intent.getStringExtra("conversation_id"), intent.getLongExtra("watermark", 0L)));
        return;
_L115:
        jhb1 = intent.getStringExtra("conversation_id");
        i1 = intent.getIntExtra("call_media_type", 0);
        obj = new aoe(this, j2);
        ((aoe) (obj)).a(i1, ((aoe) (obj)).P(jhb1), jhb1);
        return;
_L69:
        l6 = intent.getLongExtra("scroll_timestamp", 0L);
        long l9 = intent.getLongExtra("scroll_to_item_timestamp", 0L);
        (new aoe(this, j2)).a(l6, l9);
        return;
_L70:
        jhb1 = intent.getStringExtra("conversation_id");
        l6 = intent.getLongExtra("scroll_timestamp", 0L);
        long l10 = intent.getLongExtra("scroll_to_item_timestamp", 0L);
        (new aoe(this, j2)).b(jhb1, l6, l10);
        return;
_L62:
        a(((dbn) (obj)), intent, new dil(((ani) (obj1)), intent.getByteArrayExtra("hangout_invite_receipt")));
        return;
_L43:
        intent.getStringExtra("conversation_id");
        a(((dbn) (obj)), intent, new dhc(((ani) (obj1)), intent.getStringExtra("conversation_id"), intent.getStringExtra("message_id")));
        return;
_L44:
        obj2 = intent.getStringExtra("conversation_id");
        jhb1 = intent.getStringExtra("conversation_name");
        obj1 = new dix(((ani) (obj1)), ((String) (obj2)));
        ((dix) (obj1)).b(jhb1);
        a(((dbn) (obj)), intent, ((dfa) (obj1)));
        return;
_L45:
        jhb1 = intent.getStringExtra("conversation_id");
        i1 = intent.getIntExtra("notification_level", 0);
        jhb1 = (new aoe(this, j2)).ag(jhb1).iterator();
        while (jhb1.hasNext()) 
        {
            obj2 = new dix(((ani) (obj1)), (String)jhb1.next());
            ((dix) (obj2)).a(i1);
            a(((dbn) (obj)), intent, ((dfa) (obj2)));
        }
          goto _L129
_L112:
        obj2 = intent.getStringExtra("conversation_id");
        jhb1 = intent.getStringExtra("ringtone_uri");
        obj1 = new dix(((ani) (obj1)), ((String) (obj2)));
        ((dix) (obj1)).c(jhb1);
        a(((dbn) (obj)), intent, ((dfa) (obj1)));
        return;
_L113:
        obj2 = intent.getStringExtra("conversation_id");
        jhb1 = intent.getStringExtra("ringtone_uri");
        obj1 = new dix(((ani) (obj1)), ((String) (obj2)));
        ((dix) (obj1)).d(jhb1);
        a(((dbn) (obj)), intent, ((dfa) (obj1)));
        return;
_L47:
        a(((dbn) (obj)), intent, new dhd(((ani) (obj1)), intent.getStringExtra("conversation_id"), intent.getBooleanExtra("accept", false), intent.getBooleanExtra("report_inviter", false), intent.getBooleanExtra("block_inviter", false)));
        return;
_L128:
        a(((dbn) (obj)), intent, new dcm(((ani) (obj1)), intent.getIntExtra("affinity", 0)));
        return;
_L48:
        a(((dbn) (obj)), intent, new dhk(((ani) (obj1)), intent.getStringExtra("conversation_id")));
        return;
_L55:
        a(((dbn) (obj)), intent, new dhj(((ani) (obj1)), intent.getIntExtra("conversation_sync_filter", 1)));
        return;
_L61:
        jhb1 = intent.getStringExtra("conversation_id");
        obj2 = new aoe(this, j2);
        if (((aoe) (obj2)).t(jhb1) == 2) goto _L150; else goto _L149
_L149:
        l6 = 0L;
_L151:
        a(((dbn) (obj)), intent, new dhg(((ani) (obj1)), jhb1, l6));
        return;
_L150:
        l6 = ((aoe) (obj2)).R(jhb1);
          goto _L151
_L123:
        jhb1 = intent.getStringExtra("gaia_id");
        obj = (ContentValues)intent.getParcelableExtra("content_values");
        (new aoe(this, j2)).a(jhb1, ((ContentValues) (obj)));
        return;
_L60:
        i1 = intent.getIntExtra("otr_status", 1);
        a(((dbn) (obj)), intent, new dek(((ani) (obj1)), intent.getStringExtra("conversation_id"), i1));
        return;
_L77:
        jhb1 = new dbv(((ani) (obj1)), intent.getStringExtra("member_gaiaid"), intent.getStringExtra("phone_number"), intent.getStringExtra("user_name"), intent.getBooleanExtra("blocked", true), intent.getBooleanExtra("retry_request", true));
        jhb1.a(intent.getIntExtra("rid", -1));
        a(((dbn) (obj)), intent, jhb1);
        return;
_L78:
        a(((dbn) (obj)), intent, new deb(((ani) (obj1))));
        return;
_L79:
        (new aoe(this, j2)).U(intent.getStringExtra("conversation_id"));
        return;
_L59:
        a(((dbn) (obj)), intent, dii.a(((ani) (obj1))), ((ani) (obj1)));
        return;
_L120:
        a(((dbn) (obj)), intent, dit.a(((ani) (obj1))), ((ani) (obj1)));
        return;
_L51:
        a(((dbn) (obj)), intent, new dhy(((ani) (obj1)), intent.getStringExtra("conversation_id"), intent.getBooleanExtra("is_present", false), intent.getIntExtra("timeout_secs", -1)));
        return;
_L52:
        a(((dbn) (obj)), intent, new did(((ani) (obj1)), intent.getStringExtra("conversation_id"), intent.getIntExtra("typing_status", 0)));
        return;
_L53:
        a(((dbn) (obj)), intent, new dic(((ani) (obj1)), intent.getStringExtra("conversation_id"), intent.getStringExtra("tile_type"), intent.getIntExtra("tile_event_version", 0), intent.getStringExtra("tile_event_type"), (Map)intent.getSerializableExtra("tile_event_data")));
        return;
_L57:
        a(((dbn) (obj)), intent, new dhp(((ani) (obj1)), intent.getStringExtra("query"), intent.getStringExtra("requester_id")));
        return;
_L58:
        a(((dbn) (obj)), intent, new ddc(((ani) (obj1)), intent.getParcelableArrayListExtra("com.google.android.apps.hangouts.EntityLookupSpecs"), intent.getStringExtra("batch_gebi_tag"), intent.getBooleanExtra("from_contact_lookup", false)));
        return;
_L80:
        a(((dbn) (obj)), intent, dgy.b(j2), ((ani) (obj1)));
        return;
_L108:
        obj = intent.getStringExtra("conversation_id");
        jhb1 = new aoe(this, j2);
        jhb1.a();
        aoe.b(jhb1, ((String) (obj)));
        jhb1.b();
        jhb1.c();
        return;
        obj;
        jhb1.c();
        throw obj;
_L110:
        jhb1 = intent.getStringArrayExtra("conversationids");
        (new aoe(this, j2)).a(jhb1);
        return;
_L95:
        a(((dbn) (obj)), intent, djh.b(j2), ((ani) (obj1)));
        return;
_L97:
        a(((dbn) (obj)), intent, dis.a(((ani) (obj1))), ((ani) (obj1)));
        return;
_L56:
        obj2 = dir.b(j2);
        flag7 = intent.getBooleanExtra("force_execution", false);
        if (!((dir) (obj2)).g()) goto _L153; else goto _L152
_L152:
        if (!a) goto _L129; else goto _L154
_L154:
        jhb1 = String.valueOf(((ani) (obj1)).a());
        if (jhb1.length() == 0) goto _L156; else goto _L155
_L155:
        jhb1 = "SyncBaselineSuggestedContactsOperation already executing, skip: ".concat(jhb1);
_L157:
        e(jhb1);
        return;
_L156:
        jhb1 = new String("SyncBaselineSuggestedContactsOperation already executing, skip: ");
        if (true) goto _L157; else goto _L153
_L153:
        if (flag7) goto _L159; else goto _L158
_L158:
        if (!((dir) (obj2)).f())
        {
            continue; /* Loop/switch isn't completed */
        }
_L159:
        if (!a) goto _L161; else goto _L160
_L160:
        jhb1 = String.valueOf("SyncBaselineSuggestedContactsOperation is executed directly: ");
        obj1 = String.valueOf(((ani) (obj1)).a());
        if (((String) (obj1)).length() == 0) goto _L163; else goto _L162
_L162:
        jhb1 = jhb1.concat(((String) (obj1)));
_L165:
        e(jhb1);
_L161:
        l.remove(obj2);
        ((dir) (obj2)).a(2);
        a(((dbn) (obj)), intent, ((dfa) (obj2)));
        return;
_L163:
        jhb1 = new String(jhb1);
        if (true) goto _L165; else goto _L164
_L164:
        if (!((dir) (obj2)).e()) goto _L129; else goto _L166
_L166:
        if (!a) goto _L168; else goto _L167
_L167:
        jhb1 = String.valueOf(((ani) (obj1)).a());
        if (jhb1.length() == 0) goto _L170; else goto _L169
_L169:
        jhb1 = "SyncBaselineSuggestedContactsOperation is queued: ".concat(jhb1);
_L171:
        e(jhb1);
_L168:
        l.add(obj2);
        ((dir) (obj2)).a(1);
        return;
_L170:
        jhb1 = new String("SyncBaselineSuggestedContactsOperation is queued: ");
          goto _L171
_L63:
        a(((dbn) (obj)), intent, new ddj(((ani) (obj1)), intent.getStringExtra("member_gaiaid")));
        return;
_L65:
        a(((dbn) (obj)), intent, new ddg(((ani) (obj1)), intent.getStringExtra("hangout_id")));
        return;
_L67:
        a(((dbn) (obj)), intent, new ddf(((ani) (obj1)), intent.getStringExtra("conversation_id")));
        return;
_L66:
        jhb1 = intent.getStringExtra("hangout_id");
        obj2 = (Pair)m.remove(jhb1);
        if (obj2 == null) goto _L173; else goto _L172
_L172:
        jhb1 = String.valueOf(jhb1);
        if (jhb1.length() == 0) goto _L175; else goto _L174
_L174:
        jhb1 = "Pulled logdata for session ".concat(jhb1);
_L176:
        ebw.c("Babel", jhb1);
        g.b(2380);
        a(((dbn) (obj)), intent, new dhf(((ani) (obj1)), (String)((Pair) (obj2)).first, (jdh)((Pair) (obj2)).second));
        g.b(2014);
        return;
_L175:
        jhb1 = new String("Pulled logdata for session ");
        if (true) goto _L176; else goto _L173
_L173:
        jhb1 = String.valueOf(jhb1);
        if (jhb1.length() == 0) goto _L178; else goto _L177
_L177:
        jhb1 = "No logdata for session ".concat(jhb1);
_L179:
        ebw.g("Babel", jhb1);
        g.b(2239);
        return;
_L178:
        jhb1 = new String("No logdata for session ");
          goto _L179
_L100:
        a(((dbn) (obj)), intent, new dji(((ani) (obj1)), intent.getStringExtra("compressed_log_file")));
        return;
_L75:
        a(((dbn) (obj)), intent, new ddb(((ani) (obj1))));
        return;
_L76:
        i1 = intent.getIntExtra("chat_acl_key", 0);
        jhb1 = intent.getStringExtra("chat_acl_circle_id");
        obj2 = intent.getStringExtra("chat_acl_circle_name");
        String s3 = intent.getStringExtra("chat_acl_level");
        a(((dbn) (obj)), intent, new dij(((ani) (obj1)), csv.values()[i1], jhb1, ((String) (obj2)), s3));
        return;
_L121:
        a(((dbn) (obj)), intent, new ddn(((ani) (obj1)), intent.getStringExtra("user_id")));
        return;
_L96:
        jhb1 = intent.getStringExtra("picasa_photo_id");
        a(((dbn) (obj)), intent, new ddo(((ani) (obj1)), intent.getStringExtra("gaia_id"), jhb1));
        return;
_L114:
        a(((dbn) (obj)), intent, new dcy(((ani) (obj1)), intent.getStringExtra("picasa_photo_id")));
        return;
_L81:
        a(((dbn) (obj)), intent, new dhx(((ani) (obj1)), intent.getStringExtra("email_address")));
        return;
_L82:
        any.a(((ani) (obj1)), intent.getStringExtra("conversation_id"), intent.getStringExtra("conversation_name"));
        return;
_L83:
        any.a(((ani) (obj1)), intent.getStringExtra("conversation_id"), 2);
        return;
_L84:
        any.a(((ani) (obj1)), intent);
        return;
_L87:
        drk.a(j2, intent.getByteArrayExtra("mms_wap_push_data"));
        return;
_L88:
        a(((dbn) (obj)), intent, new dhn(((ani) (obj1)), intent.getStringExtra("mms_content_location"), intent.getByteArrayExtra("mms_transaction_id"), intent.getLongExtra("notification_row_id", -1L), intent.getBooleanExtra("mms_auto_retrieve", false)));
        return;
_L85:
        any.a(((ani) (obj1)), intent, intent.getBooleanExtra("mms_auto_retrieve", false));
        return;
_L90:
        any.b(((ani) (obj1)), intent);
        return;
_L92:
        g.l();
        return;
_L93:
        g.m();
        return;
_L94:
        drs.a(intent.getIntExtra("free_sms_storage_action_index", -1), intent.getLongExtra("free_sms_storage_duration", -1L));
        return;
_L98:
        any.a(((ani) (obj1)), intent.getLongExtra("notification_row_id", -1L), intent.getBooleanExtra("mms_auto_retrieve", false), intent.getIntExtra("error", 0));
        return;
_L99:
        a(((dbn) (obj)), intent, new dch(((ani) (obj1)), intent.getIntExtra("hangout_type", 1), intent.getStringExtra("hangout_topic"), intent.getIntExtra("hangout_media_type", 1)));
        return;
_L101:
        any.b(((ani) (obj1)), intent.getStringExtra("mms_dump_file"));
        return;
_L102:
        jhb1 = intent.getStringExtra("message_text");
        obj2 = intent.getStringExtra("conversation_id");
        if (obj2 == null || jhb1 == null) goto _L129; else goto _L180
_L180:
        a(((dbn) (obj)), intent, new dcs(((ani) (obj1)), ((String) (obj2)), jhb1));
        return;
_L103:
        a(((dbn) (obj)), intent, new ddp(((ani) (obj1))));
        return;
_L104:
        a(((dbn) (obj)), intent, new dct(((ani) (obj1))));
        return;
_L105:
        jhb1 = intent.getStringExtra("phone_number");
        gbh.b(TextUtils.isEmpty(jhb1));
        a(((dbn) (obj)), intent, new dda(((ani) (obj1)), jhb1));
        return;
_L124:
        jhb1 = hgx.c(getApplicationContext(), daj).iterator();
        while (jhb1.hasNext()) 
        {
            a(((dbn) (obj)), intent, ((daj)jhb1.next()).a());
        }
          goto _L129
_L126:
        a(((dbn) (obj)), intent, ((dag)hgx.a(getApplicationContext(), dag)).a());
        return;
_L107:
        a(((dbn) (obj)), intent, new ddi(((ani) (obj1))));
        return;
_L125:
        a(((dbn) (obj)), intent, new dcu(((ani) (obj1)), intent.getStringExtra("phone_number"), intent.getStringExtra("from_phone_number")));
        return;
_L109:
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
_L111:
        a(((dbn) (obj)), intent, new dde(((ani) (obj1)), intent.getStringArrayExtra("image_urls")));
        return;
_L127:
        jhb1 = intent.getStringExtra("phone_number");
        a(((dbn) (obj)), intent, new czo(((ani) (obj1)), intent.getExtras().getBoolean("callerid_set_unset"), jhb1));
        return;
_L146:
        i1--;
          goto _L181
    }

    public static void d(String s1)
    {
        Object obj = dbf.l();
        if (obj == null)
        {
            return;
        } else
        {
            obj = a(((ani) (obj)).h(), 146);
            ((Intent) (obj)).putExtra("mms_dump_file", s1);
            c(((Intent) (obj)), jhb.d());
            return;
        }
    }

    public static boolean d(ani ani1, String s1)
    {
        if (a)
        {
            String s2 = String.valueOf(h);
            String s3 = g;
            String s4 = ani1.a();
            ebw.b("Babel", (new StringBuilder(String.valueOf(s2).length() + 30 + String.valueOf(s3).length() + String.valueOf(s1).length() + String.valueOf(s4).length())).append("isFocusedConversation ").append(s2).append("/").append(s3).append(" ?==? ").append(s1).append("/").append(s4).toString());
        }
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        if (TextUtils.equals(ani1.a(), g) && h != null && h.contains(s1))
        {
            return true;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        ani1;
        obj;
        JVM INSTR monitorexit ;
        throw ani1;
    }

    public static int e(int i1)
    {
        return c(a(i1, 148), jhb.d());
    }

    public static int e(ani ani1, String s1)
    {
        ani1 = a(ani1.h(), 192);
        ani1.putExtra("status_message", s1);
        return c(ani1, jhb.d());
    }

    public static int e(ani ani1, String s1, String s2)
    {
        ani1 = a(ani1.h(), 37, s1);
        ani1.putExtra("conversation_name", s2);
        return c(ani1, jhb.d());
    }

    public static void e()
    {
        c(h(173), jhb.d());
    }

    static void e(Intent intent)
    {
        b(intent, jhb.d());
    }

    public static void e(ani ani1)
    {
        b(a(ani1.h(), 162), jhb.d());
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
        ebw.b("Babel", s1);
    }

    public static int f(int i1)
    {
        return c(a(i1, 150), jhb.d());
    }

    public static int f(ani ani1, String s1)
    {
        return c(a(ani1.h(), 143, s1), jhb.d());
    }

    public static int f(ani ani1, String s1, String s2)
    {
        return c(a(ani1.h(), 177, s1).putExtra("ringtone_uri", s2), jhb.d());
    }

    public static void f()
    {
        c(h(174), jhb.d());
    }

    private void f(Intent intent)
    {
        Bundle bundle = intent.getExtras();
        if (bundle.containsKey("server_response_id"))
        {
            int i1 = intent.getIntExtra("account_id", -1);
            if (!((gms)hgx.a(getApplicationContext(), gms)).a(i1).d("preserve_response_data"))
            {
                intent = getApplicationContext();
                long l1 = bundle.getLong("server_response_id");
                dki.a(intent).d(l1);
            }
        }
    }

    public static void f(ani ani1)
    {
        t.post(new dgg(ani1));
    }

    public static int g()
    {
        return c(h(165), jhb.d());
    }

    public static int g(ani ani1, String s1)
    {
        return c(a(ani1.h(), 117, s1), jhb.d());
    }

    public static int g(ani ani1, String s1, String s2)
    {
        return c(a(ani1.h(), 178, s1).putExtra("ringtone_uri", s2), jhb.d());
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

        case 51: // '3'
            return "OP_SEND_TILE_EVENT";

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

    public static void g(ani ani1)
    {
        c(a(ani1.h(), 163), jhb.d());
    }

    public static int h(ani ani1, String s1)
    {
        return c(a(ani1.h(), 33, s1), jhb.d());
    }

    public static int h(ani ani1, String s1, String s2)
    {
        ani1 = a(ani1.h(), 135);
        ani1.putExtra("picasa_photo_id", s2);
        ani1.putExtra("gaia_id", s1);
        return c(ani1, jhb.d());
    }

    private static Intent h(int i1)
    {
        Intent intent = new Intent(g.nS, com/google/android/apps/hangouts/realtimechat/RealTimeChatService);
        intent.putExtra("op", i1);
        return intent;
    }

    public static void h()
    {
        t.post(new dfh());
    }

    private static void h(ani ani1)
    {
        dit dit1 = dit.a(ani1);
        if (dit1 == null)
        {
            e("Do not tickle gcm for sms only account");
        } else
        if (!dit1.e() && !dit1.f())
        {
            if (a)
            {
                e("TickleGcmOperation skipped");
                return;
            }
        } else
        {
            b(a(ani1.h(), 186), jhb.d());
            return;
        }
    }

    public static void i()
    {
        t.post(new dfi());
    }

    private static void i(int i1)
    {
        dgy dgy1 = dgy.b(i1);
        if (!dgy1.e() && !dgy1.f())
        {
            if (a)
            {
                e((new StringBuilder(49)).append("RefreshParticipantsOperation is idle: ").append(i1).toString());
            }
            return;
        } else
        {
            c(a(i1, 98), jhb.d());
            return;
        }
    }

    private static void i(ani ani1)
    {
        dis dis1 = dis.a(ani1);
        if (!dis1.e() && !dis1.f())
        {
            if (a)
            {
                ani1 = String.valueOf(ani1.a());
                if (ani1.length() != 0)
                {
                    ani1 = "SyncSmsDeletedMessagesOperation is idle: ".concat(ani1);
                } else
                {
                    ani1 = new String("SyncSmsDeletedMessagesOperation is idle: ");
                }
                e(ani1);
            }
            return;
        } else
        {
            c(a(ani1.h(), 137), jhb.d());
            return;
        }
    }

    public static void i(ani ani1, String s1)
    {
        if (aoe.a(s1) && !aoe.b(s1))
        {
            c(a(ani1.h(), 83, s1), jhb.d());
        }
    }

    public static void i(ani ani1, String s1, String s2)
    {
        synchronized (f)
        {
            if (d(ani1, s1))
            {
                g = ani1.a();
                if (h.remove(s1))
                {
                    h.add(s2);
                }
            }
        }
        synchronized (k)
        {
            k.put(s1, s2);
        }
        t.post(new dfu(s1, s2));
        return;
        ani1;
        obj;
        JVM INSTR monitorexit ;
        throw ani1;
        s1;
        ani1;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public static void j()
    {
        ani ani1 = dbf.l();
        if (ani1 == null)
        {
            return;
        } else
        {
            c(a(ani1.h(), 131), jhb.d());
            return;
        }
    }

    private static void j(int i1)
    {
        djh djh1 = djh.b(i1);
        if (!djh1.e() && !djh1.f())
        {
            if (a)
            {
                e((new StringBuilder(45)).append("UploadAnalyticsOperation is idle: ").append(i1).toString());
            }
            return;
        } else
        {
            c(a(i1, 134), jhb.d());
            return;
        }
    }

    public static void j(ani ani1, String s1)
    {
        c(a(ani1.h(), 180, s1).putExtra("call_media_type", 0), jhb.d());
    }

    public static int k(ani ani1, String s1)
    {
        ani1 = a(ani1.h(), 120);
        ani1.putExtra("gaia_id", s1);
        return c(ani1, jhb.d());
    }

    public static void k()
    {
        ani ani1 = dbf.l();
        if (ani1 == null)
        {
            return;
        } else
        {
            c(a(ani1.h(), 132), jhb.d());
            return;
        }
    }

    private static void k(int i1)
    {
        Object obj = dii.b(i1);
        if (obj != null)
        {
            l.remove(obj);
        }
        obj = dir.c(i1);
        if (obj != null)
        {
            l.remove(obj);
        }
        obj = dgy.c(i1);
        if (obj != null)
        {
            l.remove(obj);
        }
    }

    public static int l(ani ani1, String s1)
    {
        return c(a(ani1.h(), 42, s1), jhb.d());
    }

    public static boolean l()
    {
        return a;
    }

    public static int m(ani ani1, String s1)
    {
        if (aoe.a(s1))
        {
            return 0;
        } else
        {
            return c(a(ani1.h(), 65, s1), jhb.d());
        }
    }

    public static void m()
    {
        q();
    }

    public static int n(ani ani1, String s1)
    {
        return c(a(ani1.h(), 97, s1), jhb.d());
    }

    public static SparseArray n()
    {
        return x;
    }

    public static int o(ani ani1, String s1)
    {
        return c(a(ani1.h(), 79, s1), jhb.d());
    }

    public static CopyOnWriteArrayList o()
    {
        return n;
    }

    public static int p(ani ani1, String s1)
    {
        ani1 = a(ani1.h(), 145);
        ani1.putExtra("compressed_log_file", s1);
        return c(ani1, jhb.d());
    }

    public static CopyOnWriteArrayList p()
    {
        return o;
    }

    public static int q(ani ani1, String s1)
    {
        ani1 = a(ani1.h(), 189);
        ani1.putExtra("user_id", s1);
        return c(ani1, jhb.d());
    }

    private static void q()
    {
        boolean flag = g.a(g.nS, "babel_log_dump", false);
        Object obj = u;
        obj;
        JVM INSTR monitorenter ;
        if (!flag) goto _L2; else goto _L1
_L1:
        if (r != null) goto _L2; else goto _L3
_L3:
        r = new gkb(100);
_L5:
        s = flag;
        obj;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (flag) goto _L5; else goto _L4
_L4:
        if (r == null) goto _L5; else goto _L6
_L6:
        r = null;
          goto _L5
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static int r(ani ani1, String s1)
    {
        ani1 = a(ani1.h(), 179);
        ani1.putExtra("picasa_photo_id", s1);
        return c(ani1, jhb.d());
    }

    private static PendingIntent r()
    {
        Intent intent = new Intent("com.google.android.apps.hangouts.CLEANUP_DB");
        intent.putExtra("op", 94);
        return PendingIntent.getBroadcast(g.nS, eba.a(102), intent, 0x10000000);
    }

    public static int s(ani ani1, String s1)
    {
        ani1 = a(ani1.h(), 99);
        ani1.putExtra("email_address", s1);
        return c(ani1, jhb.d());
    }

    public static int t(ani ani1, String s1)
    {
        return c(a(ani1.h(), 160, s1), jhb.d());
    }

    public static int u(ani ani1, String s1)
    {
        ani1 = a(ani1.h(), 194);
        ani1.putExtra("phone_number", s1);
        return c(ani1, jhb.d());
    }

    protected void a(Intent intent, long l1, jhb jhb1)
    {
        if (intent != null) goto _L2; else goto _L1
_L1:
        ebw.f("Babel", "RTCS onHandleIntent called with null intent");
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
        if (a || s)
        {
            l2 = intent.getLongExtra("rqtns", 0L);
        } else
        {
            l2 = 0L;
        }
        if (a)
        {
            long l4 = (l1 - l2) / 0xf4240L;
            String s1 = g(i1);
            ebw.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 86)).append("RTCIntent: start processing intent:").append(s1).append(" account:").append(j1).append(" delay: ").append(l4).append(" ms").toString());
        }
        if (c == intent.getIntExtra("pid", -1))
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
            String s10 = g(i1);
            e((new StringBuilder(String.valueOf(s2).length() + 47 + String.valueOf(s6).length() + String.valueOf(s10).length())).append("onHandleIntent ").append(s2).append(" ").append(s6).append(" opcode: ").append(s10).append(" respectWakeLock ").append(flag).toString());
        }
        if (flag && (q == null || !q.isHeld()))
        {
            jhb1 = String.valueOf(intent);
            String s3 = String.valueOf(intent.getAction());
            String s7 = g(i1);
            String s11 = String.valueOf(q);
            if (q == null)
            {
                intent = "(null)";
            } else
            {
                intent = Boolean.valueOf(q.isHeld());
            }
            intent = String.valueOf(intent);
            ebw.g("Babel", (new StringBuilder(String.valueOf(jhb1).length() + 58 + String.valueOf(s3).length() + String.valueOf(s7).length() + String.valueOf(s11).length() + String.valueOf(intent).length())).append("RTCS.onHandleIntent called ").append(jhb1).append(" ").append(s3).append(" opcode: ").append(s7).append(" sWakeLock: ").append(s11).append(" isHeld: ").append(intent).toString());
            if (i1 == 78)
            {
                g.b(2377);
            }
            throw new IllegalStateException();
        }
        any.a();
        i1;
        JVM INSTR lookupswitch 9: default 1522
    //                   16: 932
    //                   74: 835
    //                   94: 882
    //                   100: 915
    //                   141: 900
    //                   149: 950
    //                   165: 1075
    //                   173: 1081
    //                   174: 1088;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L3:
        ani ani1 = dbf.e(j1);
        if (ani1 != null) goto _L14; else goto _L13
_L13:
        ebw.g("Babel", "skipping intent for invalid account");
        if (i1 != 78)
        {
            break; /* Loop/switch isn't completed */
        }
        g.b(2378);
_L18:
        if (dzy.b())
        {
            dzy.c();
        }
        any.b();
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
            q.release();
        }
        // Misplaced declaration of an exception variable
        catch (jhb jhb1)
        {
            String s4 = String.valueOf(intent);
            String s8 = String.valueOf(intent.getAction());
            String s12 = g(i1);
            String s14 = String.valueOf(q);
            if (q == null)
            {
                intent = "(null)";
            } else
            {
                intent = Boolean.valueOf(q.isHeld());
            }
            intent = String.valueOf(intent);
            ebw.g("Babel", (new StringBuilder(String.valueOf(s4).length() + 62 + String.valueOf(s8).length() + String.valueOf(s12).length() + String.valueOf(s14).length() + String.valueOf(intent).length())).append("RTCS.onHandleIntent exit crash ").append(s4).append(" ").append(s8).append(" opcode: ").append(s12).append(" sWakeLock: ").append(s14).append(" isHeld: ").append(intent).toString());
            throw jhb1;
        }
        if (!s && !a) goto _L16; else goto _L15
_L15:
        l5 = System.nanoTime();
        if (s && r != null)
        {
            jhb1 = new dgl(i1, l3, l2, l1, l5);
            synchronized (u)
            {
                if (r != null)
                {
                    r.a(jhb1);
                }
            }
        }
        if (!a) goto _L16; else goto _L17
_L17:
        l1 = (l5 - l1) / 0xf4240L;
        intent = g(i1);
        ebw.b("Babel", (new StringBuilder(String.valueOf(intent).length() + 86)).append("RTCIntent: finish processing intent:").append(intent).append(" account:").append(j1).append(" time: ").append(l1).append(" ms").toString());
        return;
_L5:
        ebw.c("Babel", "locale changed.");
        EsProvider.a(this);
          goto _L18
        jhb1;
        any.b();
        if (flag)
        {
            if (a)
            {
                e("releasing wakelock");
            }
            try
            {
                q.release();
            }
            // Misplaced declaration of an exception variable
            catch (jhb jhb1)
            {
                String s5 = String.valueOf(intent);
                String s9 = String.valueOf(intent.getAction());
                String s13 = g(i1);
                String s15 = String.valueOf(q);
                if (q == null)
                {
                    intent = "(null)";
                } else
                {
                    intent = Boolean.valueOf(q.isHeld());
                }
                intent = String.valueOf(intent);
                ebw.g("Babel", (new StringBuilder(String.valueOf(s5).length() + 62 + String.valueOf(s9).length() + String.valueOf(s13).length() + String.valueOf(s15).length() + String.valueOf(intent).length())).append("RTCS.onHandleIntent exit crash ").append(s5).append(" ").append(s9).append(" opcode: ").append(s13).append(" sWakeLock: ").append(s15).append(" isHeld: ").append(intent).toString());
                throw jhb1;
            }
        }
        throw jhb1;
_L6:
        ebw.c("Babel", "clean up database.");
        dkz.c().e();
          goto _L18
_L8:
        ebw.c("Babel", "renew accounts.");
        dbf.p();
          goto _L18
_L7:
        PackageReplacedReceiver.a(intent.getAction(), intent.getStringExtra("package"));
          goto _L18
_L4:
        k(j1);
        dlb.a(j1);
        dlg.a(j1);
          goto _L18
_L9:
        jhb1 = intent.getStringExtra("conversation_id");
        l5 = intent.getLongExtra("timestamp", 0L);
        k1 = (new aoe(this, j1)).e(jhb1, l5);
        if (a)
        {
            ebw.b("Babel", (new StringBuilder(String.valueOf(jhb1).length() + 152)).append("Deleted ").append(k1).append(" played event suggestions for conversation ").append(jhb1).append(" on account ").append(j1).append(" where the last played event was at timestamp ").append(l5).append(".").toString());
        }
          goto _L18
_L10:
        dme.e();
          goto _L18
_L11:
        aoe.a(this);
          goto _L18
_L12:
        aoe.b(this);
          goto _L18
_L14:
label0:
        {
            if (dbf.g(ani1) && !a(intent))
            {
                break label0;
            }
            d(intent, jhb1);
        }
        if (true) goto _L18; else goto _L19
_L19:
        if (i1 != 78)
        {
            break MISSING_BLOCK_LABEL_1134;
        }
        g.b(2525);
        g.b(j1, 2566).a(i1).d();
          goto _L18
        jhb1;
        intent;
        JVM INSTR monitorexit ;
        throw jhb1;
    }

    public void a(Intent intent, dgu dgu1, Object obj, boolean flag)
    {
        ani ani1;
        int i1;
        int j1;
        int l1;
        j1 = intent.getIntExtra("op", -1);
        i1 = intent.getIntExtra("rid", -1);
        l1 = intent.getIntExtra("account_id", -1);
        ani1 = dbf.e(l1);
        if (ani1 != null) goto _L2; else goto _L1
_L1:
        ebw.f("Babel", (new StringBuilder(68)).append("[onIntentProcessed] Skipping intent for invalid account: ").append(l1).toString());
_L4:
        return;
_L2:
        if (a)
        {
            String s1 = g(j1);
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
                dgu1 = (dgu)intent.next();
                obj = o.iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    ((dgm)((Iterator) (obj)).next()).a(dgu1.a(), ani1, dgu1);
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
            intent = (dcg)obj;
            obj = n.iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                ((dgp)((Iterator) (obj)).next()).a(i1, ani1, intent, dgu1);
            }
            break;

        case 39: // '\''
            if (obj != null)
            {
                intent = ((List)obj).iterator();
                while (intent.hasNext()) 
                {
                    dgu1 = (dgu)intent.next();
                    i1 = dgu1.a();
                    obj = n.iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        ((dgp)((Iterator) (obj)).next()).a(i1, ani1, dgu1);
                    }
                }
            }
            break;

        case 185: 
            obj = (dcg)obj;
            int k1 = intent.getIntExtra("original_conversation_id", -1);
            intent = n.iterator();
            while (intent.hasNext()) 
            {
                ((dgp)intent.next()).a(i1, ani1, ((dcg) (obj)), dgu1, k1);
            }
            break;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public void a(Intent intent, jhb jhb1)
    {
        long l1;
        if (a || s)
        {
            l1 = System.nanoTime();
        } else
        {
            l1 = 0L;
        }
        if (B != null)
        {
            B.b(intent);
        }
        a(intent, l1, jhb1);
        if (B != null)
        {
            B.a();
        }
    }

    public void a(ani ani1, cwq cwq1)
    {
        t.post(new dfv(this, ani1, cwq1));
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
        return cxi.getName().equals(intent);
    }

    public void onCreate()
    {
        if (a)
        {
            e("Creating RTCS");
        }
        super.onCreate();
        DebugActivity.a(getApplicationContext());
        if (!z)
        {
            if (a)
            {
                ebw.c("Babel", "start and bind to the request writer");
            }
            getApplicationContext().startService(RequestWriter.k());
            bindService(new Intent(this, com/google/android/apps/hangouts/requestwriter/RequestWriter), A, 1);
            z = true;
        }
        (new dgj(this)).execute(new Void[0]);
    }

    public void onDestroy()
    {
        if (a)
        {
            ebw.b("Babel", "Destroying RTCS");
        }
        if (z)
        {
            if (a)
            {
                ebw.c("Babel", "unbind to the request writer");
            }
            unbindService(A);
            y = null;
            z = false;
        }
        super.onDestroy();
        if (B != null)
        {
            B.b();
        }
    }

    public int onStartCommand(Intent intent, int i1, int j1)
    {
        if ((i1 & 1) != 0)
        {
            String s1 = String.valueOf(intent);
            String s2 = String.valueOf(intent.getAction());
            String s3 = g(intent.getIntExtra("op", 0));
            ebw.f("Babel", (new StringBuilder(String.valueOf(s1).length() + 98 + String.valueOf(s2).length() + String.valueOf(s3).length())).append("RTCS.onStartCommand called for redelivery / retry ").append(s1).append(" ").append(s2).append(" opcode: ").append(s3).append(" flags ").append(i1).append(" startId ").append(j1).toString());
        }
        return super.onStartCommand(intent, i1, j1);
    }

    static 
    {
        hik hik = ebw.n;
        q();
        g.a(g.nS).a(new dfp());
    }
}
