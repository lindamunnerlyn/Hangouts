// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.database.Cursor;

final class auu
    implements Runnable
{

    final aut a;

    auu(aut aut1)
    {
        a = aut1;
        super();
    }

    public void run()
    {
        Object obj = new aow(g.nU, a.c);
        Object obj1 = ((aow) (obj)).e();
        Object obj2 = a.b;
        obj2 = ((apv) (obj1)).a("conversation_participants_view", new String[] {
            "gaia_id", "chat_id"
        }, "conversation_id=?", new String[] {
            obj2
        }, null);
        obj1 = new ContentValues();
        ((ContentValues) (obj1)).put("status", Integer.valueOf(1));
        int i;
        if (a.a)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        ((ContentValues) (obj1)).put("inviter_affinity", Integer.valueOf(i));
        if (((Cursor) (obj2)).moveToLast())
        {
            ((ContentValues) (obj1)).put("inviter_gaia_id", ((Cursor) (obj2)).getString(0));
            ((ContentValues) (obj1)).put("inviter_chat_id", ((Cursor) (obj2)).getString(1));
        }
        ((Cursor) (obj2)).close();
        ((ContentValues) (obj1)).put("self_watermark", Integer.valueOf(0));
        ((ContentValues) (obj1)).put("chat_watermark", Integer.valueOf(0));
        ((ContentValues) (obj1)).put("hangout_watermark", Integer.valueOf(0));
        if (a.a)
        {
            ((ContentValues) (obj1)).put("notification_level", Integer.valueOf(30));
        }
        i = ((aow) (obj)).e().a("conversations", ((ContentValues) (obj1)), "conversation_id=?", new String[] {
            a.b
        });
        obj = a.b;
        obj1 = String.valueOf(((ContentValues) (obj1)).getAsString("inviter_chat_id"));
        eev.a("Babel", (new StringBuilder(String.valueOf(obj).length() + 74 + String.valueOf(obj1).length())).append("modifying ").append(((String) (obj))).append(" pretend invite status with inviter_id ").append(((String) (obj1))).append(" updated ").append(i).append(" rows").toString());
        aoq.a(a.c);
        cfo.a(g.nU, a.c);
    }
}
