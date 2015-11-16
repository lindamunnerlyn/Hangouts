// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.playlog.internal.LogEvent;

public final class fri
    implements android.os.Parcelable.Creator
{

    public fri()
    {
    }

    public static LogEvent a(Parcel parcel)
    {
        long l = 0L;
        android.os.Bundle bundle = null;
        int j = g.a(parcel);
        int i = 0;
        byte abyte0[] = null;
        String s = null;
        long l1 = 0L;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    g.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = g.e(parcel, k);
                    break;

                case 2: // '\002'
                    l1 = g.f(parcel, k);
                    break;

                case 3: // '\003'
                    s = g.i(parcel, k);
                    break;

                case 4: // '\004'
                    abyte0 = g.l(parcel, k);
                    break;

                case 5: // '\005'
                    bundle = g.k(parcel, k);
                    break;

                case 6: // '\006'
                    l = g.f(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LogEvent(i, l1, l, s, abyte0, bundle);
            }
        } while (true);
    }

    public static void a(LogEvent logevent, Parcel parcel)
    {
        int i = g.p(parcel, 20293);
        g.b(parcel, 1, logevent.a);
        g.a(parcel, 2, logevent.b);
        g.a(parcel, 3, logevent.d);
        g.a(parcel, 4, logevent.e);
        g.a(parcel, 5, logevent.f);
        g.a(parcel, 6, logevent.c);
        g.q(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return new LogEvent[i];
    }
}
