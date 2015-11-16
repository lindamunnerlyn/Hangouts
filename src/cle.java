// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import com.google.android.apps.hangouts.fragments.BabelPhotoViewFragment;

public final class cle extends abf
{

    final boolean j = false;

    public cle(Context context, ap ap, Cursor cursor, float f)
    {
        super(context, ap, null, f, false);
    }

    public ad a(Cursor cursor, int i)
    {
        Object obj = b(cursor);
        String s = c(cursor);
        boolean flag2 = d(cursor);
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj == null)
        {
            flag = flag1;
            if (flag2)
            {
                flag = true;
            }
        }
        aaj aaj1 = g.a(a, abg);
        aaj1.c(((String) (obj))).d(s).a(j).a(h);
        obj = aaj1.b();
        ((Intent) (obj)).putExtra("content_type", cursor.getString(cursor.getColumnIndex("contentType")));
        return BabelPhotoViewFragment.b(((Intent) (obj)), i, flag);
    }
}
