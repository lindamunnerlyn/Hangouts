// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

final class bym
    implements ffx
{

    final double a;
    final double b;
    final String c;
    final ad d;
    final byk e;

    bym(byk byk, double d1, double d2, String s, ad ad1)
    {
        e = byk;
        a = d1;
        b = d2;
        c = s;
        d = ad1;
        super();
    }

    public void a()
    {
        double d1 = a;
        double d2 = b;
        Object obj = (new StringBuilder(53)).append("geo:").append(d1).append(",").append(d2).toString();
        Object obj1 = new StringBuilder();
        ((StringBuilder) (obj1)).append(a);
        ((StringBuilder) (obj1)).append(",");
        ((StringBuilder) (obj1)).append(b);
        if (!TextUtils.isEmpty(c))
        {
            ((StringBuilder) (obj1)).append("(");
            ((StringBuilder) (obj1)).append(c);
            ((StringBuilder) (obj1)).append(")");
        }
        obj1 = Uri.encode(((StringBuilder) (obj1)).toString());
        obj = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder(String.valueOf(obj).length() + 8 + String.valueOf(obj1).length())).append(((String) (obj))).append("?q=").append(((String) (obj1))).append("&z=16").toString()));
        d.startActivity(((Intent) (obj)));
    }
}
