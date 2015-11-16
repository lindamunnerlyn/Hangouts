// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.List;

final class fvw extends fxj
{

    boolean a;
    final fvv b;

    fvw(fvv fvv1)
    {
        b = fvv1;
        super();
        a = false;
        a = fvv1 instanceof fwg;
    }

    public void a(DataHolder dataholder)
    {
label0:
        {
            if (Log.isLoggable("WearableLS", 3))
            {
                (new StringBuilder("onDataItemChanged: ")).append(b.r).append(": ").append(dataholder);
            }
            fvv.a(b);
            synchronized (b.t)
            {
                if (!b.u)
                {
                    break label0;
                }
                dataholder.f();
            }
            return;
        }
        b.s.post(new fvx(this, dataholder));
        obj;
        JVM INSTR monitorexit ;
        return;
        dataholder;
        obj;
        JVM INSTR monitorexit ;
        throw dataholder;
    }

    public void a(AmsEntityUpdateParcelable amsentityupdateparcelable)
    {
        fwg fwg1;
        if (Log.isLoggable("WearableLS", 3))
        {
            (new StringBuilder("onEntityUpdate: ")).append(amsentityupdateparcelable);
        }
        if (!a)
        {
            return;
        }
        fvv.a(b);
        fwg1 = (fwg)b;
        synchronized (b.t)
        {
            if (!b.u)
            {
                break MISSING_BLOCK_LABEL_74;
            }
        }
        return;
        amsentityupdateparcelable;
        obj;
        JVM INSTR monitorexit ;
        throw amsentityupdateparcelable;
        b.s.post(new fwe(this, fwg1, amsentityupdateparcelable));
        obj;
        JVM INSTR monitorexit ;
    }

    public void a(AncsNotificationParcelable ancsnotificationparcelable)
    {
        fwg fwg1;
        if (Log.isLoggable("WearableLS", 3))
        {
            (new StringBuilder("onNotificationReceived: ")).append(ancsnotificationparcelable);
        }
        if (!a)
        {
            return;
        }
        fvv.a(b);
        fwg1 = (fwg)b;
        synchronized (b.t)
        {
            if (!b.u)
            {
                break MISSING_BLOCK_LABEL_74;
            }
        }
        return;
        ancsnotificationparcelable;
        obj;
        JVM INSTR monitorexit ;
        throw ancsnotificationparcelable;
        b.s.post(new fwd(this, fwg1, ancsnotificationparcelable));
        obj;
        JVM INSTR monitorexit ;
    }

    public void a(CapabilityInfoParcelable capabilityinfoparcelable)
    {
label0:
        {
            if (Log.isLoggable("WearableLS", 3))
            {
                (new StringBuilder("onConnectedCapabilityChanged: ")).append(capabilityinfoparcelable);
            }
            fvv.a(b);
            synchronized (b.t)
            {
                if (!b.u)
                {
                    break label0;
                }
            }
            return;
        }
        b.s.post(new fwc(this, capabilityinfoparcelable));
        obj;
        JVM INSTR monitorexit ;
        return;
        capabilityinfoparcelable;
        obj;
        JVM INSTR monitorexit ;
        throw capabilityinfoparcelable;
    }

    public void a(ChannelEventParcelable channeleventparcelable)
    {
label0:
        {
            if (Log.isLoggable("WearableLS", 3))
            {
                (new StringBuilder("onChannelEvent: ")).append(channeleventparcelable);
            }
            fvv.a(b);
            synchronized (b.t)
            {
                if (!b.u)
                {
                    break label0;
                }
            }
            return;
        }
        b.s.post(new fwf(this, channeleventparcelable));
        obj;
        JVM INSTR monitorexit ;
        return;
        channeleventparcelable;
        obj;
        JVM INSTR monitorexit ;
        throw channeleventparcelable;
    }

    public void a(MessageEventParcelable messageeventparcelable)
    {
label0:
        {
            if (Log.isLoggable("WearableLS", 3))
            {
                (new StringBuilder("onMessageReceived: ")).append(messageeventparcelable);
            }
            fvv.a(b);
            synchronized (b.t)
            {
                if (!b.u)
                {
                    break label0;
                }
            }
            return;
        }
        b.s.post(new fvy(this, messageeventparcelable));
        obj;
        JVM INSTR monitorexit ;
        return;
        messageeventparcelable;
        obj;
        JVM INSTR monitorexit ;
        throw messageeventparcelable;
    }

    public void a(NodeParcelable nodeparcelable)
    {
label0:
        {
            if (Log.isLoggable("WearableLS", 3))
            {
                (new StringBuilder("onPeerConnected: ")).append(b.r).append(": ").append(nodeparcelable);
            }
            fvv.a(b);
            synchronized (b.t)
            {
                if (!b.u)
                {
                    break label0;
                }
            }
            return;
        }
        b.s.post(new fvz(this, nodeparcelable));
        obj;
        JVM INSTR monitorexit ;
        return;
        nodeparcelable;
        obj;
        JVM INSTR monitorexit ;
        throw nodeparcelable;
    }

    public void a(List list)
    {
label0:
        {
            if (Log.isLoggable("WearableLS", 3))
            {
                (new StringBuilder("onConnectedNodes: ")).append(b.r).append(": ").append(list);
            }
            fvv.a(b);
            synchronized (b.t)
            {
                if (!b.u)
                {
                    break label0;
                }
            }
            return;
        }
        b.s.post(new fwb(this, list));
        obj;
        JVM INSTR monitorexit ;
        return;
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
    }

    public void b(NodeParcelable nodeparcelable)
    {
label0:
        {
            if (Log.isLoggable("WearableLS", 3))
            {
                (new StringBuilder("onPeerDisconnected: ")).append(b.r).append(": ").append(nodeparcelable);
            }
            fvv.a(b);
            synchronized (b.t)
            {
                if (!b.u)
                {
                    break label0;
                }
            }
            return;
        }
        b.s.post(new fwa(this, nodeparcelable));
        obj;
        JVM INSTR monitorexit ;
        return;
        nodeparcelable;
        obj;
        JVM INSTR monitorexit ;
        throw nodeparcelable;
    }
}
