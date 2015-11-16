// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.view.View;

final class egq
    implements android.view.View.OnClickListener
{

    final ad a;
    final egp b;

    egq(egp egp1, ad ad1)
    {
        b = egp1;
        a = ad1;
        super();
    }

    public void onClick(View view)
    {
        if (TextUtils.isEmpty(egp.a(b)))
        {
            if (ebw.a("Babel", 3))
            {
                ebw.d("Babel", "VideoAttachmentHandler could not load video");
            }
            egp.b(b);
        }
        if (!TextUtils.isEmpty(egp.a(b)))
        {
            if (ebw.a("Babel", 3))
            {
                view = String.valueOf(egp.a(b));
                if (view.length() != 0)
                {
                    view = "VideoAttachmentHandler loaded urlString: ".concat(view);
                } else
                {
                    view = new String("VideoAttachmentHandler loaded urlString: ");
                }
                ebw.d("Babel", view);
            }
            a.startActivity(g.c(egp.a(b), "video/mp4"));
        }
    }
}
