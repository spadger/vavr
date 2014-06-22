/**                       ___ __          ,                   ___                                
 *  __ ___ _____  _______/  /  / ______  / \_   ______ ______/__/_____  ______  _______ _____    
 * /  '__/'  _  \/   ___/      \/   "__\/  _/__/ ____/'  ___/  /   "__\/   ,  \/   ___/'  "__\   
 * \__/  \______/\______\__/___/\______/\___/\_____/ \______\_/\______/\__/___/\______\______/.io
 * Licensed under the Apache License, Version 2.0. Copyright 2014 Daniel Dietrich.
 */
package javaslang.lang;

import java.util.Objects;

public class Tuples {

	public static Tuple0 t() {
		return Tuple0.instance();
	}

	public static <T> Tuple1<T> t(T t) {
		return new Tuple1<>(t);
	}

	public static <T1, T2> Tuple2<T1, T2> t(T1 t1, T2 t2) {
		return new Tuple2<>(t1, t2);
	}

	public static <T1, T2, T3> Tuple3<T1, T2, T3> t(T1 t1, T2 t2, T3 t3) {
		return new Tuple3<>(t1, t2, t3);
	}

	public static <T1, T2, T3, T4> Tuple4<T1, T2, T3, T4> t(T1 t1, T2 t2, T3 t3, T4 t4) {
		return new Tuple4<>(t1, t2, t3, t4);
	}

	public static <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5> t(T1 t1, T2 t2, T3 t3, T4 t4,
			T5 t5) {
		return new Tuple5<>(t1, t2, t3, t4, t5);
	}

	public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> t(T1 t1, T2 t2, T3 t3,
			T4 t4, T5 t5, T6 t6) {
		return new Tuple6<>(t1, t2, t3, t4, t5, t6);
	}

	public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> t(T1 t1, T2 t2,
			T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
		return new Tuple7<>(t1, t2, t3, t4, t5, t6, t7);
	}

	public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> t(T1 t1,
			T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
		return new Tuple8<>(t1, t2, t3, t4, t5, t6, t7, t8);
	}

	public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9> t(
			T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9) {
		return new Tuple9<>(t1, t2, t3, t4, t5, t6, t7, t8, t9);
	}

	public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> t(
			T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10) {
		return new Tuple10<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10);
	}

	public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> t(
			T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11) {
		return new Tuple11<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11);
	}

	public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> t(
			T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12) {
		return new Tuple12<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12);
	}

	public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> t(
			T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11,
			T12 t12, T13 t13) {
		return new Tuple13<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13);
	}

	private static String stringify(Object... objects) {
		return Strings.join(objects, ", ", "(", ")");
	}

	public static interface Tuple {
	}

	/**
	 * Implementation of an empty tuple, a tuple containing no elements.
	 */
	public static class Tuple0 implements Tuple {

		/**
		 * The singleton instance of Tuple0.
		 */
		private static final Tuple0 TUPLE0 = new Tuple0();

		/**
		 * Hidden constructor.
		 */
		private Tuple0() {
		}

		/**
		 * Returns the singleton instance of Tuple0.
		 * 
		 * @return The singleton instance of Tuple0.
		 */
		public static Tuple0 instance() {
			return TUPLE0;
		}

		@Override
		public String toString() {
			return Tuples.stringify();
		}
	}

	/**
	 * Implementation of a single, a tuple containing 1 element.
	 */
	public static class Tuple1<T> implements Tuple {
		public final T _1;

		public Tuple1(T t) {
			this._1 = t;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			} else if (o == null || !(o instanceof Tuple1)) {
				return false;
			} else {
				final Tuple1<?> that = (Tuple1<?>) o;
				return Objects.equals(this._1, that._1);
			}
		}

		@Override
		public int hashCode() {
			return Objects.hash(_1);
		}

		@Override
		public String toString() {
			return Tuples.stringify(_1);
		}
	}

	/**
	 * Implementation of a pair, a tuple containing 2 elements.
	 */
	public static class Tuple2<T1, T2> implements Tuple {
		public final T1 _1;
		public final T2 _2;

		public Tuple2(T1 t1, T2 t2) {
			this._1 = t1;
			this._2 = t2;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			} else if (o == null || !(o instanceof Tuple2)) {
				return false;
			} else {
				final Tuple2<?, ?> that = (Tuple2<?, ?>) o;
				return Objects.equals(this._1, that._1) && Objects.equals(this._2, that._2);
			}
		}

		@Override
		public int hashCode() {
			return Objects.hash(_1, _2);
		}

		@Override
		public String toString() {
			return Tuples.stringify(_1, _2);
		}
	}

	/**
	 * Implementation of a triple, a tuple containing 3 elements.
	 */
	public static class Tuple3<T1, T2, T3> implements Tuple {
		public final T1 _1;
		public final T2 _2;
		public final T3 _3;

		public Tuple3(T1 t1, T2 t2, T3 t3) {
			this._1 = t1;
			this._2 = t2;
			this._3 = t3;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			} else if (o == null || !(o instanceof Tuple3)) {
				return false;
			} else {
				final Tuple3<?, ?, ?> that = (Tuple3<?, ?, ?>) o;
				return Objects.equals(this._1, that._1)//
						&& Objects.equals(this._2, that._2)//
						&& Objects.equals(this._3, that._3);
			}
		}

		@Override
		public int hashCode() {
			return Objects.hash(_1, _2, _3);
		}

		@Override
		public String toString() {
			return Tuples.stringify(_1, _2, _3);
		}
	}

	/**
	 * Implementation of a quadruple, a tuple containing 4 elements.
	 */
	public static class Tuple4<T1, T2, T3, T4> implements Tuple {
		public final T1 _1;
		public final T2 _2;
		public final T3 _3;
		public final T4 _4;

		public Tuple4(T1 t1, T2 t2, T3 t3, T4 t4) {
			this._1 = t1;
			this._2 = t2;
			this._3 = t3;
			this._4 = t4;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			} else if (o == null || !(o instanceof Tuple4)) {
				return false;
			} else {
				final Tuple4<?, ?, ?, ?> that = (Tuple4<?, ?, ?, ?>) o;
				return Objects.equals(this._1, that._1)//
						&& Objects.equals(this._2, that._2)//
						&& Objects.equals(this._3, that._3)//
						&& Objects.equals(this._4, that._4);
			}
		}

		@Override
		public int hashCode() {
			return Objects.hash(_1, _2, _3, _4);
		}

		@Override
		public String toString() {
			return Tuples.stringify(_1, _2, _3, _4);
		}
	}

	/**
	 * Implementation of a quintuple, a tuple containing 5 elements.
	 */
	public static class Tuple5<T1, T2, T3, T4, T5> implements Tuple {
		public final T1 _1;
		public final T2 _2;
		public final T3 _3;
		public final T4 _4;
		public final T5 _5;

		public Tuple5(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
			this._1 = t1;
			this._2 = t2;
			this._3 = t3;
			this._4 = t4;
			this._5 = t5;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			} else if (o == null || !(o instanceof Tuple5)) {
				return false;
			} else {
				final Tuple5<?, ?, ?, ?, ?> that = (Tuple5<?, ?, ?, ?, ?>) o;
				return Objects.equals(this._1, that._1)//
						&& Objects.equals(this._2, that._2)//
						&& Objects.equals(this._3, that._3)//
						&& Objects.equals(this._4, that._4)//
						&& Objects.equals(this._5, that._5);
			}
		}

		@Override
		public int hashCode() {
			return Objects.hash(_1, _2, _3, _4, _5);
		}

		@Override
		public String toString() {
			return Tuples.stringify(_1, _2, _3, _4, _5);
		}
	}

	/**
	 * Implementation of a sextuple, a tuple containing 6 elements.
	 */
	public static class Tuple6<T1, T2, T3, T4, T5, T6> implements Tuple {
		public final T1 _1;
		public final T2 _2;
		public final T3 _3;
		public final T4 _4;
		public final T5 _5;
		public final T6 _6;

		public Tuple6(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
			this._1 = t1;
			this._2 = t2;
			this._3 = t3;
			this._4 = t4;
			this._5 = t5;
			this._6 = t6;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			} else if (o == null || !(o instanceof Tuple6)) {
				return false;
			} else {
				final Tuple6<?, ?, ?, ?, ?, ?> that = (Tuple6<?, ?, ?, ?, ?, ?>) o;
				return Objects.equals(this._1, that._1)//
						&& Objects.equals(this._2, that._2)//
						&& Objects.equals(this._3, that._3)//
						&& Objects.equals(this._4, that._4)//
						&& Objects.equals(this._5, that._5)//
						&& Objects.equals(this._6, that._6);
			}
		}

		@Override
		public int hashCode() {
			return Objects.hash(_1, _2, _3, _4, _5, _6);
		}

		@Override
		public String toString() {
			return Tuples.stringify(_1, _2, _3, _4, _5, _6);
		}
	}

	/**
	 * Implementation of a septuple, a tuple containing 7 elements.
	 */
	public static class Tuple7<T1, T2, T3, T4, T5, T6, T7> implements Tuple {
		public final T1 _1;
		public final T2 _2;
		public final T3 _3;
		public final T4 _4;
		public final T5 _5;
		public final T6 _6;
		public final T7 _7;

		public Tuple7(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
			this._1 = t1;
			this._2 = t2;
			this._3 = t3;
			this._4 = t4;
			this._5 = t5;
			this._6 = t6;
			this._7 = t7;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			} else if (o == null || !(o instanceof Tuple7)) {
				return false;
			} else {
				final Tuple7<?, ?, ?, ?, ?, ?, ?> that = (Tuple7<?, ?, ?, ?, ?, ?, ?>) o;
				return Objects.equals(this._1, that._1)//
						&& Objects.equals(this._2, that._2)//
						&& Objects.equals(this._3, that._3)//
						&& Objects.equals(this._4, that._4)//
						&& Objects.equals(this._5, that._5)//
						&& Objects.equals(this._6, that._6)//
						&& Objects.equals(this._7, that._7);
			}
		}

		@Override
		public int hashCode() {
			return Objects.hash(_1, _2, _3, _4, _5, _6, _7);
		}

		@Override
		public String toString() {
			return Tuples.stringify(_1, _2, _3, _4, _5, _6, _7);
		}
	}

	/**
	 * Implementation of a octuple, a tuple containing 8 elements.
	 */
	public static class Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> implements Tuple {
		public final T1 _1;
		public final T2 _2;
		public final T3 _3;
		public final T4 _4;
		public final T5 _5;
		public final T6 _6;
		public final T7 _7;
		public final T8 _8;

		public Tuple8(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
			this._1 = t1;
			this._2 = t2;
			this._3 = t3;
			this._4 = t4;
			this._5 = t5;
			this._6 = t6;
			this._7 = t7;
			this._8 = t8;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			} else if (o == null || !(o instanceof Tuple8)) {
				return false;
			} else {
				final Tuple8<?, ?, ?, ?, ?, ?, ?, ?> that = (Tuple8<?, ?, ?, ?, ?, ?, ?, ?>) o;
				return Objects.equals(this._1, that._1)//
						&& Objects.equals(this._2, that._2)//
						&& Objects.equals(this._3, that._3)//
						&& Objects.equals(this._4, that._4)//
						&& Objects.equals(this._5, that._5)//
						&& Objects.equals(this._6, that._6)//
						&& Objects.equals(this._7, that._7)//
						&& Objects.equals(this._8, that._8);
			}
		}

		@Override
		public int hashCode() {
			return Objects.hash(_1, _2, _3, _4, _5, _6, _7, _8);
		}

		@Override
		public String toString() {
			return Tuples.stringify(_1, _2, _3, _4, _5, _6, _7, _8);
		}
	}

	/**
	 * Implementation of a nonuple, a tuple containing 9 elements.
	 */
	public static class Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9> implements Tuple {
		public final T1 _1;
		public final T2 _2;
		public final T3 _3;
		public final T4 _4;
		public final T5 _5;
		public final T6 _6;
		public final T7 _7;
		public final T8 _8;
		public final T9 _9;

		public Tuple9(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9) {
			this._1 = t1;
			this._2 = t2;
			this._3 = t3;
			this._4 = t4;
			this._5 = t5;
			this._6 = t6;
			this._7 = t7;
			this._8 = t8;
			this._9 = t9;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			} else if (o == null || !(o instanceof Tuple9)) {
				return false;
			} else {
				final Tuple9<?, ?, ?, ?, ?, ?, ?, ?, ?> that = (Tuple9<?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
				return Objects.equals(this._1, that._1)//
						&& Objects.equals(this._2, that._2)//
						&& Objects.equals(this._3, that._3)//
						&& Objects.equals(this._4, that._4)//
						&& Objects.equals(this._5, that._5)//
						&& Objects.equals(this._6, that._6)//
						&& Objects.equals(this._7, that._7)//
						&& Objects.equals(this._8, that._8)//
						&& Objects.equals(this._9, that._9);
			}
		}

		@Override
		public int hashCode() {
			return Objects.hash(_1, _2, _3, _4, _5, _6, _7, _8, _9);
		}

		@Override
		public String toString() {
			return Tuples.stringify(_1, _2, _3, _4, _5, _6, _7, _8, _9);
		}
	}

	/**
	 * Implementation of a decuple, a tuple containing 10 elements.
	 */
	public static class Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> implements Tuple {
		public final T1 _1;
		public final T2 _2;
		public final T3 _3;
		public final T4 _4;
		public final T5 _5;
		public final T6 _6;
		public final T7 _7;
		public final T8 _8;
		public final T9 _9;
		public final T10 _10;

		public Tuple10(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10) {
			this._1 = t1;
			this._2 = t2;
			this._3 = t3;
			this._4 = t4;
			this._5 = t5;
			this._6 = t6;
			this._7 = t7;
			this._8 = t8;
			this._9 = t9;
			this._10 = t10;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			} else if (o == null || !(o instanceof Tuple10)) {
				return false;
			} else {
				final Tuple10<?, ?, ?, ?, ?, ?, ?, ?, ?, ?> that = (Tuple10<?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
				return Objects.equals(this._1, that._1)//
						&& Objects.equals(this._2, that._2)//
						&& Objects.equals(this._3, that._3)//
						&& Objects.equals(this._4, that._4)//
						&& Objects.equals(this._5, that._5)//
						&& Objects.equals(this._6, that._6)//
						&& Objects.equals(this._7, that._7)//
						&& Objects.equals(this._8, that._8)//
						&& Objects.equals(this._9, that._9)//
						&& Objects.equals(this._10, that._10);
			}
		}

		@Override
		public int hashCode() {
			return Objects.hash(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10);
		}

		@Override
		public String toString() {
			return Tuples.stringify(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10);
		}
	}

	/**
	 * Implementation of a undecuple, a tuple containing 11 elements.
	 */
	public static class Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> implements Tuple {
		public final T1 _1;
		public final T2 _2;
		public final T3 _3;
		public final T4 _4;
		public final T5 _5;
		public final T6 _6;
		public final T7 _7;
		public final T8 _8;
		public final T9 _9;
		public final T10 _10;
		public final T11 _11;

		public Tuple11(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10,
				T11 t11) {
			this._1 = t1;
			this._2 = t2;
			this._3 = t3;
			this._4 = t4;
			this._5 = t5;
			this._6 = t6;
			this._7 = t7;
			this._8 = t8;
			this._9 = t9;
			this._10 = t10;
			this._11 = t11;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			} else if (o == null || !(o instanceof Tuple11)) {
				return false;
			} else {
				final Tuple11<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> that = (Tuple11<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
				return Objects.equals(this._1, that._1)//
						&& Objects.equals(this._2, that._2)//
						&& Objects.equals(this._3, that._3)//
						&& Objects.equals(this._4, that._4)//
						&& Objects.equals(this._5, that._5)//
						&& Objects.equals(this._6, that._6)//
						&& Objects.equals(this._7, that._7)//
						&& Objects.equals(this._8, that._8)//
						&& Objects.equals(this._9, that._9)//
						&& Objects.equals(this._10, that._10)//
						&& Objects.equals(this._11, that._11);
			}
		}

		@Override
		public int hashCode() {
			return Objects.hash(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11);
		}

		@Override
		public String toString() {
			return Tuples.stringify(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11);
		}
	}

	/**
	 * Implementation of a duodecuple, a tuple containing 12 elements.
	 */
	public static class Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> implements Tuple {
		public final T1 _1;
		public final T2 _2;
		public final T3 _3;
		public final T4 _4;
		public final T5 _5;
		public final T6 _6;
		public final T7 _7;
		public final T8 _8;
		public final T9 _9;
		public final T10 _10;
		public final T11 _11;
		public final T12 _12;

		public Tuple12(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10,
				T11 t11, T12 t12) {
			this._1 = t1;
			this._2 = t2;
			this._3 = t3;
			this._4 = t4;
			this._5 = t5;
			this._6 = t6;
			this._7 = t7;
			this._8 = t8;
			this._9 = t9;
			this._10 = t10;
			this._11 = t11;
			this._12 = t12;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			} else if (o == null || !(o instanceof Tuple12)) {
				return false;
			} else {
				final Tuple12<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> that = (Tuple12<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
				return Objects.equals(this._1, that._1)//
						&& Objects.equals(this._2, that._2)//
						&& Objects.equals(this._3, that._3)//
						&& Objects.equals(this._4, that._4)//
						&& Objects.equals(this._5, that._5)//
						&& Objects.equals(this._6, that._6)//
						&& Objects.equals(this._7, that._7)//
						&& Objects.equals(this._8, that._8)//
						&& Objects.equals(this._9, that._9)//
						&& Objects.equals(this._10, that._10)//
						&& Objects.equals(this._11, that._11)//
						&& Objects.equals(this._12, that._12);
			}
		}

		@Override
		public int hashCode() {
			return Objects.hash(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12);
		}

		@Override
		public String toString() {
			return Tuples.stringify(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12);
		}
	}

	/**
	 * Implementation of a tredecuple, a tuple containing 13 elements.
	 */
	public static class Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> implements
			Tuple {
		public final T1 _1;
		public final T2 _2;
		public final T3 _3;
		public final T4 _4;
		public final T5 _5;
		public final T6 _6;
		public final T7 _7;
		public final T8 _8;
		public final T9 _9;
		public final T10 _10;
		public final T11 _11;
		public final T12 _12;
		public final T13 _13;

		public Tuple13(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10,
				T11 t11, T12 t12, T13 t13) {
			this._1 = t1;
			this._2 = t2;
			this._3 = t3;
			this._4 = t4;
			this._5 = t5;
			this._6 = t6;
			this._7 = t7;
			this._8 = t8;
			this._9 = t9;
			this._10 = t10;
			this._11 = t11;
			this._12 = t12;
			this._13 = t13;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			} else if (o == null || !(o instanceof Tuple13)) {
				return false;
			} else {
				final Tuple13<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> that = (Tuple13<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
				return Objects.equals(this._1, that._1)//
						&& Objects.equals(this._2, that._2)//
						&& Objects.equals(this._3, that._3)//
						&& Objects.equals(this._4, that._4)//
						&& Objects.equals(this._5, that._5)//
						&& Objects.equals(this._6, that._6)//
						&& Objects.equals(this._7, that._7)//
						&& Objects.equals(this._8, that._8)//
						&& Objects.equals(this._9, that._9)//
						&& Objects.equals(this._10, that._10)//
						&& Objects.equals(this._11, that._11)//
						&& Objects.equals(this._12, that._12)//
						&& Objects.equals(this._13, that._13);
			}
		}

		@Override
		public int hashCode() {
			return Objects.hash(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13);
		}

		@Override
		public String toString() {
			return Tuples.stringify(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13);
		}
	}
	
}
