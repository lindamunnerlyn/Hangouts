// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.google.android.apps.hangouts.phone.BabelGatewayActivity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.List;

public final class cje extends bgg
{

    final BabelGatewayActivity d;

    public cje(BabelGatewayActivity babelgatewayactivity)
    {
        d = babelgatewayactivity;
        super();
    }

    public String a()
    {
        return null;
    }

    protected void a(dgu dgu1)
    {
        super.a(dgu1);
        List list = ((cwi)dgu1.c()).k();
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
            ebw.g("Babel", "BabelGatewayActivity: Entity lookup returned wrong number of entities");
            BabelGatewayActivity.a(d, l.ca);
            return;
        }
        BabelGatewayActivity.a(d, new String[i]);
        int j = 0;
        while (j < i) 
        {
            dgu1 = (ebj)list.get(j);
            Object obj;
            if (dgu1 == null)
            {
                dgu1 = null;
            } else
            {
                dgu1 = (ceu[])((ebj) (dgu1)).b;
            }
            if (dgu1 != null)
            {
                obj = dgu1[0];
            } else
            {
                obj = null;
            }
            if (obj == null)
            {
                ebw.f("Babel", "BabelGatewayActivity: Could not resolve some gaiaId's");
                BabelGatewayActivity.a(d, l.ca);
                return;
            }
            gbh.a(Integer.valueOf(1), Integer.valueOf(dgu1.length));
            String as[] = BabelGatewayActivity.l(d);
            if (!TextUtils.isEmpty(((ceu) (obj)).e))
            {
                dgu1 = ((ceu) (obj)).e;
            } else
            if (!TextUtils.isEmpty(((ceu) (obj)).f))
            {
                dgu1 = ((ceu) (obj)).f;
            } else
            {
                dgu1 = null;
            }
            as[j] = dgu1;
            j++;
        }
        BabelGatewayActivity.m(d);
    }

    protected void a(Exception exception)
    {
        super.a(exception);
        BabelGatewayActivity.a(d, l.ca);
    }

    public int b()
    {
        ArrayList arraylist = new ArrayList();
        String as[] = BabelGatewayActivity.k(d);
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(dac.a(as[i]));
        }

        return RealTimeChatService.a(BabelGatewayActivity.c(d), arraylist, null, true);
    }

    public Class e()
    {
        return cud;
    }

    public Class f()
    {
        return cwi;
    }
}
