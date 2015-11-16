// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lhu extends koj
{

    private static volatile lhu f[];
    public Boolean a;
    public lht b;
    public Integer c;
    public String d;
    public lhz e;

    public lhu()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static lhu[] a()
    {
        if (f == null)
        {
            synchronized (kon.a)
            {
                if (f == null)
                {
                    f = new lhu[0];
                }
            }
        }
        return f;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            a.booleanValue();
            i = j + (koh.f(1) + 1);
        }
        j = i;
        if (e != null)
        {
            j = i + koh.d(2, e);
        }
        i = j;
        if (b != null)
        {
            i = j + koh.d(3, b);
        }
        j = i;
        if (c != null)
        {
            j = i + koh.e(4, c.intValue());
        }
        i = j;
        if (d != null)
        {
            i = j + koh.b(5, d);
        }
        return i;
    }

    public kop mergeFrom(kog kog1)
    {
_L8:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 73
    //                   8: 75
    //                   18: 89
    //                   26: 118
    //                   32: 147
    //                   42: 562;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        a = Boolean.valueOf(kog1.i());
          goto _L8
_L4:
        if (e == null)
        {
            e = new lhz();
        }
        kog1.a(e);
          goto _L8
_L5:
        if (b == null)
        {
            b = new lht();
        }
        kog1.a(b);
          goto _L8
_L6:
        int j = kog1.f();
        switch (j)
        {
        case 0: // '\0'
        case 19997403: 
        case 39752029: 
        case 39997403: 
        case 40687070: 
        case 40742409: 
        case 40748352: 
        case 41004086: 
        case 42121930: 
        case 42283483: 
        case 42922426: 
        case 42927174: 
        case 42973762: 
        case 42976986: 
        case 43123456: 
        case 43962470: 
        case 44411671: 
        case 44458334: 
        case 45091485: 
        case 45305931: 
        case 45916904: 
        case 48591739: 
        case 48591830: 
        case 48591920: 
        case 48592003: 
        case 48592164: 
        case 48592239: 
        case 48592306: 
        case 49150953: 
        case 51241253: 
        case 53263312: 
        case 57257173: 
        case 58792500: 
        case 59711768: 
        case 60936852: 
        case 62857615: 
        case 62959766: 
        case 65886225: 
        case 70516243: 
        case 72751461: 
        case 73031374: 
        case 73053971: 
        case 75002836: 
        case 75005721: 
        case 77306139: 
        case 77307489: 
        case 77307817: 
        case 84878627: 
            c = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        d = kog1.j();
        if (true) goto _L8; else goto _L9
_L9:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.booleanValue());
        }
        if (e != null)
        {
            koh1.b(2, e);
        }
        if (b != null)
        {
            koh1.b(3, b);
        }
        if (c != null)
        {
            koh1.a(4, c.intValue());
        }
        if (d != null)
        {
            koh1.a(5, d);
        }
        super.writeTo(koh1);
    }
}
