// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public final class fwb extends ena
{

    private final ExecutorService e = Executors.newCachedThreadPool();
    private final fvi f = new fvi();
    private final fvi g = new fvi();
    private final fvi h = new fvi();
    private final fvi i = new fvi();
    private final fvi j = new fvi();
    private final fvi k = new fvi();
    private final fvi l = new fvi();
    private final Map m = new HashMap();

    public fwb(Context context, Looper looper, eka eka, ekc ekc, emo emo)
    {
        super(context, looper, 14, emo, eka, ekc);
    }

    protected IInterface a(IBinder ibinder)
    {
        return fvg.a(ibinder);
    }

    protected String a()
    {
        return "com.google.android.gms.wearable.BIND";
    }

    protected void a(int i1, IBinder ibinder, Bundle bundle, int j1)
    {
        if (!Log.isLoggable("WearableClient", 2));
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        f.a(ibinder);
        g.a(ibinder);
        i.a(ibinder);
        j.a(ibinder);
        k.a(ibinder);
        l.a(ibinder);
        Map map = m;
        map;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m.values().iterator(); iterator.hasNext(); ((fvi)iterator.next()).a(ibinder)) { }
        break MISSING_BLOCK_LABEL_119;
        ibinder;
        map;
        JVM INSTR monitorexit ;
        throw ibinder;
        map;
        JVM INSTR monitorexit ;
_L2:
        super.a(i1, ibinder, bundle, j1);
        return;
    }

    public void a(ekm ekm)
    {
        ((fvf)n()).b(new fvx(ekm));
    }

    public void a(ekm ekm, Uri uri, int i1)
    {
        ((fvf)n()).a(new fvx(ekm), uri, i1);
    }

    public void a(ekm ekm, PutDataRequest putdatarequest)
    {
        for (Iterator iterator = putdatarequest.c().entrySet().iterator(); iterator.hasNext();)
        {
            Asset asset = (Asset)((java.util.Map.Entry)iterator.next()).getValue();
            if (asset.a() == null && asset.b() == null && asset.c() == null && asset.d() == null)
            {
                throw new IllegalArgumentException((new StringBuilder("Put for ")).append(putdatarequest.a()).append(" contains invalid asset: ").append(asset).toString());
            }
        }

        PutDataRequest putdatarequest1 = PutDataRequest.a(putdatarequest.a());
        putdatarequest1.a(putdatarequest.b());
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator1 = putdatarequest.c().entrySet().iterator(); iterator1.hasNext();)
        {
            Object obj = (java.util.Map.Entry)iterator1.next();
            Asset asset1 = (Asset)((java.util.Map.Entry) (obj)).getValue();
            if (asset1.a() == null)
            {
                putdatarequest1.a((String)((java.util.Map.Entry) (obj)).getKey(), (Asset)((java.util.Map.Entry) (obj)).getValue());
            } else
            {
                ParcelFileDescriptor aparcelfiledescriptor[];
                try
                {
                    aparcelfiledescriptor = ParcelFileDescriptor.createPipe();
                }
                // Misplaced declaration of an exception variable
                catch (ekm ekm)
                {
                    throw new IllegalStateException((new StringBuilder("Unable to create ParcelFileDescriptor for asset in request: ")).append(putdatarequest).toString(), ekm);
                }
                if (Log.isLoggable("WearableClient", 3))
                {
                    (new StringBuilder("processAssets: replacing data with FD in asset: ")).append(asset1).append(" read:").append(aparcelfiledescriptor[0]).append(" write:").append(aparcelfiledescriptor[1]);
                }
                putdatarequest1.a((String)((java.util.Map.Entry) (obj)).getKey(), Asset.a(aparcelfiledescriptor[0]));
                obj = new FutureTask(new fwc(this, aparcelfiledescriptor[1], asset1.a()));
                arraylist.add(obj);
                e.submit(((Runnable) (obj)));
            }
        }

        ((fvf)n()).a(new fvz(ekm, arraylist), putdatarequest1);
    }

    public void a(ekm ekm, String s)
    {
        ((fvf)n()).d(new fvu(ekm), s);
    }

    public void a(ekm ekm, String s, String s1, byte abyte0[])
    {
        ((fvf)n()).a(new fwa(ekm), s, s1, abyte0);
    }

    protected String b()
    {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    public void b(ekm ekm, Uri uri, int i1)
    {
        ((fvf)n()).b(new fvw(ekm), uri, i1);
    }

    public void c()
    {
        f.a(this);
        g.a(this);
        i.a(this);
        j.a(this);
        k.a(this);
        l.a(this);
        Map map = m;
        map;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m.values().iterator(); iterator.hasNext(); ((fvi)iterator.next()).a(this)) { }
        break MISSING_BLOCK_LABEL_100;
        Exception exception;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
        map;
        JVM INSTR monitorexit ;
        super.c();
        return;
    }
}
