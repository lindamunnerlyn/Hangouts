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

public final class fpo extends ena
{

    private static volatile Bundle i;
    private static volatile Bundle j;
    public final String e;
    public final String f;
    public final Context g;
    private final HashMap h = new HashMap();
    private Long k;

    public fpo(Context context, Looper looper, eka eka, ekc ekc, String s, emo emo1)
    {
        super(context.getApplicationContext(), looper, 5, emo1, eka, ekc);
        k = null;
        g = context;
        e = s;
        f = emo1.f();
    }

    public static Status a(int l, Bundle bundle)
    {
        return new Status(l, null, b(bundle));
    }

    private fpz a(ejx ejx1, fmm fmm)
    {
label0:
        {
            synchronized (h)
            {
                if (!h.containsKey(fmm))
                {
                    break label0;
                }
                ejx1 = (fpz)h.get(fmm);
            }
            return ejx1;
        }
        ejx1 = new fpz(ejx1.a(fmm));
        h.put(fmm, ejx1);
        hashmap;
        JVM INSTR monitorexit ;
        return ejx1;
        ejx1;
        hashmap;
        JVM INSTR monitorexit ;
        throw ejx1;
    }

    static fqy a(DataHolder dataholder)
    {
        if (dataholder == null)
        {
            return null;
        } else
        {
            return new fqy(dataholder, new foi(j), new foh(i));
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
        for.a(bundle.getBoolean("use_contactables_api", true));
        fpn.a.a(bundle);
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
        return fph.a(ibinder);
    }

    public ens a(ekm ekm, long l)
    {
        super.l();
        ekm = new fpr(ekm);
        ens ens;
        try
        {
            ens = ((fpg)super.n()).b(ekm, l, true);
        }
        catch (RemoteException remoteexception)
        {
            ekm.a(8, null, null, null);
            return null;
        }
        return ens;
    }

    public ens a(ekm ekm, String s, String s1)
    {
        ekm = new fpr(ekm);
        try
        {
            s = ((fpg)super.n()).c(ekm, s, s1, 0);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ekm.a(8, null, null, null);
            return null;
        }
        return s;
    }

    public ens a(ekm ekm, String s, String s1, int l, int i1)
    {
        ekm = new fpr(ekm);
        try
        {
            s = ((fpg)super.n()).b(ekm, s, s1, l, i1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ekm.a(8, null, null, null);
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

    public void a(ejx ejx1, fmm fmm, String s, String s1, int l)
    {
        super.l();
        synchronized (h)
        {
            ejx1 = a(ejx1, fmm);
            ((fpg)super.n()).a(ejx1, true, s, s1, l);
        }
        return;
        ejx1;
        hashmap;
        JVM INSTR monitorexit ;
        throw ejx1;
    }

    public void a(ekm ekm, String s, String s1, fme fme1)
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
        obj = fme1;
        if (fme1 == null)
        {
            obj = fme.a;
        }
        fme1 = ((fme) (obj)).b();
        collection = ((fme) (obj)).c();
        l = ((fme) (obj)).d();
        flag = ((fme) (obj)).e();
        l1 = ((fme) (obj)).f();
        s2 = ((fme) (obj)).g();
        i1 = ((fme) (obj)).h();
        j1 = ((fme) (obj)).i();
        k1 = ((fme) (obj)).j();
        super.l();
        obj = new fps(ekm);
        fpg fpg1 = (fpg)super.n();
        if (collection != null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        ekm = null;
_L1:
        try
        {
            fpg1.a(((fpd) (obj)), s, s1, fme1, ekm, l, flag, l1, s2, i1, j1, k1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ekm ekm)
        {
            ((fps) (obj)).a(8, null, null);
        }
        break MISSING_BLOCK_LABEL_159;
        ekm = new ArrayList(collection);
          goto _L1
    }

    public void a(ekm ekm, String s, String s1, String s2, int l, String s3, boolean flag)
    {
        super.l();
        ekm = new fpy(ekm);
        try
        {
            ((fpg)super.n()).a(ekm, s, s1, s2, l, s3, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ekm.a(8, null, null);
        }
    }

    public void a(ekm ekm, String s, String s1, boolean flag, String s2, boolean flag1, int l, 
            int i1, String s3, boolean flag2, int j1)
    {
        super.l();
        if (j1 != 0 && TextUtils.isEmpty(s2))
        {
            g.m(5);
            j1 = 0;
        }
        ekm = for.a(super.a, new fov(ekm), flag, i1, i, j, s2, s3);
        fpx fpx1 = new fpx(ekm);
        try
        {
            ((fpg)super.n()).a(fpx1, s, s1, s2, 7, flag1, l, i1, s3, flag2, j1, 3);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            fpx1.a(8, null, null);
        }
        ekm.b();
    }

    public void a(ekm ekm, boolean flag, int l)
    {
        super.l();
        ekm = new fpq(ekm);
        try
        {
            ((fpg)super.n()).a(ekm, false, flag, null, null, l);
            return;
        }
        catch (RemoteException remoteexception)
        {
            ekm.a(8, null, null);
        }
    }

    public void a(fmm fmm)
    {
        HashMap hashmap = h;
        hashmap;
        JVM INSTR monitorenter ;
        boolean flag;
        super.l();
        flag = h.containsKey(fmm);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        h.remove(fmm);
        hashmap;
        JVM INSTR monitorexit ;
        return;
        fpz fpz1 = (fpz)h.get(fmm);
        fpz1.a();
        ((fpg)super.n()).a(fpz1, false, null, null, 0);
        h.remove(fmm);
        hashmap;
        JVM INSTR monitorexit ;
        return;
        fmm;
        hashmap;
        JVM INSTR monitorexit ;
        throw fmm;
        Exception exception;
        exception;
        h.remove(fmm);
        throw exception;
    }

    public void a(String s, String s1, long l, boolean flag, boolean flag1)
    {
        super.l();
        ((fpg)super.n()).a(s, s1, l, flag, flag1);
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
        fpz fpz1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_94;
        }
        fpz1 = (fpz)iterator.next();
        fpz1.a();
        ((fpg)super.n()).a(fpz1, false, null, null, 0);
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

    protected Bundle k()
    {
        Bundle bundle = new Bundle();
        bundle.putString("social_client_application_id", e);
        bundle.putString("real_client_package_name", f);
        bundle.putBoolean("support_new_image_callback", true);
        return bundle;
    }
}
