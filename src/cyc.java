// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;

class cyc extends cxr
{

    private static final long serialVersionUID = 1L;
    public final String h;
    public final long i;

    public cyc(jdl jdl, long l, long l1, String s)
    {
        super(jdl, l);
        h = s;
        i = l1;
    }

    public void a(aow aow1, dgk dgk)
    {
        String s1;
        super.a(aow1, dgk);
        if (eev.a("Babel", 3))
        {
            dgk = String.valueOf("processEventResponse response status: ");
            int j = c.b;
            String s = c.a;
            eev.d("Babel", (new StringBuilder(String.valueOf(dgk).length() + 29 + String.valueOf(s).length())).append(dgk).append(j).append(" error description").append(s).toString());
        }
        dgk = ((cwe)b).j;
        s1 = ((cwe)b).c;
        if (dgk == null || h == null) goto _L2; else goto _L1
_L1:
        aow1.a();
        String s2;
        ContentValues contentvalues;
        long l1;
        s2 = h;
        long l = d;
        l1 = i;
        if (aow.a)
        {
            eev.b("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 94 + String.valueOf(dgk).length() + String.valueOf(s2).length())).append("updateMessageId, conversationId ").append(s1).append(", messageClientGeneratedId=").append(dgk).append(", eventId=").append(s2).append(", ts=").append(l).toString());
        }
        contentvalues = new ContentValues();
        contentvalues.put("message_id", s2);
        contentvalues.put("timestamp", Long.valueOf(l));
        if (l1 <= 0L) goto _L4; else goto _L3
_L3:
        contentvalues.put("expiration_timestamp", Long.valueOf(l1));
_L5:
        contentvalues.put("status", Integer.valueOf(dsu.e.ordinal()));
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_388;
        }
        eev.f("Babel_db", (new StringBuilder(String.valueOf(s2).length() + 58)).append("attempt to update a message id [").append(s2).append("] for null conversation id").toString());
_L6:
        aow1.b();
        aow1.c();
_L2:
        aow1.g(s1, d);
        cfo.c(g.nU, aow1.f().h());
        return;
_L4:
        contentvalues.putNull("expiration_timestamp");
          goto _L5
        dgk;
        aow1.c();
        throw dgk;
        aow1.b.a("messages", contentvalues, "message_id=? AND conversation_id=?", new String[] {
            dgk, s1
        });
          goto _L6
    }
}
