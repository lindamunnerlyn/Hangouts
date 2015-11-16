// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.wearable.internal.AddListenerRequest;
import com.google.android.gms.wearable.internal.RemoveListenerRequest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class fxo
{

    private final Map a = new HashMap();

    fxo()
    {
    }

    public void a(IBinder ibinder)
    {
        Map map = a;
        map;
        JVM INSTR monitorenter ;
        fyd fyd1;
        Iterator iterator;
        ibinder = fxm.a(ibinder);
        fyd1 = new fyd();
        iterator = a.entrySet().iterator();
_L1:
        java.util.Map.Entry entry;
        fyi fyi1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_168;
        }
        entry = (java.util.Map.Entry)iterator.next();
        fyi1 = (fyi)entry.getValue();
        ibinder.a(fyd1, new AddListenerRequest(fyi1));
        if (Log.isLoggable("WearableClient", 2))
        {
            (new StringBuilder("onPostInitHandler: added: ")).append(entry.getKey()).append("/").append(fyi1);
        }
          goto _L1
        RemoteException remoteexception;
        remoteexception;
        (new StringBuilder("onPostInitHandler: Didn't add: ")).append(entry.getKey()).append("/").append(fyi1);
          goto _L1
        ibinder;
        map;
        JVM INSTR monitorexit ;
        throw ibinder;
        map;
        JVM INSTR monitorexit ;
    }

    public void a(fyg fyg1)
    {
        Map map = a;
        map;
        JVM INSTR monitorenter ;
        fyd fyd1;
        Iterator iterator;
        fyd1 = new fyd();
        iterator = a.entrySet().iterator();
_L2:
        java.util.Map.Entry entry;
        fyi fyi1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_190;
            }
            entry = (java.util.Map.Entry)iterator.next();
            fyi1 = (fyi)entry.getValue();
        } while (fyi1 == null);
        boolean flag;
        fyi1.a();
        flag = fyg1.d();
        if (!flag) goto _L2; else goto _L1
_L1:
        ((fxl)fyg1.m()).a(fyd1, new RemoveListenerRequest(fyi1));
        if (Log.isLoggable("WearableClient", 2))
        {
            (new StringBuilder("disconnect: removed: ")).append(entry.getKey()).append("/").append(fyi1);
        }
          goto _L2
        RemoteException remoteexception;
        remoteexception;
        (new StringBuilder("disconnect: Didn't remove: ")).append(entry.getKey()).append("/").append(fyi1);
          goto _L2
        fyg1;
        map;
        JVM INSTR monitorexit ;
        throw fyg1;
        a.clear();
        map;
        JVM INSTR monitorexit ;
    }
}
