// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.IntentFilter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.List;

public final class fwd extends fvd
{

    private fsn a;
    private fsn b;
    private fsv c;
    private ftf d;
    private fsn e;
    private fsn f;
    private fsn g;
    private fsn h;
    private final IntentFilter i[];
    private final String j;
    private final String k;

    public void a()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
    }

    public void a(DataHolder dataholder)
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        c.a(new fsy(dataholder));
        dataholder.i();
        return;
        Exception exception;
        exception;
        dataholder.i();
        throw exception;
        dataholder.i();
        return;
    }

    public void a(AmsEntityUpdateParcelable amsentityupdateparcelable)
    {
    }

    public void a(AncsNotificationParcelable ancsnotificationparcelable)
    {
    }

    public void a(CapabilityInfoParcelable capabilityinfoparcelable)
    {
    }

    public void a(ChannelEventParcelable channeleventparcelable)
    {
        if (g != null)
        {
            channeleventparcelable.a();
        }
    }

    public void a(MessageEventParcelable messageeventparcelable)
    {
        if (d != null)
        {
            d.a(messageeventparcelable);
        }
    }

    public void a(NodeParcelable nodeparcelable)
    {
    }

    public void a(List list)
    {
    }

    public void b(NodeParcelable nodeparcelable)
    {
    }

    public IntentFilter[] b()
    {
        return i;
    }

    public String c()
    {
        return j;
    }

    public String d()
    {
        return k;
    }
}
