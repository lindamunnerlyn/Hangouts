// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.playlog.internal.PlayLoggerContext;

public final class elq
    implements android.os.Parcelable.Creator
{

    public elq()
    {
    }

    public static LogEventParcelable a(Parcel parcel)
    {
        int j = g.a(parcel);
        int ai[] = null;
        byte abyte0[] = null;
        PlayLoggerContext playloggercontext = null;
        int i = 0;
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
                    playloggercontext = (PlayLoggerContext)g.a(parcel, k, PlayLoggerContext.CREATOR);
                    break;

                case 3: // '\003'
                    abyte0 = g.l(parcel, k);
                    break;

                case 4: // '\004'
                    k = g.a(parcel, k);
                    int l = parcel.dataPosition();
                    if (k == 0)
                    {
                        ai = null;
                    } else
                    {
                        ai = parcel.createIntArray();
                        parcel.setDataPosition(k + l);
                    }
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new af((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
                }
                return new LogEventParcelable(i, playloggercontext, abyte0, ai);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return new LogEventParcelable[i];
    }
}
