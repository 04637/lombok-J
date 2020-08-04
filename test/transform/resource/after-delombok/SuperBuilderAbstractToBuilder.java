public class SuperBuilderAbstractToBuilder {
	public static class Parent {
		int parentField;
		@java.lang.SuppressWarnings("all")
		public static abstract class ParentBuilder<C extends SuperBuilderAbstractToBuilder.Parent, B extends SuperBuilderAbstractToBuilder.Parent.ParentBuilder<C, B>> {
			@java.lang.SuppressWarnings("all")
			private int parentField;
			@java.lang.SuppressWarnings("all")
			protected B $fillValuesFrom(final C instance) {
				SuperBuilderAbstractToBuilder.Parent.ParentBuilder.$fillValuesFromInstanceIntoBuilder(instance, this);
				return self();
			}
			@java.lang.SuppressWarnings("all")
			private static void $fillValuesFromInstanceIntoBuilder(final SuperBuilderAbstractToBuilder.Parent instance, final SuperBuilderAbstractToBuilder.Parent.ParentBuilder<?, ?> b) {
				b.parentField(instance.parentField);
			}
			@java.lang.SuppressWarnings("all")
			protected abstract B self();
			@java.lang.SuppressWarnings("all")
			public abstract C build();
			@java.lang.SuppressWarnings("all")
			public B parentField(final int parentField) {
				this.parentField = parentField;
				return self();
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			public java.lang.String toString() {
				return "SuperBuilderAbstractToBuilder.Parent.ParentBuilder(parentField=" + this.parentField + ")";
			}
		}
		@java.lang.SuppressWarnings("all")
		private static final class ParentBuilderImpl extends SuperBuilderAbstractToBuilder.Parent.ParentBuilder<SuperBuilderAbstractToBuilder.Parent, SuperBuilderAbstractToBuilder.Parent.ParentBuilderImpl> {
			@java.lang.SuppressWarnings("all")
			private ParentBuilderImpl() {
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			protected SuperBuilderAbstractToBuilder.Parent.ParentBuilderImpl self() {
				return this;
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			public SuperBuilderAbstractToBuilder.Parent build() {
				return new SuperBuilderAbstractToBuilder.Parent(this);
			}
		}
		@java.lang.SuppressWarnings("all")
		protected Parent(final SuperBuilderAbstractToBuilder.Parent.ParentBuilder<?, ?> b) {
			this.parentField = b.parentField;
		}
		@java.lang.SuppressWarnings("all")
		public static SuperBuilderAbstractToBuilder.Parent.ParentBuilder<?, ?> builder() {
			return new SuperBuilderAbstractToBuilder.Parent.ParentBuilderImpl();
		}
		@java.lang.SuppressWarnings("all")
		public SuperBuilderAbstractToBuilder.Parent.ParentBuilder<?, ?> toBuilder() {
			return new SuperBuilderAbstractToBuilder.Parent.ParentBuilderImpl().$fillValuesFrom(this);
		}
	}
	public static abstract class Child extends Parent {
		double childField;
		@java.lang.SuppressWarnings("all")
		public static abstract class ChildBuilder<C extends SuperBuilderAbstractToBuilder.Child, B extends SuperBuilderAbstractToBuilder.Child.ChildBuilder<C, B>> extends Parent.ParentBuilder<C, B> {
			@java.lang.SuppressWarnings("all")
			private double childField;
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			protected B $fillValuesFrom(final C instance) {
				super.$fillValuesFrom(instance);
				SuperBuilderAbstractToBuilder.Child.ChildBuilder.$fillValuesFromInstanceIntoBuilder(instance, this);
				return self();
			}
			@java.lang.SuppressWarnings("all")
			private static void $fillValuesFromInstanceIntoBuilder(final SuperBuilderAbstractToBuilder.Child instance, final SuperBuilderAbstractToBuilder.Child.ChildBuilder<?, ?> b) {
				b.childField(instance.childField);
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			protected abstract B self();
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			public abstract C build();
			@java.lang.SuppressWarnings("all")
			public B childField(final double childField) {
				this.childField = childField;
				return self();
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			public java.lang.String toString() {
				return "SuperBuilderAbstractToBuilder.Child.ChildBuilder(super=" + super.toString() + ", childField=" + this.childField + ")";
			}
		}
		@java.lang.SuppressWarnings("all")
		protected Child(final SuperBuilderAbstractToBuilder.Child.ChildBuilder<?, ?> b) {
			super(b);
			this.childField = b.childField;
		}
	}
	public static class GrandChild extends Child {
		String grandChildField;
		@java.lang.SuppressWarnings("all")
		public static abstract class GrandChildBuilder<C extends SuperBuilderAbstractToBuilder.GrandChild, B extends SuperBuilderAbstractToBuilder.GrandChild.GrandChildBuilder<C, B>> extends Child.ChildBuilder<C, B> {
			@java.lang.SuppressWarnings("all")
			private String grandChildField;
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			protected B $fillValuesFrom(final C instance) {
				super.$fillValuesFrom(instance);
				SuperBuilderAbstractToBuilder.GrandChild.GrandChildBuilder.$fillValuesFromInstanceIntoBuilder(instance, this);
				return self();
			}
			@java.lang.SuppressWarnings("all")
			private static void $fillValuesFromInstanceIntoBuilder(final SuperBuilderAbstractToBuilder.GrandChild instance, final SuperBuilderAbstractToBuilder.GrandChild.GrandChildBuilder<?, ?> b) {
				b.grandChildField(instance.grandChildField);
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			protected abstract B self();
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			public abstract C build();
			@java.lang.SuppressWarnings("all")
			public B grandChildField(final String grandChildField) {
				this.grandChildField = grandChildField;
				return self();
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			public java.lang.String toString() {
				return "SuperBuilderAbstractToBuilder.GrandChild.GrandChildBuilder(super=" + super.toString() + ", grandChildField=" + this.grandChildField + ")";
			}
		}
		@java.lang.SuppressWarnings("all")
		private static final class GrandChildBuilderImpl extends SuperBuilderAbstractToBuilder.GrandChild.GrandChildBuilder<SuperBuilderAbstractToBuilder.GrandChild, SuperBuilderAbstractToBuilder.GrandChild.GrandChildBuilderImpl> {
			@java.lang.SuppressWarnings("all")
			private GrandChildBuilderImpl() {
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			protected SuperBuilderAbstractToBuilder.GrandChild.GrandChildBuilderImpl self() {
				return this;
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			public SuperBuilderAbstractToBuilder.GrandChild build() {
				return new SuperBuilderAbstractToBuilder.GrandChild(this);
			}
		}
		@java.lang.SuppressWarnings("all")
		protected GrandChild(final SuperBuilderAbstractToBuilder.GrandChild.GrandChildBuilder<?, ?> b) {
			super(b);
			this.grandChildField = b.grandChildField;
		}
		@java.lang.SuppressWarnings("all")
		public static SuperBuilderAbstractToBuilder.GrandChild.GrandChildBuilder<?, ?> builder() {
			return new SuperBuilderAbstractToBuilder.GrandChild.GrandChildBuilderImpl();
		}
		@java.lang.SuppressWarnings("all")
		public SuperBuilderAbstractToBuilder.GrandChild.GrandChildBuilder<?, ?> toBuilder() {
			return new SuperBuilderAbstractToBuilder.GrandChild.GrandChildBuilderImpl().$fillValuesFrom(this);
		}
	}
	public static void test() {
		GrandChild x = GrandChild.builder().grandChildField("").parentField(5).childField(2.5).build().toBuilder().build();
	}
}
