// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class axy
{

    long a;
    cey b;
    String c;
    String d;
    boolean e;

    private axy()
    {
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("OneOnOneRecipient[");
        stringbuilder.append("attemptedLookup=").append(e).append("|");
        stringbuilder.append("contactId=").append(a).append("|");
        stringbuilder.append("participantId=").append(b).append("|");
        stringbuilder.append("dataId=").append(c).append("]");
        return stringbuilder.toString();
    }
}
