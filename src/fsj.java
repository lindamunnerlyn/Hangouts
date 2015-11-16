// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public final class fsj extends eqa
{

    private static volatile Bundle i;
    private static volatile Bundle j;
    public final String e;
    public final String f;
    public final Context g;
    private final HashMap h = new HashMap();
    private Long k;

    public fsj(Context context, Looper looper, enb enb, end end, String s, epo epo1)
    {
        super(context.getApplicationContext(), looper, 5, epo1, enb, end);
        k = null;
        g = context;
        e = s;
        f = epo1.f();
    }

    public static Status a(int l, Bundle bundle)
    {
        return new Status(l, null, b(bundle));
    }

    private fss a(emy emy1, fpg fpg)
    {
label0:
        {
            synchronized (h)
            {
                if (!h.containsKey(fpg))
                {
                    break label0;
                }
                emy1 = (fss)h.get(fpg);
            }
            return emy1;
        }
        emy1 = new fss(emy1.a(fpg));
        h.put(fpg, emy1);
        hashmap;
        JVM INSTR monitorexit ;
        return emy1;
        emy1;
        hashmap;
        JVM INSTR monitorexit ;
        throw emy1;
    }

    static ftp a(DataHolder dataholder)
    {
        if (dataholder == null)
        {
            return null;
        } else
        {
            return new ftp(dataholder, new fre(j), new frd(i));
        }
    }

    private void a(Bundle bundle)
    {
        this;
        JVM INSTR monitorenter ;
        if (bundle != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        frn.i = bundle.getBoolean("use_contactables_api", true);
        fsi.a.a(bundle);
        i = bundle.getBundle("config.email_type_map");
        j = bundle.getBundle("config.phone_type_map");
        if (true) goto _L1; else goto _L3
_L3:
        bundle;
        throw bundle;
    }

    private static PendingIntent b(Bundle bundle)
    {
        if (bundle == null)
        {
            return null;
        } else
        {
            return (PendingIntent)bundle.getParcelable("pendingIntent");
        }
    }

    static ConnectionResult b(int l, Bundle bundle)
    {
        return new ConnectionResult(l, b(bundle));
    }

    protected IInterface a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.people.internal.IPeopleService");
        if (iinterface != null && (iinterface instanceof fsb))
        {
            return (fsb)iinterface;
        } else
        {
            return new fsd(ibinder);
        }
    }

    public eqs a(enn enn, long l)
    {
        super.k();
        enn = new fsm(enn);
        eqs eqs;
        try
        {
            eqs = ((fsb)super.m()).b(enn, l, true);
        }
        catch (RemoteException remoteexception)
        {
            enn.a(8, null, null, null);
            return null;
        }
        return eqs;
    }

    public eqs a(enn enn, String s, String s1)
    {
        enn = new fsm(enn);
        try
        {
            s = ((fsb)super.m()).c(enn, s, s1, 0);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            enn.a(8, null, null, null);
            return null;
        }
        return s;
    }

    public eqs a(enn enn, String s, String s1, int l, int i1)
    {
        enn = new fsm(enn);
        try
        {
            s = ((fsb)super.m()).b(enn, s, s1, l, i1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            enn.a(8, null, null, null);
            return null;
        }
        return s;
    }

    protected String a()
    {
        return "com.google.android.gms.people.service.START";
    }

    protected void a(int l, IBinder ibinder, Bundle bundle, int i1)
    {
        if (l == 0 && bundle != null)
        {
            a(bundle.getBundle("post_init_configuration"));
        }
        if (bundle == null)
        {
            bundle = null;
        } else
        {
            bundle = bundle.getBundle("post_init_resolution");
        }
        super.a(l, ibinder, bundle, i1);
    }

    public void a(emy emy1, fpg fpg, String s, String s1, int l)
    {
        super.k();
        synchronized (h)
        {
            emy1 = a(emy1, fpg);
            ((fsb)super.m()).a(emy1, true, s, s1, l);
        }
        return;
        emy1;
        hashmap;
        JVM INSTR monitorexit ;
        throw emy1;
    }

    public void a(enn enn, String s, String s1, foy foy1)
    {
        Object obj;
        String s2;
        Collection collection;
        int l;
        int i1;
        int j1;
        int k1;
        long l1;
        boolean flag;
        obj = foy1;
        if (foy1 == null)
        {
            obj = foy.a;
        }
        foy1 = ((foy) (obj)).b();
        collection = ((foy) (obj)).c();
        l = ((foy) (obj)).d();
        flag = ((foy) (obj)).e();
        l1 = ((foy) (obj)).f();
        s2 = ((foy) (obj)).g();
        i1 = ((foy) (obj)).h();
        j1 = ((foy) (obj)).i();
        k1 = ((foy) (obj)).j();
        super.k();
        obj = new fsn(enn);
        fsb fsb1 = (fsb)super.m();
        if (collection != null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        enn = null;
_L1:
        try
        {
            fsb1.a(((fry) (obj)), s, s1, foy1, enn, l, flag, l1, s2, i1, j1, k1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (enn enn)
        {
            ((fsn) (obj)).a(8, null, null);
        }
        break MISSING_BLOCK_LABEL_159;
        enn = new ArrayList(collection);
          goto _L1
    }

    public void a(enn enn, String s, String s1, boolean flag, String s2, boolean flag1, int l, 
            int i1, String s3, boolean flag2, int j1)
    {
        super.k();
        if (j1 != 0 && TextUtils.isEmpty(s2))
        {
            g.m(5);
            j1 = 0;
        }
        Object obj = super.a;
        enn = new frr(enn);
        Bundle bundle = i;
        Bundle bundle1 = j;
        if (TextUtils.isEmpty(s2))
        {
            enn = new frs(((Context) (obj)), enn, flag, i1, bundle, bundle1, s3);
        } else
        {
            if (!TextUtils.isEmpty(s3))
            {
                throw new IllegalArgumentException("Search aggregation doesn't support filtering by gaia-id");
            }
            enn = new frt(((Context) (obj)), enn, flag, i1, bundle, bundle1, s2);
        }
        obj = new fsr(enn);
        try
        {
            ((fsb)super.m()).a(((fry) (obj)), s, s1, s2, 7, flag1, l, i1, s3, flag2, j1, 3);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ((fsr) (obj)).a(8, null, null);
        }
        enn.b();
    }

    public void a(enn enn, boolean flag, int l)
    {
        super.k();
        enn = new fsl(enn);
        try
        {
            ((fsb)super.m()).a(enn, false, flag, null, null, l);
            return;
        }
        catch (RemoteException remoteexception)
        {
            enn.a(8, null, null);
        }
    }

    public void a(fpg fpg)
    {
        HashMap hashmap = h;
        hashmap;
        JVM INSTR monitorenter ;
        boolean flag;
        super.k();
        flag = h.containsKey(fpg);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        h.remove(fpg);
        hashmap;
        JVM INSTR monitorexit ;
        return;
        fss fss1 = (fss)h.get(fpg);
        fss1.a();
        ((fsb)super.m()).a(fss1, false, null, null, 0);
        h.remove(fpg);
        hashmap;
        JVM INSTR monitorexit ;
        return;
        fpg;
        hashmap;
        JVM INSTR monitorexit ;
        throw fpg;
        Exception exception;
        exception;
        h.remove(fpg);
        throw exception;
    }

    public void a(String s, String s1, long l, boolean flag, boolean flag1)
    {
        super.k();
        ((fsb)super.m()).a(s, s1, l, flag, flag1);
    }

    protected String b()
    {
        return "com.google.android.gms.people.internal.IPeopleService";
    }

    public void c()
    {
        HashMap hashmap = h;
        hashmap;
        JVM INSTR monitorenter ;
        Iterator iterator;
        if (!d())
        {
            break MISSING_BLOCK_LABEL_94;
        }
        iterator = h.values().iterator();
_L1:
        fss fss1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_94;
        }
        fss1 = (fss)iterator.next();
        fss1.a();
        ((fsb)super.m()).a(fss1, false, null, null, 0);
          goto _L1
        Object obj;
        obj;
        g.m(5);
          goto _L1
        Exception exception;
        exception;
        hashmap;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        g.m(5);
          goto _L1
        h.clear();
        hashmap;
        JVM INSTR monitorexit ;
        super.c();
        return;
    }

    protected Bundle j()
    {
        Bundle bundle = new Bundle();
        bundle.putString("social_client_application_id", e);
        bundle.putString("real_client_package_name", f);
        bundle.putBoolean("support_new_image_callback", true);
        return bundle;
    }
}
