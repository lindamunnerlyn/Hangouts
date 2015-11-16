// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.util.Base64;
import com.google.android.gms.wearable.Asset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class fvj
{

    private final Uri a;
    private final fvi b;

    private fvj(fvf fvf1)
    {
        a = fvf1.a();
        b = b((fvf)fvf1.f());
    }

    public static fvj a(fvf fvf1)
    {
        if (fvf1 == null)
        {
            throw new IllegalStateException("provided dataItem is null");
        } else
        {
            return new fvj(fvf1);
        }
    }

    private static fvi b(fvf fvf1)
    {
        if (fvf1.b() == null && fvf1.c().size() > 0)
        {
            throw new IllegalArgumentException("Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.");
        }
        if (fvf1.b() == null)
        {
            return new fvi();
        }
        Object obj;
        int j;
        obj = new ArrayList();
        j = fvf1.c().size();
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        fvg fvg1 = (fvg)fvf1.c().get(Integer.toString(i));
        if (fvg1 == null)
        {
            try
            {
                throw new IllegalStateException((new StringBuilder("Cannot find DataItemAsset referenced in data at ")).append(i).append(" for ").append(fvf1).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            (new StringBuilder("Unable to parse datamap from dataItem. uri=")).append(fvf1.a()).append(", data=").append(Base64.encodeToString(fvf1.b(), 0));
            throw new IllegalStateException((new StringBuilder("Unable to parse datamap from dataItem.  uri=")).append(fvf1.a()).toString(), ((Throwable) (obj)));
        }
        ((List) (obj)).add(Asset.a(fvg1.a()));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        obj = g.a(new fga(fgb.a(fvf1.b()), ((List) (obj))));
        return ((fvi) (obj));
    }

    public Uri a()
    {
        return a;
    }

    public fvi b()
    {
        return b;
    }
}
