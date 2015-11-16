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

final class ftq extends fvd
{

    boolean a;
    final ftp b;

    ftq(ftp ftp1)
    {
        b = ftp1;
        super();
        a = false;
        a = ftp1 instanceof fua;
    }

    public void a(DataHolder dataholder)
    {
label0:
        {
            if (Log.isLoggable("WearableLS", 3))
            {
                (new StringBuilder("onDataItemChanged: ")).append(ftp.a(b)).append(": ").append(dataholder);
            }
            ftp.b(b);
            synchronized (ftp.c(b))
            {
                if (!ftp.d(b))
                {
                    break label0;
                }
                dataholder.i();
            }
            return;
        }
        ftp.e(b).post(new ftr(this, dataholder));
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
        fua fua1;
        if (Log.isLoggable("WearableLS", 3))
        {
            (new StringBuilder("onEntityUpdate: ")).append(amsentityupdateparcelable);
        }
        if (!a)
        {
            return;
        }
        ftp.b(b);
        fua1 = (fua)b;
        synchronized (ftp.c(b))
        {
            if (!ftp.d(b))
            {
                break MISSING_BLOCK_LABEL_74;
            }
        }
        return;
        amsentityupdateparcelable;
        obj;
        JVM INSTR monitorexit ;
        throw amsentityupdateparcelable;
        ftp.e(b).post(new fty(this, fua1, amsentityupdateparcelable));
        obj;
        JVM INSTR monitorexit ;
    }

    public void a(AncsNotificationParcelable ancsnotificationparcelable)
    {
        fua fua1;
        if (Log.isLoggable("WearableLS", 3))
        {
            (new StringBuilder("onNotificationReceived: ")).append(ancsnotificationparcelable);
        }
        if (!a)
        {
            return;
        }
        ftp.b(b);
        fua1 = (fua)b;
        synchronized (ftp.c(b))
        {
            if (!ftp.d(b))
            {
                break MISSING_BLOCK_LABEL_74;
            }
        }
        return;
        ancsnotificationparcelable;
        obj;
        JVM INSTR monitorexit ;
        throw ancsnotificationparcelable;
        ftp.e(b).post(new ftx(this, fua1, ancsnotificationparcelable));
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
            ftp.b(b);
            synchronized (ftp.c(b))
            {
                if (!ftp.d(b))
                {
                    break label0;
                }
            }
            return;
        }
        ftp.e(b).post(new ftw(this, capabilityinfoparcelable));
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
            ftp.b(b);
            synchronized (ftp.c(b))
            {
                if (!ftp.d(b))
                {
                    break label0;
                }
            }
            return;
        }
        ftp.e(b).post(new ftz(this, channeleventparcelable));
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
            ftp.b(b);
            synchronized (ftp.c(b))
            {
                if (!ftp.d(b))
                {
                    break label0;
                }
            }
            return;
        }
        ftp.e(b).post(new fts(this, messageeventparcelable));
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
                (new StringBuilder("onPeerConnected: ")).append(ftp.a(b)).append(": ").append(nodeparcelable);
            }
            ftp.b(b);
            synchronized (ftp.c(b))
            {
                if (!ftp.d(b))
                {
                    break label0;
                }
            }
            return;
        }
        ftp.e(b).post(new ftt(this, nodeparcelable));
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
                (new StringBuilder("onConnectedNodes: ")).append(ftp.a(b)).append(": ").append(list);
            }
            ftp.b(b);
            synchronized (ftp.c(b))
            {
                if (!ftp.d(b))
                {
                    break label0;
                }
            }
            return;
        }
        ftp.e(b).post(new ftv(this, list));
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
                (new StringBuilder("onPeerDisconnected: ")).append(ftp.a(b)).append(": ").append(nodeparcelable);
            }
            ftp.b(b);
            synchronized (ftp.c(b))
            {
                if (!ftp.d(b))
                {
                    break label0;
                }
            }
            return;
        }
        ftp.e(b).post(new ftu(this, nodeparcelable));
        obj;
        JVM INSTR monitorexit ;
        return;
        nodeparcelable;
        obj;
        JVM INSTR monitorexit ;
        throw nodeparcelable;
    }
}
