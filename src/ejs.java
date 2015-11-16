// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.view.View;

final class ejs
    implements android.view.View.OnClickListener
{

    final ad a;
    final ejr b;

    ejs(ejr ejr1, ad ad1)
    {
        b = ejr1;
        a = ad1;
        super();
    }

    public void onClick(View view)
    {
        if (TextUtils.isEmpty(ejr.a(b)))
        {
            if (eev.a("Babel", 3))
            {
                eev.d("Babel", "VideoAttachmentHandler could not load video");
            }
            ejr.b(b);
        }
        if (!TextUtils.isEmpty(ejr.a(b)))
        {
            if (eev.a("Babel", 3))
            {
                view = String.valueOf(ejr.a(b));
                if (view.length() != 0)
                {
                    view = "VideoAttachmentHandler loaded urlString: ".concat(view);
                } else
                {
                    view = new String("VideoAttachmentHandler loaded urlString: ");
                }
                eev.d("Babel", view);
            }
            a.startActivity(g.c(ejr.a(b), "video/mp4"));
        }
    }
}
