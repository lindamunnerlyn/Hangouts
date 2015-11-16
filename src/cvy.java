// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;

class cvy extends cvn
{

    private static final long serialVersionUID = 1L;
    public final String h;
    public final long i;

    public cvy(ixg ixg, long l, long l1, String s)
    {
        super(ixg, l);
        h = s;
        i = l1;
    }

    public void a(aoe aoe1, dfb dfb)
    {
        String s1;
        super.a(aoe1, dfb);
        if (ebw.a("Babel", 3))
        {
            dfb = String.valueOf("processEventResponse response status: ");
            int j = c.b;
            String s = c.a;
            ebw.d("Babel", (new StringBuilder(String.valueOf(dfb).length() + 29 + String.valueOf(s).length())).append(dfb).append(j).append(" error description").append(s).toString());
        }
        dfb = ((cua)b).j;
        s1 = ((cua)b).c;
        if (dfb == null || h == null) goto _L2; else goto _L1
_L1:
        aoe1.a();
        String s2;
        ContentValues contentvalues;
        long l1;
        s2 = h;
        long l = d;
        l1 = i;
        if (aoe.a)
        {
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 94 + String.valueOf(dfb).length() + String.valueOf(s2).length())).append("updateMessageId, conversationId ").append(s1).append(", messageClientGeneratedId=").append(dfb).append(", eventId=").append(s2).append(", ts=").append(l).toString());
        }
        contentvalues = new ContentValues();
        contentvalues.put("message_id", s2);
        contentvalues.put("timestamp", Long.valueOf(l));
        if (l1 <= 0L) goto _L4; else goto _L3
_L3:
        contentvalues.put("expiration_timestamp", Long.valueOf(l1));
_L5:
        contentvalues.put("status", Integer.valueOf(dqb.e.ordinal()));
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_388;
        }
        ebw.f("Babel_db", (new StringBuilder(String.valueOf(s2).length() + 58)).append("attempt to update a message id [").append(s2).append("] for null conversation id").toString());
_L6:
        aoe1.b();
        aoe1.c();
_L2:
        aoe1.h(s1, d);
        cej.c(g.nS, aoe1.f().h());
        return;
_L4:
        contentvalues.putNull("expiration_timestamp");
          goto _L5
        dfb;
        aoe1.c();
        throw dfb;
        aoe1.b.a("messages", contentvalues, "message_id=? AND conversation_id=?", new String[] {
            dfb, s1
        });
          goto _L6
    }
}
