// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gdr
{

    public final gjt a;
    public final gjx b;
    public final gka c;
    public final gkd d;
    public final gkg e;

    public gdr(gjw gjw, gjl gjl)
    {
        c = new gka(gjw, gjl);
        d = new gkd(gjw, gjl);
        e = new gkg(gjw, gjl);
        a = new gjt(gjw, gjl);
        b = new gjx(gjw, gjl);
    }

    public gdo a(Class class1)
    {
        if (class1 == gdi)
        {
            return c;
        }
        if (class1 == gdk)
        {
            return d;
        }
        if (class1 == gdm)
        {
            return e;
        }
        if (class1 == gde)
        {
            return a;
        }
        if (class1 == gdg)
        {
            return b;
        }
        class1 = String.valueOf(class1.getSimpleName());
        if (class1.length() != 0)
        {
            class1 = "Unrecognized collection type ".concat(class1);
        } else
        {
            class1 = new String("Unrecognized collection type ");
        }
        throw new IllegalArgumentException(class1);
    }

    public void a(int i, int j, byte abyte0[])
    {
        Object obj;
        gka gka1;
        Object obj1;
        Object obj2;
        Object obj3;
        gka1 = null;
        obj1 = null;
        obj2 = null;
        obj3 = null;
        obj = null;
        i;
        JVM INSTR tableswitch 0 4: default 52
    //                   0 79
    //                   1 128
    //                   2 167
    //                   3 206
    //                   4 245;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L2:
        gka1 = c;
        if (abyte0 != null) goto _L8; else goto _L7
_L7:
        abyte0 = ((byte []) (obj));
_L9:
        gka1.a(j, abyte0);
        return;
_L1:
        try
        {
            gne.a("vclib", (new StringBuilder(35)).append("Unknown collection type ").append(i).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            gne.b("vclib", "Unable to parse proto from bytes", abyte0);
        }
        return;
_L8:
        abyte0 = (jhc)kws.mergeFrom(new jhc(), abyte0);
          goto _L9
_L3:
        obj = d;
        if (abyte0 != null) goto _L11; else goto _L10
_L10:
        abyte0 = gka1;
_L12:
        ((gkd) (obj)).a(j, abyte0);
        return;
_L11:
        abyte0 = (jhh)kws.mergeFrom(new jhh(), abyte0);
          goto _L12
_L4:
        obj = e;
        if (abyte0 != null) goto _L14; else goto _L13
_L13:
        abyte0 = obj1;
_L15:
        ((gkg) (obj)).a(j, abyte0);
        return;
_L14:
        abyte0 = (jiz)kws.mergeFrom(new jiz(), abyte0);
          goto _L15
_L5:
        obj = a;
        if (abyte0 != null) goto _L17; else goto _L16
_L16:
        abyte0 = obj2;
_L18:
        ((gjt) (obj)).a(j, abyte0);
        return;
_L17:
        abyte0 = (jgc)kws.mergeFrom(new jgc(), abyte0);
          goto _L18
_L6:
        obj = b;
        if (abyte0 != null) goto _L20; else goto _L19
_L19:
        abyte0 = obj3;
_L22:
        ((gjx) (obj)).a(j, abyte0);
        return;
_L20:
        abyte0 = (jgv)kws.mergeFrom(new jgv(), abyte0);
        if (true) goto _L22; else goto _L21
_L21:
    }

    public void a(String s)
    {
        d.a(s);
    }
}
