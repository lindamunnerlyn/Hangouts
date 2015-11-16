// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.apps.hangouts.content.EsProvider;
import java.util.List;

final class cdp extends ceb
{

    private static final boolean d;
    final cey a;
    final String b;
    final boolean c;

    private cdp(Cursor cursor, int i)
    {
        boolean flag = true;
        super();
        o = a(cursor);
        p = cel.b;
        r = cursor.getString(8);
        q = a(cursor.getString(7), r, o, i);
        a = new cey(cursor.getString(5), cursor.getString(6));
        b = cursor.getString(2);
        if (cursor.getInt(1) != 2)
        {
            flag = false;
        }
        c = flag;
        if (d)
        {
            cursor = String.valueOf(r);
            if (cursor.length() != 0)
            {
                cursor = "Invitation Line from ".concat(cursor);
            } else
            {
                cursor = new String("Invitation Line from ");
            }
            ebw.b("Babel", cursor);
        }
    }

    private static cda a(Cursor cursor)
    {
        String s1 = cursor.getString(2);
        String s2 = cursor.getString(3);
        String s = s2;
        if (TextUtils.isEmpty(s2))
        {
            s = s1;
        }
        int i = s1.split(",").length;
        s1 = cursor.getString(0);
        return new cda(s1, s1, cursor.getInt(1), s, cursor.getLong(4), true, i - 1, null, 2, 0L);
    }

    static cda b(int i)
    {
        Object obj;
        Object obj1 = null;
        Object obj2;
        try
        {
            obj = dbf.e(i);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (((ani) (obj)).q())
        {
            return null;
        }
        obj = ank.e(g.nS, i);
        if (obj == null) goto _L2; else goto _L3
_L3:
        obj = ((cey) (obj)).b;
        obj2 = EsProvider.a(EsProvider.h, i);
        obj2 = g.nS.getContentResolver().query(((android.net.Uri) (obj2)), cdq.a, "inviter_chat_id!=? AND notification_level!=10 AND is_pending_leave!=1 AND sort_timestamp>chat_watermark AND inviter_first_name IS NOT NULL", new String[] {
            obj
        }, "sort_timestamp DESC");
        if (obj2 == null) goto _L5; else goto _L4
_L4:
        if (!((Cursor) (obj2)).moveToFirst()) goto _L7; else goto _L6
_L6:
        obj = obj1;
        if (!d)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        ebw.b("Babel", "Some unseen invite notifications");
        obj = obj1;
_L9:
        obj1 = new cdp(((Cursor) (obj2)), i);
        if (((cdp) (obj1)).r == null || ((cdp) (obj1)).q == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        obj = a(((Cursor) (obj2)));
        ((cda) (obj)).h.add(obj1);
        obj1 = obj;
        if (((cda) (obj)).h.size() == 7)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        if (((Cursor) (obj2)).moveToNext()) goto _L9; else goto _L8
_L8:
        obj1 = obj;
        obj = obj1;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_193;
        }
        obj1.i = ((cda) (obj1)).h.size();
        obj = obj1;
_L12:
        ((Cursor) (obj2)).close();
_L10:
        return ((cda) (obj));
        obj;
        ((Cursor) (obj2)).close();
        throw obj;
_L7:
        obj = null;
        continue; /* Loop/switch isn't completed */
_L5:
        obj = null;
        if (true) goto _L10; else goto _L2
_L2:
        return null;
        if (true) goto _L12; else goto _L11
_L11:
    }

    int a(int i)
    {
        ani ani1 = dbf.e(i);
        if (ani1.q())
        {
            return 0;
        } else
        {
            return amz.b(ani1, o.a);
        }
    }

    static 
    {
        d = cdu.b;
    }
}
