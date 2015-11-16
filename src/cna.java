// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.content.Context;
import android.media.AudioManager;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import java.util.Iterator;
import java.util.List;

public final class cna
{

    final Context a;
    aoa b;
    int c;
    cqf d;
    ap e;

    public cna(Context context)
    {
        a = context;
        c = ((gqu)hlp.a(context, gqu)).a();
        b = dcn.e(c);
    }

    static boolean a(cna cna1)
    {
        cjf cjf1 = (cjf)hlp.a(cna1.a, cjf);
        if (cjf1.a("android.permission.WRITE_EXTERNAL_STORAGE") && cjf1.a("android.permission.READ_EXTERNAL_STORAGE"))
        {
            return true;
        } else
        {
            Toast.makeText(cna1.a, "You don't have storage permission, please enable it in settings and try again.", 0).show();
            return false;
        }
    }

    public AlertDialog a()
    {
        n.b(e);
        n.b(d);
        n.b(b);
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(a);
        Object obj = a.getSharedPreferences("rpc", 0);
        ArrayAdapter arrayadapter = new ArrayAdapter(a, 0x1090003);
        arrayadapter.add(new cnb(this, "Debug Activity"));
        arrayadapter.add(new con(this, ((android.content.SharedPreferences) (obj))));
        arrayadapter.add(new coe(this, ((android.content.SharedPreferences) (obj))));
        arrayadapter.add(new cno(this, "Debug Bitmaps Activity"));
        arrayadapter.add(new cnv(this, "Debug OzGetMergedPerson Activity"));
        arrayadapter.add(new cnw(this, "Request Warm Sync"));
        arrayadapter.add(new cnx(this, "Tickle GCM"));
        arrayadapter.add(new cnz(this, "Rewind 10 days"));
        arrayadapter.add(new cob(this, "Refresh from contacts"));
        arrayadapter.add(new coc(this, "Dump Database"));
        arrayadapter.add(new cod(this, "Clear impressions throttles"));
        obj = (AudioManager)a.getSystemService("audio");
        long l;
        long l1;
        if (((AudioManager) (obj)).isMicrophoneMute())
        {
            arrayadapter.add(new cnc(this, "Turn hardware mic on", ((AudioManager) (obj))));
        } else
        {
            arrayadapter.add(new cnd(this, "Turn hardware mic off", ((AudioManager) (obj))));
        }
        arrayadapter.add(new cne(this, "Re-run RegisterAccountOperation"));
        arrayadapter.add(new cnf(this, "Run DB Cleaner"));
        if (b.r())
        {
            arrayadapter.add(new cnh(this, "Re-import SMS"));
            arrayadapter.add(new cni(this, "Sync SMS"));
            arrayadapter.add(new cnj(this, "Load SMS/MMS from dump file"));
            arrayadapter.add(new cnk(this, "Email SMS/MMS dump file"));
            arrayadapter.add(new cnl(this, "Load test APN OTA"));
        }
        arrayadapter.add(new cnn(this, "Activate all Butter Bars"));
        l = g.a(a, "babel_rtcs_watchdog_warning", 0L);
        l1 = g.a(a, "babel_rtcs_watchdog_error", 0L);
        arrayadapter.add(new cnp(this, (new StringBuilder(49)).append("Test RTCS watchdog (warning ").append(l).append(")").toString(), l));
        arrayadapter.add(new cnq(this, (new StringBuilder(47)).append("Test RTCS watchdog (error ").append(l1).append(")").toString(), l1));
        arrayadapter.add(new cnr(this, "Crash!"));
        arrayadapter.add(new cns(this, "Simulate GMS upgrade"));
        arrayadapter.add(new cnt(this, "Simulate Hangouts upgrade"));
        for (obj = hlp.c(a, cok).iterator(); ((Iterator) (obj)).hasNext(); arrayadapter.add(((cok)((Iterator) (obj)).next()).a(a))) { }
        builder.setAdapter(arrayadapter, new cnu(this, arrayadapter));
        return builder.create();
    }

    public cna a(ap ap)
    {
        e = ap;
        return this;
    }

    public cna a(cqf cqf)
    {
        d = cqf;
        return this;
    }
}
