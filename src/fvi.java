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

final class fvi
{

    private final Map a = new HashMap();

    fvi()
    {
    }

    public void a(IBinder ibinder)
    {
        Map map = a;
        map;
        JVM INSTR monitorenter ;
        fvy fvy1;
        Iterator iterator;
        ibinder = fvg.a(ibinder);
        fvy1 = new fvy();
        iterator = a.entrySet().iterator();
_L1:
        java.util.Map.Entry entry;
        fwd fwd1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_168;
        }
        entry = (java.util.Map.Entry)iterator.next();
        fwd1 = (fwd)entry.getValue();
        ibinder.a(fvy1, new AddListenerRequest(fwd1));
        if (Log.isLoggable("WearableClient", 2))
        {
            (new StringBuilder("onPostInitHandler: added: ")).append(entry.getKey()).append("/").append(fwd1);
        }
          goto _L1
        RemoteException remoteexception;
        remoteexception;
        (new StringBuilder("onPostInitHandler: Didn't add: ")).append(entry.getKey()).append("/").append(fwd1);
          goto _L1
        ibinder;
        map;
        JVM INSTR monitorexit ;
        throw ibinder;
        map;
        JVM INSTR monitorexit ;
    }

    public void a(fwb fwb1)
    {
        Map map = a;
        map;
        JVM INSTR monitorenter ;
        fvy fvy1;
        Iterator iterator;
        fvy1 = new fvy();
        iterator = a.entrySet().iterator();
_L2:
        java.util.Map.Entry entry;
        fwd fwd1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_190;
            }
            entry = (java.util.Map.Entry)iterator.next();
            fwd1 = (fwd)entry.getValue();
        } while (fwd1 == null);
        boolean flag;
        fwd1.a();
        flag = fwb1.d();
        if (!flag) goto _L2; else goto _L1
_L1:
        ((fvf)fwb1.n()).a(fvy1, new RemoveListenerRequest(fwd1));
        if (Log.isLoggable("WearableClient", 2))
        {
            (new StringBuilder("disconnect: removed: ")).append(entry.getKey()).append("/").append(fwd1);
        }
          goto _L2
        RemoteException remoteexception;
        remoteexception;
        (new StringBuilder("disconnect: Didn't remove: ")).append(entry.getKey()).append("/").append(fwd1);
          goto _L2
        fwb1;
        map;
        JVM INSTR monitorexit ;
        throw fwb1;
        a.clear();
        map;
        JVM INSTR monitorexit ;
    }
}
