// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Collections;

public final class ebu extends gbm
{

    private static final String a = "net_null";
    private static final String b = "ff_phone";
    private static final String c = "ff_tablet";
    private static final SparseArray f;
    private static final SparseArray g;
    private ArrayList d;
    private Context e;

    private ebu(Context context, int ai[], ArrayList arraylist)
    {
        super(context, ai, g, f);
        d = arraylist;
        e = context;
    }

    public static ebu a(Context context, int ai[], String as[])
    {
        ebw.c("CallMarkReporter", "Creating startup reporter");
        ArrayList arraylist = new ArrayList();
        Collections.addAll(arraylist, as);
        DisplayMetrics displaymetrics;
        int i;
        int j;
        if (((TelephonyManager)context.getSystemService("phone")).getPhoneType() != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            as = b;
        } else
        {
            as = c;
        }
        arraylist.add(as);
        as = (WindowManager)context.getSystemService("window");
        displaymetrics = new DisplayMetrics();
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            as.getDefaultDisplay().getRealMetrics(displaymetrics);
        } else
        {
            as.getDefaultDisplay().getMetrics(displaymetrics);
        }
        i = (int)((float)displaymetrics.widthPixels / displaymetrics.xdpi);
        j = (int)((float)displaymetrics.heightPixels / displaymetrics.ydpi);
        as = String.valueOf("sh_");
        arraylist.add((new StringBuilder(String.valueOf(as).length() + 11)).append(as).append(j).toString());
        as = String.valueOf("sw_");
        arraylist.add((new StringBuilder(String.valueOf(as).length() + 11)).append(as).append(i).toString());
        as = String.valueOf("api_");
        i = android.os.Build.VERSION.SDK_INT;
        arraylist.add((new StringBuilder(String.valueOf(as).length() + 11)).append(as).append(i).toString());
        context = new ebu(context, ai, arraylist);
        i = g.a(g.nS, "babel_csi_grace_send_time", 40000);
        context.c(g.a(g.nS, "babel_csi_server_override", "https://csi.gstatic.com/csi"));
        (new Handler()).postDelayed(new ebv(context), i);
        return context;
    }

    protected ArrayList a()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(d);
        Object obj1 = bnd.a().g();
        Object obj;
        if (obj1 == null)
        {
            obj = a;
        } else
        {
            obj = String.valueOf("net_");
            obj1 = String.valueOf(((gjo) (obj1)).f());
            if (((String) (obj1)).length() != 0)
            {
                obj = ((String) (obj)).concat(((String) (obj1)));
            } else
            {
                obj = new String(((String) (obj)));
            }
        }
        arraylist.add(obj);
        obj = (ecs)hgx.a(e, ecs);
        obj1 = String.valueOf("build_");
        if (((ecs) (obj)).a())
        {
            obj = "dev";
        } else
        {
            obj = ((ecs) (obj)).c().replace('.', '_');
        }
        obj = String.valueOf(obj);
        if (((String) (obj)).length() != 0)
        {
            obj = ((String) (obj1)).concat(((String) (obj)));
        } else
        {
            obj = new String(((String) (obj1)));
        }
        arraylist.add(obj);
        return arraylist;
    }

    protected void a(ahf ahf1)
    {
        super.a(ahf1);
        gjo gjo1 = bnd.a().g();
        if (gjo1 != null)
        {
            ahf1.a("sessionid", gjo1.c());
            ahf1.a("ls", gjo1.c());
            ahf1.a("plid", gjo1.e());
            ahf1.a("rs", gjo1.d());
        }
    }

    public void a(String s)
    {
        d.add(s);
    }

    protected void a(jew jew1)
    {
        super.a(jew1);
        gjo gjo1 = bnd.a().g();
        if (gjo1 != null)
        {
            jew1.a = new jev();
            jew1.a.k = gjo1.c();
            jew1.a.e = gjo1.e();
            jew1.a.b = gjo1.d();
        }
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (!g.a(g.nS, "babel_csi_logging_enabled", true)) goto _L2; else goto _L1
_L1:
        ebw.c("CallMarkReporter", "Reporting call startup stats");
        super.b();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ebw.c("CallMarkReporter", "CSI disabled, not reporting call startup stats");
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    static 
    {
        SparseArray sparsearray = new SparseArray();
        sparsearray.put(1, "hangout_startup");
        sparsearray.put(2, "hangout_startup_join");
        sparsearray.put(3, "hangout_startup_create");
        f = sparsearray;
        sparsearray = new SparseArray();
        sparsearray.put(2, "mcsc");
        sparsearray.put(4, "frt");
        sparsearray.put(5, "ir");
        sparsearray.put(6, "irt");
        sparsearray.put(7, "ms");
        sparsearray.put(8, "mst");
        sparsearray.put(9, "frf");
        sparsearray.put(10, "frft");
        sparsearray.put(11, "fapr");
        sparsearray.put(12, "faprt");
        sparsearray.put(13, "rs");
        sparsearray.put(14, "rst");
        sparsearray.put(15, "frec");
        sparsearray.put(16, "frect");
        g = sparsearray;
    }
}
