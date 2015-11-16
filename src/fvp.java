// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import java.util.List;

public final class fvp
{

    private final PutDataRequest a;
    private final fvi b = new fvi();

    public fvp(PutDataRequest putdatarequest, fvi fvi1)
    {
        a = putdatarequest;
        if (fvi1 != null)
        {
            b.a(fvi1);
        }
    }

    public static fvp a(String s)
    {
        return new fvp(PutDataRequest.a(s), null);
    }

    public Uri a()
    {
        return a.a();
    }

    public fvi b()
    {
        return b;
    }

    public PutDataRequest c()
    {
        fga fga1 = g.a(b);
        a.a(fgm.a(fga1.a));
        int j = fga1.b.size();
        for (int i = 0; i < j; i++)
        {
            String s = Integer.toString(i);
            Asset asset = (Asset)fga1.b.get(i);
            if (s == null)
            {
                throw new IllegalStateException((new StringBuilder("asset key cannot be null: ")).append(asset).toString());
            }
            if (asset == null)
            {
                throw new IllegalStateException((new StringBuilder("asset cannot be null: key=")).append(s).toString());
            }
            if (Log.isLoggable("DataMap", 3))
            {
                (new StringBuilder("asPutDataRequest: adding asset: ")).append(s).append(" ").append(asset);
            }
            a.a(s, asset);
        }

        return a;
    }
}
