// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.google.android.apps.hangouts.phone.BabelGatewayActivity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.List;

public final class ckj extends bgs
{

    final BabelGatewayActivity d;

    public ckj(BabelGatewayActivity babelgatewayactivity)
    {
        d = babelgatewayactivity;
        super();
    }

    public String a()
    {
        return null;
    }

    protected void a(did did1)
    {
        super.a(did1);
        List list = ((cym)did1.c()).k();
        int i;
        if (list != null)
        {
            i = list.size();
        } else
        {
            i = 0;
        }
        if (i != BabelGatewayActivity.k(d).length)
        {
            eev.g("Babel", "BabelGatewayActivity: Entity lookup returned wrong number of entities");
            BabelGatewayActivity.a(d, l.bU);
            return;
        }
        BabelGatewayActivity.a(d, new String[i]);
        int j = 0;
        while (j < i) 
        {
            did1 = (eeh)list.get(j);
            Object obj;
            if (did1 == null)
            {
                did1 = null;
            } else
            {
                did1 = (cfz[])((eeh) (did1)).b;
            }
            if (did1 != null)
            {
                obj = did1[0];
            } else
            {
                obj = null;
            }
            if (obj == null)
            {
                eev.f("Babel", "BabelGatewayActivity: Could not resolve some gaiaId's");
                BabelGatewayActivity.a(d, l.bU);
                return;
            }
            gdv.a(Integer.valueOf(1), Integer.valueOf(did1.length));
            String as[] = BabelGatewayActivity.l(d);
            if (!TextUtils.isEmpty(((cfz) (obj)).e))
            {
                did1 = ((cfz) (obj)).e;
            } else
            if (!TextUtils.isEmpty(((cfz) (obj)).f))
            {
                did1 = ((cfz) (obj)).f;
            } else
            {
                did1 = null;
            }
            as[j] = did1;
            j++;
        }
        BabelGatewayActivity.m(d);
    }

    protected void a(Exception exception)
    {
        super.a(exception);
        BabelGatewayActivity.a(d, l.bU);
    }

    public int b()
    {
        ArrayList arraylist = new ArrayList();
        String as[] = BabelGatewayActivity.k(d);
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(dbi.a(as[i]));
        }

        return RealTimeChatService.a(BabelGatewayActivity.c(d), arraylist, null, true);
    }

    public Class e()
    {
        return cwh;
    }

    public Class f()
    {
        return cym;
    }
}
