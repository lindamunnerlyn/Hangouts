// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.Status;

final class emh extends emg
{

    final ely a;
    private final LogEventParcelable b;

    emh(ely ely1, LogEventParcelable logeventparcelable, emy emy)
    {
        a = ely1;
        super(emy);
        b = logeventparcelable;
    }

    protected enh a(Status status)
    {
        return status;
    }

    protected void a(emw emw)
    {
        emw = (elr)emw;
        emi emi1 = new emi(this);
        try
        {
            ely.a(b);
        }
        // Misplaced declaration of an exception variable
        catch (emw emw)
        {
            Log.e("ClearcutLoggerApiImpl", (new StringBuilder("MessageNanoProducer ")).append(b.f.toString()).append(" threw: ").append(emw.toString()).toString());
            return;
        }
        emw.a(emi1, b);
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof emh))
        {
            return false;
        } else
        {
            obj = (emh)obj;
            return b.equals(((emh) (obj)).b);
        }
    }

    public String toString()
    {
        return (new StringBuilder("MethodImpl(")).append(b).append(")").toString();
    }
}
