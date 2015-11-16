// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.Status;

final class ejg extends ejf
{

    final eix a;
    private final LogEventParcelable b;

    ejg(eix eix1, LogEventParcelable logeventparcelable, ejx ejx)
    {
        a = eix1;
        super(ejx);
        b = logeventparcelable;
    }

    protected ekg a(Status status)
    {
        return status;
    }

    protected void a(ejv ejv)
    {
        ejv = (eiq)ejv;
        ejh ejh1 = new ejh(this);
        try
        {
            eix.a(b);
        }
        // Misplaced declaration of an exception variable
        catch (ejv ejv)
        {
            Log.e("ClearcutLoggerApiImpl", (new StringBuilder("MessageNanoProducer ")).append(b.f.toString()).append(" threw: ").append(ejv.toString()).toString());
            return;
        }
        ejv.a(ejh1, b);
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof ejg))
        {
            return false;
        } else
        {
            obj = (ejg)obj;
            return b.equals(((ejg) (obj)).b);
        }
    }

    public String toString()
    {
        return (new StringBuilder("MethodImpl(")).append(b).append(")").toString();
    }
}
