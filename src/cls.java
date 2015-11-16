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

public final class cls
{

    final Context a;
    ani b;
    int c;
    cop d;
    ap e;

    public cls(Context context)
    {
        a = context;
        c = ((gmo)hgx.a(context, gmo)).a();
        b = dbf.e(c);
    }

    static boolean a(cls cls1)
    {
        chz chz1 = (chz)hgx.a(cls1.a, chz);
        if (chz1.a("android.permission.WRITE_EXTERNAL_STORAGE") && chz1.a("android.permission.READ_EXTERNAL_STORAGE"))
        {
            return true;
        } else
        {
            Toast.makeText(cls1.a, "You don't have storage permission, please enable it in settings and try again.", 1).show();
            return false;
        }
    }

    public AlertDialog a()
    {
        n.b(e);
        n.b(d);
        n.b(b);
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(a);
        ArrayAdapter arrayadapter = new ArrayAdapter(a, 0x1090003);
        arrayadapter.add(new clt(this, "Debug Activity"));
        arrayadapter.add(new cmg(this, "Debug Bitmaps Activity"));
        arrayadapter.add(new cml(this, "Debug OzGetMergedPerson Activity"));
        arrayadapter.add(new cmm(this, "Request Warm Sync"));
        arrayadapter.add(new cmn(this, "Tickle GCM"));
        arrayadapter.add(new cmp(this, "Rewind 10 days"));
        arrayadapter.add(new cmr(this, "Refresh from contacts"));
        arrayadapter.add(new cms(this, "Dump Database"));
        arrayadapter.add(new cmt(this, "Clear impressions throttles"));
        Object obj = (AudioManager)a.getSystemService("audio");
        long l;
        long l1;
        if (((AudioManager) (obj)).isMicrophoneMute())
        {
            arrayadapter.add(new clu(this, "Turn hardware mic on", ((AudioManager) (obj))));
        } else
        {
            arrayadapter.add(new clv(this, "Turn hardware mic off", ((AudioManager) (obj))));
        }
        arrayadapter.add(new clw(this, "Re-run RegisterAccountOperation"));
        arrayadapter.add(new clx(this, "Run DB Cleaner"));
        if (b.t())
        {
            arrayadapter.add(new clz(this, "Re-import SMS"));
            arrayadapter.add(new cma(this, "Sync SMS"));
            arrayadapter.add(new cmb(this, "Load SMS/MMS from dump file"));
            arrayadapter.add(new cmc(this, "Email SMS/MMS dump file"));
            arrayadapter.add(new cmd(this, "Load test APN OTA"));
        }
        arrayadapter.add(new cmf(this, "Activate all Butter Bars"));
        l = g.a(a, "babel_rtcs_watchdog_warning", 0L);
        l1 = g.a(a, "babel_rtcs_watchdog_error", 0L);
        arrayadapter.add(new cmh(this, (new StringBuilder(49)).append("Test RTCS watchdog (warning ").append(l).append(")").toString(), l));
        arrayadapter.add(new cmi(this, (new StringBuilder(47)).append("Test RTCS watchdog (error ").append(l1).append(")").toString(), l1));
        arrayadapter.add(new cmj(this, "Crash!"));
        for (obj = hgx.c(a, cmv).iterator(); ((Iterator) (obj)).hasNext(); arrayadapter.add(((cmv)((Iterator) (obj)).next()).a(a))) { }
        builder.setAdapter(arrayadapter, new cmk(this, arrayadapter));
        return builder.create();
    }

    public cls a(ap ap)
    {
        e = ap;
        return this;
    }

    public cls a(cop cop)
    {
        d = cop;
        return this;
    }
}
